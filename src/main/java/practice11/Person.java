package practice11;

public class Person {
    private int eyed;
    private String name;
    private int age;

    public Person(int myId, String myName, int myAge) {
        eyed = myId;
        name = myName;
        age = myAge;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (eyed == person.eyed) {
                return true;
            }
            else{
                return false;
            }
            
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}