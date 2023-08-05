package cd;

public class CustomerDetails {
    private String custname,accno,acctype;
    private long deposite;

    public String getCustName(){
        return this.custname;
    }
    public void setCustName(String custname){

        this.custname=custname;
    }
    //Custend
    public String getAccno(){
        return this.accno;
    }

    public void setAccno(String accno){
        this.accno=accno;

    }
    //Accnoend

    public String getAcctype(){
        return this.acctype;
    }

    public void setAcctype(String acctype){
        this.acctype=acctype;
    }
    //Acctypeend

    public long getBalance(){
        return this.deposite;
    }
    public void setBalance(Long deposite){
        this.deposite=deposite;
    }

    public void display(){

        System.out.println("Name of a Account Holder:"+custname);
        System.out.println("Account Number:"+accno);
        System.out.println("Account Type:"+acctype);
        System.out.println("Deposite Amount"+deposite);

    }




}
