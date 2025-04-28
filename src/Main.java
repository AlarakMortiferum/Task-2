public class Main {
    public static void main(String[] args) {

        // Объявляем переменные для входных данных
        int initialBalance = 100; // начальная сумма на счету клиента
        int topUpAmount = 1100;   // сумма пополнения счета

        // Переменная для хранения суммы бонуса
        int bonus = 0;

        // Проверяем, превысила ли сумма пополнения порог в 1000 рублей
        if (topUpAmount > 1000) {
            // Рассчитываем бонус за каждые полные 100 рублей пополнения
            bonus = topUpAmount / 100;
        }

        // Итоговая сумма на счету
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результат
        System.out.println("Сумма пополнения: " + topUpAmount + " рублей");
        System.out.println("Начальный баланс: " + initialBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счёте: " + finalBalance + " рублей");
    }
}
