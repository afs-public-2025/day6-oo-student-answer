package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private final int number;
    private Student leader;
    private final List<AssignLeaderObserver> assignLeaderOverseers = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public void assignLeader(Student student) {
        if (!student.isIn(this)) {
            throw new RuntimeException("It is not one of us.");
        }
        this.leader = student;
        for (AssignLeaderObserver observer : assignLeaderOverseers) {
            if (!observer.equals(student)) {
                observer.notifyAssignLeader(this);
            }
        }
    }

    public boolean isLeader(Student student) {
        return student.equals(leader);
    }

    public String getLeaderName() {
        return leader.getName();
    }

    public void attachAssignLeaderObserver(AssignLeaderObserver observer) {
        assignLeaderOverseers.add(observer);
    }
}
