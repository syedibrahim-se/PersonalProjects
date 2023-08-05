
                                        //  Interfaces
//interface=interface same as classes but there are some fix properties.
// with the help of interfaces we can acheive pure abstraction we can declare it with interface keyword.
// No constructors in interfaces and non abstract function not be there in interfaces

 interface Animals {
    int eyes=2;
    void walk();
}
interface Herbivours{

}
class Deer implements Animals,Herbivours{
    public void walk(){
        System.out.println("can walk with 4 legs");
    }
    class BlackBug{

    }
}
class main{
    public static void main(String[] args) {

        Deer d=new Deer();
        d.walk();
    }
}