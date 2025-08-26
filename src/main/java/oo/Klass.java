package oo;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer id;
    private Student leader;
    private List<LeaderAssignObverse> leaderAssignObverses = new ArrayList<>();

    public Student getLeader() {
        return leader;
    }

    public Klass(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void attach(LeaderAssignObverse leaderAssignObverse){
        this.leaderAssignObverses.add(leaderAssignObverse);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Klass klass = (Klass) obj;
        return id == klass.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public void assignLeader(Student tom) {
        if (tom.isIn(this)) {
            this.leader = tom;
            for(LeaderAssignObverse leaderAssignObverse: leaderAssignObverses){
                leaderAssignObverse.onLeaderAssign(tom,this);
            }
        }else{
            System.out.println("It is not one of us.");
        }
    }

    public boolean isLeader(Student tom) {
        if (this.leader == null) {
            return false;
        }
        if (this.leader.equals(tom)) {
            return true;
        }
        return false;
    }
}
