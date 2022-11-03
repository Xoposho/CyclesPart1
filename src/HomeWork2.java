public class HomeWork2 {
        public static void main(String[] args) {
            //HomeWork2
            //Task 1
            for (int year = 1904; year <= 2096; year++)
                if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
                    System.out.println(year + " год являлется високосным.");
                }
            //Task 2
            for (int num = 7; num <= 100; num+=7)
                System.out.println(num);
            //Task 3
            for (int num = 1; num <= 512; num+=num)
                System.out.println(num);
        }
}
//by Igor