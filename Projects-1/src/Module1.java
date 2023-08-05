import java.sql.SQLOutput;

public class Module1 {

    String name,fname,uni_id,uid; //Global variables
    int sem;

    public String getname(){//inside brakets local variables

        return
                name;//this keyword is used if global variable and local variable same


    }
    public String getfname(){
        return fname;
    }
    public String getuni_id(){
        return uni_id;
    }
    public String getuid(){
        return uid;
    }
    public void setdata(String name,String fname,String uni_id,String uid){
              this.name=name;//this keyword is used if global variable and local variable same
              this.fname=fname;
              this.uni_id=uni_id;
              this.uid=uid;
    }
    public void printInfo(){
        System.out.println("student name:"+name);
        System.out.println("student father name:"+fname);
        System.out.println("university id:"+uni_id);
        System.out.println("userid:"+uid);
    }
}
