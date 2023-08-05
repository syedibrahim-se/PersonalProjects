import java.util.*;
import ba.*;

class BankingApplicationConsole{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount b=new BankAccount("sohail","01");
        b.showMenu();
    }
}