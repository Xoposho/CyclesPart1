public class HomeWork3 {
        public static void main(String[] args) {
            //HomeWork 3
            //Task 1
            int postponeEveryMonth = 29_000;
            int piggyBank = 0;
                for (int month = 1; month <= 12; month++ ) {
                    piggyBank += postponeEveryMonth;
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + piggyBank + " рублей");
                }
            System.out.println("\n");
            //Task 2
            int bankCount = 0;
            int percentInYear = 12;
            int percentInMonth = percentInYear / 12;

                for (int month = 1; month <= 12; month++ ) {
                    bankCount += postponeEveryMonth;
                    bankCount = bankCount + (bankCount * percentInMonth / 100);
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + bankCount + " рублей");
                }
        }
}
//