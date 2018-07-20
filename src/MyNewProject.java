public class MyNewProject {
    public static void main(String[] args) {
// Цыклы:
     /*   // Task - 1
        for (int i = 0; i<50; i++) {
            System.out.print("-");
        } System.out.println("Task - 1");
         // Task - 2
        int i = 0;
        while (i <= 49) {
            System.out.print("*");
            i++;
        } System.out.println("Task - 2");
        // Task - 3
        System.out.println("Task - 3");
        for (int a = 1; a<10; a++) {
            System.out.println("number = "+ a );
        }
        for (int a = 10; a>0; a--) {
            System.out.println("number - "+ a );
        }
        System.out.println("Task - 4");
        // Task - 4
        int b = 1;
        while (b < 10) {
            System.out.println("number = "+b);
            b++;
        }
        int c = 10;
        while (c >= 1) {
            System.out.println("number - "+c);
            c--;
        }
           // System.out.println(" ");
*/

        LoopClass.printInt();

        Employee employee1 = new Employee();
        System.out.println(employee1.getSalary());
        employee1.setSalary(150000);
        System.out.println(employee1.getSalary());
        }
    }

