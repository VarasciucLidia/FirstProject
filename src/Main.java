public class Main {
    public static void main(String[] args) {
        //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello\nLidia");

        //2. Printati rezultatul sumei a doua numere(orice numere)
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println("The total sum is: " + sum);

        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        double x = 10;
        int y = 3;
        double rez = x/y;
        System.out.println("The result for 10/3 is: " + rez);

        //4. Printati rezultatul urmatoarelor operatiuni:
        //a. -5 + 8 * 6
        int total1=-5 + 8 * 6;
        System.out.println("The result of \"-5 + 8 * 6\" is: " + total1);

        //b. (55+9) % 9
        double total2= (55+9) % 9;
        System.out.println("The result of \"(55+9) % 9\" is: " + total2);

        //c. 20 + -3*5 / 8
        double total3= 20 + -3*5 / 8;
        System.out.println("The result of \"20 + -3*5 / 8\" is: " + total3);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        double total4=5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("The result of \"5 + 15 / 3 * 2 - 8 % 3\" is: " + total4);
    }
}
