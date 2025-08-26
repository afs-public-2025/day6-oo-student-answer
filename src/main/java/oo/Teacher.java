package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person implements LeaderAssignObverse{
    private List<Klass> klasses = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher. I teach Class %s."
                , getName()
                , getAge()
                , klasses.stream().map(klass -> klass.getId().toString()).collect(Collectors.joining(", ")));
    }
//    My name is Jerry. I am 21 years old. I am a teacher. I teach Class 1.

    public void assignTo(Klass klass) {
        this.klasses.add(klass);
        klass.attach(this);
    }

    public boolean belongsTo(Klass klass) {
        for (Klass klassTmp : klasses) {
            if (klassTmp.equals(klass)) return true;
        }
        return false;
    }

    public boolean isTeaching(Student tom) {
        for (Klass klassTmp : klasses) {
            if (klassTmp.equals(tom.getKlass())) return true;
        }
        return false;
    }

    @Override
    public void onLeaderAssign(Student student, Klass klass) {
//        I am Jerry, teacher of Class 2. I know Tom become Leader.
        if (this.klasses.contains(klass)){
            System.out.println(String.format("I am %s, teacher of Class %d. I know %s become Leader.", this.getName(), klass.getId(), student.getName()));
        }
    }
}
