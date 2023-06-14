package classes;

import java.util.Iterator;
import java.util.List;


// created for correct class iteration
public class studentGroupIterator implements Iterator<student>{
    private int counter; // for correct class iteration
    private final List<student> students; // for correct class iteration
    
    /** Abstract Java class constructor
     * @param students - students list
     * @param counter - start point
     */
    public studentGroupIterator(List<student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override // check for exceeding the length of the array, return "TRUE" if ok
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override // iterate 
    public student next() {
        if(!hasNext()) return null;
        return students.get(counter++);
    }
}
