package classes;

import java.util.Iterator;
import java.util.List;

public class studentSteam implements Iterable <studentGroup>{
    private int idSteam; // to form a database of group steams
    private List<studentGroup> groups; // to form a database of group steams
    
    /** Abstract Java class constructor
     * @param idSteam - uniq id steam group
     * @param groups - groups list
     */
    public studentSteam(int idSteam, List<studentGroup> groups) {
        this.idSteam = idSteam;
        this.groups = groups;
    }

     /**
     * @return uniq id steam group
     */
    public int getIdSteam() {
        return idSteam;
    }

     /**
     * @param idSteam - set uniq id steam group
     */
    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }


     /**
     * @return group list
     */
    public List<studentGroup> getGroups() {
        return groups;
    }

     /**
     * @param groups - set group list
     */
    public void setGroups(List<studentGroup> groups) {
        this.groups = groups;
    }

    @Override // for correct class iteration
    public Iterator<studentGroup> iterator() {
        return new Iterator<studentGroup>() {
            private int index = 0;

            @Override  // check for exceeding the length of the array, return "TRUE" if ok
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override  // iterate
            public studentGroup next() {
                if(!hasNext()) return null;
                return groups.get(index++);
            }

        };
    }

    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "Steam " + idSteam + ", numbers of groups " + groups.size() + ".\n" + "Groups:\n" + groups;
    }

    

    
}
