package Oops;

public class StudentInfo {
    public static void main(String[] args) {
        Student s1=new Student("sagar ","A11");
        Student s2=new Student("sagar ","A11");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
