package practice10;

public class Student extends Person {
    private Klass klass;
    public Boolean leader = false;

    public Student(int myId, String myName, int myAge) {
        super(myId, myName, myAge);

    }

    public Student(int myId, String myName, int myAge, Klass myKlass) {
        super(myId, myName, myAge);
        klass = myKlass;

    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (leader == true) {
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
        }

    }
}
