import cd.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter your details here:");

        CustomerDetails cd=new CustomerDetails();
        System.out.println("Enter your Name:");
        cd.setCustName(s.nextLine());
        cd.getCustName();
        System.out.println("Enter Your AccountNumber:");
        cd.setAccno(s.nextLine());
        cd.getAccno();
        System.out.println("Enter Your AccountType:");
        cd.setAcctype(s.nextLine());
        cd.getAcctype();
        System.out.println("Enter Your DepositeBalance:");
        cd.setBalance(s.nextLong());
        cd.getBalance();

        cd.display();
    }
}