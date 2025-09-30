package Practics;
abstract class  base{
    base(){
        System.out.println("this is no arg contructor in base");
    }
  base(int x){
        System.out.println("this is arg contructor in base "+x);
    }

  abstract public int gg() ;
}
class drived extends base{
    public int gg(){
        System.out.println();
        return 0;
    }
    drived(){
        super(3);
        System.out.println("this is drived no ar constuctor");
    }
    drived (int x){
        super(5);
        System.out.println("this is 1 args of drived "+x);

    }
//    drived(int x,int y){
//        super(x);
//        System.out.println("this is with 2 arg "+y);
//    }
}
class  child extends drived{
    child(){
        super(3);
        System.out.println("this no arg contrictor in child");
    }
//    child(int x,int y,int z){
//        super(y,z);
//        System.out.println("this is 3 args contrictor");
//    }
}
interface son {
    int age = 23;
    public int sonage(int age);
}

interface daughter extends son{
    int age1=2;
    public int daughterAge(int age);
        @Override
        public int sonage(int age1);

    }
    class nani implements daughter,son{
        @Override
        public int daughterAge(int age) {
            return age;
        }

        @Override
        public int sonage(int age) {
            return age1;
        }
    }

 abstract  class constructor_overloadding {
     public static void main(String[] args) {
         child ch = new child();
         constructor_overloadding cn = new constructor_overloadding() {
             public int hello() {
                 return 4;
             }
         };
         nani n=new nani();
         System.out.println("daughter "+n.daughterAge(23));
         System.out.println("son "+n.sonage(25));

         System.out.println(n.age);
         System.out.println(n.age1);
         System.out.println(cn.hello());
     }

     abstract int hello();
 }