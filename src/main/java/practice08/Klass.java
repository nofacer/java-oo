package practice08;

public class Klass {
    private int klass;
    private Student leaderStudent;

    public Klass(int myKlass) {
        klass = myKlass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return "Class " + klass;
    }

    public void assignLeader(Student student) {
        leaderStudent = student;
        student.leader = true;
    }

    public Student getLeader() {
        return leaderStudent;
    }
}
