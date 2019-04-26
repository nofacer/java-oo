package practice09;

public class Teacher extends Person {
    private Klass klass = null;

    public Teacher(int myId, String myName, int myAge, Klass myKlass) {
        super(myId, myName, myAge);
        klass = myKlass;
    }

    public Teacher(int myId, String myName, int myAge) {
        super(myId, myName, myAge);
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != null) {
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}