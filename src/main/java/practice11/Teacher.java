package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klassList = new LinkedList<Klass>();

    public Teacher(int myId, String myName, int myAge, LinkedList<Klass> myKlass) {
        super(myId, myName, myAge);
        klassList = myKlass;
    }

    public Teacher(int myId, String myName, int myAge) {
        super(myId, myName, myAge);
    }

    public LinkedList<Klass> getClasses() {
        return klassList;
    }

    public String introduce() {
        if (klassList.size() != 0) {
            String classes = "";
            for (Klass klass : klassList) {
                classes += " ";
                classes += klass.getNumber();
                classes += ",";
            }
            return super.introduce() + " I am a Teacher. I teach Class" + classes.substring(0, classes.length()-1) + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public boolean isTeaching(Student student) {
        Klass studentClass = student.getKlass();
        if (klassList.contains(studentClass)) {
            return true;
        } else {
            return false;
        }
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}