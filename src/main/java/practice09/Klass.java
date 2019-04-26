package practice09;

import java.util.ArrayList;

public class Klass {
    private int klass;
    private Student leaderStudent;
    private ArrayList<Student> studentList = new ArrayList<Student>();

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
        if(studentList.contains(student)){
            leaderStudent = student;
            student.leader = true;
        }
        else{
            System.out.println("It is not one of us.");
        }
        
    }

    public Student getLeader() {
        return leaderStudent;
    }

    public void appendMember(Student student) {
        studentList.add(student);
    }
}
