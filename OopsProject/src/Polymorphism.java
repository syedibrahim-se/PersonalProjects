    import java.util.*;

//Polymorphism means manyforms
//1.compileTime(i)methodOverloading[parameters diff or returntupe]
//and Runtime(ii)MethodOverRiding[]
    class Student1{
    String name;
    int age;
    public void studentInfo(String name){
        System.out.println("nameofstudent:"+this.name);

    }//1methdend

    public void studentInfo(int age){
        System.out.println("ageofstudent:"+this.age);

    }//2methdend

    public void studentInfo(String name,int age){
        System.out.println("nameofstudent:"+this.name);
        System.out.println("ageofstudent:"+this.age);

    }//3methdend

        }//SUBCLASS StudentClassEnd



                            //MAIN CLASS STARTS

public class Polymorphism {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            Student1 s1=new Student1();
        System.out.println("Enter Student Name:");
            s1.name=sc.nextLine();
            s1.studentInfo(s1.name);
        System.out.println("Age Student Name:");
            s1.age=sc.nextInt();
            s1.studentInfo(s1.age);
        System.out.println("Age & Names Student:");
            s1.studentInfo(s1.name, s1.age);

    }

}
