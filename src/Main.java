public class Main {
    public static void main(String[] args) {
        int Personal = 230;
        int Replenishment = 1500;
        boolean add_bonus = Replenishment > 1000;
        if (add_bonus) {
            System.out.println("Текущих средств: " + (Personal + Replenishment + Replenishment / 100) +
                    "; Бонусных рублей зачислено: " + (Replenishment / 100));
        } else {
            System.out.println("Текущих средств: " + (Personal + Replenishment));
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
