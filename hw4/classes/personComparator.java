package classes;

import java.util.Comparator;

public class personComparator<T extends user> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        int resultComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultComparing == 0) {
            resultComparing = o1.getSecondName().compareTo(o2.getSecondName());
            return resultComparing;
        }
        else{
            return resultComparing;
        }
    }

    
}
