package Collection;

public class Student {
    String name;
    String usn;


    Student(String name,String usn){
        this.name=name;
        this.usn=usn;

    }

    @Override
    public String toString() {
        return "name:"+name+"usn"+usn;
    }
}
