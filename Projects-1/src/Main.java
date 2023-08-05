
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int choice=0;
        while(choice!=3){
            System.out.println("Enter 1-for module 1   Enter 2-for module 2");
            choice =sc.nextInt();
            if (choice==1){
                Module1 m1=new Module1();
                System.out.println("Enter Student's Name:");
                m1.name=sc.nextLine();
                System.out.println("Enter Father's Name:");
                m1.fname=sc.nextLine();
                System.out.println("Entre University Name:");
                m1.uni_id=sc.nextLine();
                System.out.println("Enter UserId:");
                m1.uid=sc.nextLine();

            } else if (choice==2) {
                Module2 m2=new Module2();
                m2.cseEng();
                m2.civilEng();
                m2.eeeEng();
            }

        }

    }
}