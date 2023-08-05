
                                                    //Abstraction
//hiding the un necessary details showing revelevent an abstract class must declared with an abstract keyword
//it can have abstract and non-abstract methods and it can't be instantiated(cannot build/create object)
//it can have constructors and static methods also..
// it can have final methods which force subclass not to change body of method.
//static keyword=if we want same value in multiple objects and
// also we can call directly to static menbers with class name
import java.util.*;
    abstract class Animal{

        Animal(){
            System.out.println("creating a new animal");
        }
        abstract void walk();//abstrach method
        public void eat(){
            System.out.println("animal eats");

            }
        }

    class Horse extends Animal{
        Horse(){
            System.out.println("created a hourse");
        }
        public void walk(){

            System.out.println("can walk with four legs");
        }
    }
    class Chicken extends Animal{
        public void walk(){
            System.out.println("can walks with 2 legs");
        }

    }

    class Student2{
        String name;
        static String school;
    }


    public class Abstraction {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Horse h1=new Horse();
            h1.walk();
            Chicken c1=new Chicken();
            c1.walk();
//            Horse h1=new Horse();
//            h1.walk();

            //calling static members of class
            Student2.school="MHS";
            Student2 s=new Student2();
            s.name="tony";
            System.out.println(Student2.school);
            System.out.println(s.name);
        }

}
