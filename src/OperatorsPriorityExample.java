public class OperatorsPriorityExample {
    public static void main(String[] args) {

        {
            int oklad = 3200;
            int dni =30;
            int zp = (dni * oklad);
            int premia = (zp * 7 / 100);
            int superPremia = (zp * 25 / 100);
            int miniDohod = (zp);
            int dohod = (zp + premia);
            int maxiDohod = (zp + superPremia);
            if (dni < 10) {
                System.out.println("Вы недостаточно потрудились в этом месяце. Ваша смешная зарплата  =  " + miniDohod);
            } else if (dni > 10 && dni < 20) {
                System.out.println("Вы нормально потрудились в этом месяце! Вам даже хватит оплатить тренировки!" +
                        " Ваша нормальная зарплата  =  " + dohod);
            } else if (dni >= 20 && dni <= 31) {
                System.out.println("Вы отлично потрудились в этом месяце! Вам хватает денег  платить за треши, но" +
                        " не хватает времени их посещать!!! Ваша большая зарплата  =  " + maxiDohod);
            } else { System.out.println("Вы отлично потрудились, но где-то вы перемудрили с числом рабочих дней... мы" +
                    " все-же заплатим вам зарплату = 31 дню. Но не больше!");

            }
        }
    }
}