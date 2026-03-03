package ClassLoaderExample1;

public class classLoaderExample {
    public static void main(String[] args) {
        System.out.println("In Main");
        System.out.println("before 1st Object creation is done");
        //System.out.println("0 "+ executionSequence.c);
        //System.out.println("0 "+ executionSequence.d);
        executionSequence eq1 = new executionSequence();
        System.out.println("Object creation done as eq1");
        eq1.disp();
        executionSequence.run();
        System.out.println("before 2nd Object creation is done");
        executionSequence eq2 = new executionSequence();
        System.out.println("Object creation done as eq2");
    }
}
    class executionSequence {
        int a ;
        int b = 20;

        static int c ;
        static int d;
        static{
            System.out.println("Inside Static Block");
        }
        static void run(){
            System.out.println("1st "+c);
            System.out.println("1st "+d);
            c = 30;
            d = 40;
            System.out.println("2nd "+c);
            System.out.println("2nd "+d);

        }

        {
            System.out.println("Inside java code block");
        }
        void disp() {
            System.out.println(a);
            System.out.println(b);
        }
        executionSequence(){
            System.out.println("Inside Default Constructor");
        }


    }
