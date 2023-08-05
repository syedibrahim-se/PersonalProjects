
//object and class
import java.util.Scanner;
class Student{ //subclass
    String name;
    int age;
    public void studentInfo(String name,int age){
       this.name=name;
        this.age=age;
    }//StudentinfoEnds

        public void printInfo(){
            System.out.println("Sname:"+name);
            System.out.println("sage:"+age);
        }//PrintInfoends
}
                    //PENCLASSSTARTS

    class pen{//subclass
        String name;
        String colour;
        int quantity;

        public void printInfo(){
            System.out.println("pen name:"+this.name);
            System.out.println("pen colour:"+this.colour);
            System.out.println("pen quantity:"+this.quantity);
        }//PrintinfoEnds

   }//PenClassEnds

                                        //ConstructorStarts

//onstructor it a special method with same class name or parameters or arguments and it doesnt have return type and runs automatically;

    class Constructor{
        String name;
        Constructor(String name){
            this.name=name;
        }

        //blanck constructor have to made to execute copy constructor here const cant make default because of copyConst

        Constructor(){

        }//blankCONSTends

        public void print() {
            System.out.println("name:"+name);
        }//printEnd

        //copy constructor
            Constructor(Constructor c2){
                this.name=c2.name;
        }//copyconsEnd

        }//ConstructorEnds


public class ClassObjectConstructor { //main class
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        Student s1=new Student();//Object of student class to access methods of student class
//        System.out.println("Enter student name:");
//        s1.name=sc.nextLine();
//        System.out.println("Enter Student Age:");
//        s1.age=sc.nextInt();
//        s1.printInfo();
//        pen p1=new pen();
//        System.out.println("enter details of p1");
//        p1.name=sc.nextLine();
//        p1.colour=sc.nextLine();
//        p1.quantity=sc.nextInt();
//        p1.printInfo();
//
//        System.out.println("enter details of p2");
//        pen p2=new pen();
//        p2.name=sc.nextLine();
//        p2.colour=sc.nextLine();
//        p2.quantity=sc.nextInt();

//              CONSTRUCTOR
        System.out.println("Enter constructor Details c1");
        Constructor c1= new Constructor();
            c1.name=sc.nextLine();
         c1.print();//c1Ends
        System.out.println("Constructor 2");
                 //c2Starts
            Constructor c2=new Constructor(c1);
            c2.print();


        }
    }
    //End of class,Objects and Constructors;



