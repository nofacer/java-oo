package practice07;

public class Klass {
    private int klass;

    public Klass(int myKlass) {
        klass = myKlass;
    }

    public int getNumber(){
        return klass;
    }

    public String getDisplayName(){
        return "Class "+klass;
    }
}
