
class MainClass {
    public static void main(String[] args) {
       Integer startValue = 1;
        Integer endValue = 10;
        for (int i = startValue;
             i < endValue;
             ++i) {
            System.out.println("Current value = "+i);
        }
        System.out.println("Hello World!"); // Display the string.
        System.out.println("Круто что я учусь программировать!!!"); /* Нужно разобраться с путями к файлам
         и с созданием новых файлов */

        OperatorsPriorityExample ope = new OperatorsPriorityExample();
    }
}

