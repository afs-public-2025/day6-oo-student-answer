package oo;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements AssignLeaderObserver {
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (klasses.isEmpty()) {
            return super.introduce() + " I am a teacher.";
        }
        StringBuilder classNumbers = new StringBuilder();
        for (Klass klass : klasses) {
            if (!classNumbers.isEmpty()) {
                classNumbers.append(", ");
            }
            classNumbers.append(klass.getNumber());
        }
        return super.introduce() + " I am a teacher. I teach class " + classNumbers + ".";
    }

    public void assignTo(Klass klass) {
        this.klasses.add(klass);
        klass.attachAssignLeaderObserver(this);
    }

    public boolean belongsTo(Klass klass) {
        return this.klasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : klasses) {
            if (student.isIn(klass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void notifyAssignLeader(Klass klass) {
        String message = "I am %s, teacher of Class %d. I know %s become Leader."
                .formatted(name, klass.getNumber(), klass.getLeaderName());
        System.out.println(message);
    }
}
