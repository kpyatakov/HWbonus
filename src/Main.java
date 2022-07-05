public class Main {
    public static void main(String[] args) {
        int balance = 100; //Начальная сумма на счете
        int payment = 1100; //Сумма пополнения
        int summ = balance + payment; //Итого на счете после пополнения с учетом баланса

        int bonus = payment / 100;
        if (balance + payment > 200) {
            bonus = bonus;
        } else {
            bonus = 0;

        }

        System.out.println(" Вам начислен бонус " + bonus + " рубля(ей). Ваш остаток на счете " + (summ + bonus) + " рубля(ей)");
    }
}