package oo;

public class Student extends Person implements AssignLeaderObserver{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public String introduce() {
        if (klass != null && klass.isLeader(this)) {
            return super.introduce() + " I am a student. I am Leader of class %d.".formatted(klass.getNumber());
        }
        if (klass != null) {
            return super.introduce() + " I am a student. I am in class %d.".formatted(klass.getNumber());
        }
        return super.introduce() + " I am a student.";
    }

    public boolean isIn(Klass klass) {
        if (this.klass != null) {
            return this.klass.equals(klass);
        }
        return false;
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.attachAssignLeaderObserver(this);
    }

    @Override
    public void notifyAssignLeader(Klass klass) {
        String message = "I am %s, student of Class %d. I know %s become Leader."
                .formatted(name, klass.getNumber(), klass.getLeaderName());
        System.out.println(message);
    }
}
