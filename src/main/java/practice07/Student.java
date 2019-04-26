package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(String myName, int myAge) {
        super(myName, myAge);
    }

    public Student(String myName, int myAge, Klass myKlass) {
        super(myName, myAge);
        klass=myKlass;

    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }

}