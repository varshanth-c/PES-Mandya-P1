package console.spring.core;

import java.util.List;

public class ProfessorList {
    private List<Professor> active;

    @Override
    public String toString() {
        return "ProfessorList [active=" + active + "]";
    }

    public List<Professor> getActive() {
        return active;
    }

    public void setActive(List<Professor> active) {
        this.active = active;
    }

}
