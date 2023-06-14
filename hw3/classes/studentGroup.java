package classes;

import java.util.Iterator;
import java.util.List;


public class studentGroup implements Iterable<student>, Comparable <studentGroup> {
    private String name;   
    private List<student> students;
    private int id;
    
    
    public studentGroup(List<student> students, String name, int id) {
        this.students = students;
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }



    // @Override
    // public Iterator<student> iterator() {
    //     return new studentGroupIterator(students);
    // }

    @Override
    public Iterator<student> iterator() {
        return new Iterator<student>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public student next() {
                if(!hasNext()) return null;
                return students.get(index++);
            }

        };
    }

    @Override
    public int compareTo(studentGroup o) {
        if (students.size() == o.getStudents().size()) {
            if (id == o.getId()) return 0;
            if (id > o.getId()) return -1;
            return 1;
        }             
        if (students.size() < o.getStudents().size()) return -1;
        return 1;

    }

    @Override
    public String toString() {
        return "\nGroup " + name + " " + id + ", numbers of students " + students.size() + ".\n" + "List of studens:\n" + students;
    }
    
    
}
