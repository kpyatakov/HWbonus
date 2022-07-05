public class Main {
    public static void main(String[] args) {
        int accmount = 100; //Начальная сумма на счете
        int payment = 100; //сумма пополнения
        int summ = accmount + payment;


           int y=payment/100;
        if (accmount+payment>200) {
                 y=y;
        }
        else {
            y=0;

        }
        int bonus = y;

        System.out.println(" вам начислен бонус " + bonus + " рубля(ей). Ваш остаток на счете " + (summ+y) + " рубля(ей)");
    }
}