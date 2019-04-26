package practice04;

public class Student extends Person {
    private int klass;

    public Student(String myName, int myAge, int myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public int getKlass(){
        return klass;
    }

    public String introduce() {
        return basicIntroduce()+" I am a Student. I am at Class "+klass+".";
    }

}