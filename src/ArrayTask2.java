import java.io.IOException;
public class ArrayTask2 {
    public static void main(String[] args) {

        int inChar;
        String s = "";
        try {

            // Ввод с консоли
            inChar = System.in.read();
            while (System.in.available() > 0) {
                s += (char) inChar;
                inChar = System.in.read();
            }
            /////////////////////////////////////////

            // Итоговая строка полученная с консоли после нажатия Enter
            System.out.println("Input string: " + s);

            //Разбиение на построки по regex
            String[] str = s.split(" ");

            // проход по массиву строк
            for(int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
            ///////////////////////////////////////////

        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}


