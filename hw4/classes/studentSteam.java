package classes;

import java.util.Iterator;
import java.util.List;

public class studentSteam implements Iterable <studentGroup>{
    private int idSteam;
    private List<studentGroup> groups;
    
    public studentSteam(int idSteam, List<studentGroup> groups) {
        this.idSteam = idSteam;
        this.groups = groups;
    }

    public int getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(int idSteam) {
        this.idSteam = idSteam;
    }

    public List<studentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<studentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<studentGroup> iterator() {
        return new Iterator<studentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public studentGroup next() {
                if(!hasNext()) return null;
                return groups.get(index++);
            }

        };
    }

    @Override
    public String toString() {
        return "Steam " + idSteam + ", numbers of groups " + groups.size() + ".\n" + "Groups:\n" + groups;
    }

    

    
}
