public class Main {
    public static void main(String[] args) {
        int personal = 230;
        int replenishment = 1500;
        boolean add_bonus = replenishment > 1000;
        if (add_bonus) {
            System.out.println("Текущих средств: " + (personal + replenishment + replenishment / 100) +
                    "; Бонусных рублей зачислено: " + (replenishment / 100));
        } else {
            System.out.println("Текущих средств: " + (personal + replenishment));
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
