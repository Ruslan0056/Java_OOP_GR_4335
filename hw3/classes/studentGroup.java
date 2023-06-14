package classes;

import java.util.Iterator;
import java.util.List;


public class studentGroup implements Iterable<student>, Comparable <studentGroup> {
    private String name; // to form a database of student groups
    private List<student> students; // to form a database of student groups
    private int id; // to form a database of student groups
    
    
    /**Abstract Java class constructor
     * @param students - students list
     * @param name - name group
     * @param id - uniq id group
     */
    public studentGroup(List<student> students, String name, int id) {
        this.students = students;
        this.name = name;
        this.id = id;
    }
    
    /**
     * @return name group
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param name - set name group
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return uniq id group
     */
    public int getId() {
        return id;
    }

    /**
     * @param id - set uniq id group
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * @return students list
     */
    public List<student> getStudents() {
        return students;
    }

    /**
     * @param students - students list
     */
    public void setStudents(List<student> students) {
        this.students = students;
    }



    // @Override
    // public Iterator<student> iterator() {
    //     return new studentGroupIterator(students);
    // }

    @Override // for correct class iteration
    public Iterator<student> iterator() {
        return new Iterator<student>() {
            private int index = 0;

            @Override // check for exceeding the length of the array, return "TRUE" if ok
            public boolean hasNext() {
                return index < students.size();
            }

            @Override // iterate 
            public student next() {
                if(!hasNext()) return null;
                return students.get(index++);
            }

        };
    }

    @Override // for correct multi-stage data sorting
    public int compareTo(studentGroup o) {
        if (students.size() == o.getStudents().size()) {
            if (id == o.getId()) return 0;
            if (id > o.getId()) return -1;
            return 1;
        }             
        if (students.size() < o.getStudents().size()) return -1;
        return 1;

    }

    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "\nGroup " + name + " " + id + ", numbers of students " + students.size() + ".\n" + "List of studens:\n" + students;
    }
    
    
}
