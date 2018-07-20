public class LoopClass {

    private static int test = 19;
    public static void line1() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println("Task - 1");
    }

    public static void printInt() {
        System.out.println(test);
    }

    public static void line2() {
        int i = 0;
        while (i <= 49) {
            System.out.print("*");
            i++;
        }
        System.out.println("Task - 2");
    }
    public static void numberIsOrder () {
        for (int a = 1; a<10; a++) {
            System.out.println("number = "+ a );
        }
    }
    public static void numberIsReverseOrder () {
        for (int a = 10; a > 0; a--) {
            System.out.println("number - " + a);

        }
    }
    public static void numberIsOrder2 () {
        int b = 1;
        while (b < 10) {
            System.out.println("number = " + b);
            b++;
        }
    }
    public static void numberIsReverseOrder2 (){
        int c = 10;
        while (c >= 1) {
            System.out.println("number - " + c);
            c--;
        }
    }

}
