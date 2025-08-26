package oo;

public class Student extends Person implements LeaderAssignObverse{
    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        Boolean isLeader = this.klass.getLeader().equals(this);
        if (isLeader) {
            return String.format("My name is %s. I am %d years old. I am a student. I am the leader of class %d.", getName(), getAge(), klass.getId());
        } else {
            return String.format("My name is %s. I am %d years old. I am a student. I am in class %d.", getName(), getAge(), klass.getId());
        }
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.attach(this);
    }

    public boolean isIn(Klass klass) {
        if (this.klass == null) {
            return false;
        }
        return this.klass.equals(klass);
    }

    @Override
    public void onLeaderAssign(Student student, Klass klass) {
        if (this.klass.equals(klass) && !this.equals(student)){
            System.out.println(String.format("I am %s, student of Class %d. I know %s become Leader.", this.getName(), this.klass.getId(), student.getName()));
        }
    }
}
