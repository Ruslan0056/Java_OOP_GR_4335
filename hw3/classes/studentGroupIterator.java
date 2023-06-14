package classes;

import java.util.Iterator;
import java.util.List;

public class studentGroupIterator implements Iterator<student>{
    private int counter;
    private final List<student> students;
    
    public studentGroupIterator(List<student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    
    }

    @Override
    public student next() {
        if(!hasNext()) return null;
        return students.get(counter++);
    }
}
