public class TestClass {
    public static void main(String[] args) {
        int salary1 = 25000;
        // int salary2 = 30000;
        int salary3 = 20000;
        int salary4 = 10000;
        int salary5 = 10000;
        // int salary6 = 15000;
        int salary7 = 15000;
        int salary8 = 15000;
        int experience1 = 4;
        // int experience2 = 6;
        int experience3 = 3;
        int experience4 = 1;
        int experience5 = 1;
        // int experience6 = 3;
        int experience7 = 3;
        int experience8 = 3;
        // String n1 = "Name1";
        // String n2 = "Name2";
        String n3 = "Name3";
        String n4 = "Name4";
        String n5 = "Name5";
        String n6 = "Name6";
        // String n7 = "Name7";
        String n8 = "Name8";
        // String position1 = "manager";
        String position2 = "worker";

        if (salary1 > 24000 && experience1>3) {System.out.println("Position of " + n6 + " = " + position2 );}
        if (salary4 < 15000 && experience4<3) {System.out.println("Newbie: " + n4);}
        if (salary5 < 15000 && experience5<3) {System.out.println("Newbie: " + n5);}
        if (salary3 > 15000 && experience3==3) {System.out.println("Junior: " + n3);}
        if (salary7 == 15000 && experience7<4) {System.out.println("Junior: " + n4);}
        if (salary8 < 25000 && experience8<4) {System.out.println("Junior: " + n8);}


    }
}