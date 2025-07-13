package Z_practice;

public class StaticBlock {

    static class innerclass {
        static String Name;
        void setname(String Naam){
            this.Name = Naam;
        }
    }

    static {
       for(int i =0; i<5;i++){
           System.out.println("hello World");
       }
    }


    public static void main(String[] args) {
        innerclass obj = new innerclass();
        obj.setname("Pavan");
        System.out.println(obj.Name);
        innerclass obj2 = new innerclass();
        obj2.setname("Raja");
        System.out.println(obj2.Name);
        System.out.println(obj.Name);
    }
}
