public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс
        int refill = 1100; // пополнение

        int amount = balance + refill; // сумма = баланс счёта + пополнение
        int bonus;
        int i = 1000;
        if (refill > i) {
            bonus = refill / 100;
            System.out.println("Количество бонусных рублей на счёту: " + bonus);
        } else {
            bonus = 0;
            System.out.println("Количество бонусных рублей на счёту: " + 0);
        }
        int finish = amount + bonus; // Итоговая сумма счёта

        System.out.println("Баланс вашего счета составляет: " + finish);

    }

}