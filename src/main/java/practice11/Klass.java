package practice11;

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
            System.out.println("I am Tom. I know "+student.getName()+" become Leader of Class "+getNumber()+".");
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
        System.out.println("I am Tom. I know "+student.getName()+" has joined Class "+getNumber()+".");
    }
}
