package Oops;

import java.util.Objects;

public class Student {
    String name;
    String rollno;
    Student(String name,String rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
        return "name:"+name+"rollno:"+rollno;
    }

    @Override
    public boolean equals(Object obj) {
        Student s=(Student) obj;
        return this.name==s.name && this.rollno==s.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,rollno);
    }
}
