   package bank;
    import java.util.*;
                        //PackagesandAccessModifiers
//accessmodifiers means to-define which thing can be accessible to whom
// 4 types of access modifiers public,default,protected,private
// public=it can be accessible by whole class as well as in other packages(other class) also by making object
// default=no need to specify by user it already defined(automatically) by language and it can be accessible by
// within that total class only,can't acess by other package(other class).
// Protected=it can be access in the whole class where it defined and it can also be access by other package subclass also
// Private=it can be accessible by current class only it can't be access by other packag(other class)e by direct.
// but you can access in other package(other class) with the help of getter and setter methods.

    class Account{
        public String name;
        String accno;
       protected String branch ;
       private String password;

        //GetterandSetter methods
        public String getpassword(){

            return this.password;
        }
        public void setPassword(String pass){

            this.password=pass;
        }

    }


    public class PackagesandAccessModifiers {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Account a1=new Account();
            a1.name=sc.nextLine();
            a1.accno=sc.nextLine();
            a1.branch=sc.nextLine();
            //private variable set and call
           a1.setPassword(sc.nextLine());
            System.out.println("your password is:"+a1.getpassword());


        }
}
