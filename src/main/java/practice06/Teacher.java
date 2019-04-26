package practice06;

public class Teacher extends Person {
    private int klass = -1;

    public Teacher(String myName, int myAge, int myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Teacher(String myName, int myAge) {
        super(myName, myAge);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        if (klass != -1) {
            return super.introduce() + " I am a Teacher. I teach Class "+klass+".";
        }
        else{
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }

    }
}
