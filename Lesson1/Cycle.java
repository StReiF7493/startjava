public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int numberOne = 2;
        int numberTwo = 6;
        while(numberTwo >= -4) {
            numberTwo -= 2;
            System.out.println(numberTwo);
        }

        int a = 10;
        int sum = 0;
        do {
            if (a % 2 > 0) {
                sum += a;
            } a++;
        } while(a < 20);
        System.out.println("Сумма чисел 11 + 13 + 15 + 17 + 19 = " + sum);
    }
}