import java.util.*;


class Student{
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name=name;
    }
}
public class test {
    public static void main(String [] args){
        Student s=new Student();
//setting value in the name member
        s.setName("vijay");
//getting value of the name member
        System.out.println(s.getName());
    }
}
