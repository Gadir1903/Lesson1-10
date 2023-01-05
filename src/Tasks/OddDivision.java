package Tasks;

import java.util.Scanner;

    public class OddDivision {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ededi Daxil edin"); // 18
            int num = scanner.nextInt();
            for (int i = 0; i <= num/2 ; i++) {
                if (i % 2 != 0 && num % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
