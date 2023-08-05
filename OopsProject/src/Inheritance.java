
                                            //inheritance
//inheritance is nothing but aquring the the properities of one class to another class.
// i,e:subclass(child class) aquring the properties of parentclass(Base class).
//types of inheritance 1.single level 2.Multiple level(can be acheive by interface)
// 3.hyrarical 4.hybrid inheritance

                                            //base class
    class Shape{
       public void area(){
           System.out.println("display area");
       }
    }//base clas end
                                // SINGLE LEVEL INHERITANCE
    class Triangle extends Shape {
       public void area(int l,int h){
           System.out.println(1/2*l*h);
       }

    }//class End

      // MULTI LEVEL INHERITANCE above class and this below class aquring properties of triangle class not shape
    class Equilateral extends Triangle{
            public void area(int l,int h){
                System.out.println(1/2*l*h);
            }

    }//class end

               //Hirariecal Inheritance multiple derived(child,subclasses) inheriting properties of base class
     class Circle extends Shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }   //class End

                                    //MAIN CLASS
public class Inheritance {
    public static void main(String[] args) {

        Triangle t1=new Triangle();
        t1.area();


    }

}
