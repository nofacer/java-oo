package practice04;

public class Person {
    private String name;
    private int age;
    public Person(String myName,int myAge){
        name=myName;
        age=myAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }
}