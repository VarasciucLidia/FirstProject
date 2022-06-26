import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        printMyName();
        printSum();
        print3();
        print4();
        System.out.println("Rezultatul adunarii este: " + adunare(2, 3));
        System.out.println("Rezultatul scaderii este: " + scadere(10, 2));
        System.out.println("Rezultatul inmultirii este: " + inmultire(2, 3));
        System.out.println("Rezultatul impartirii este: " + impartire(10, 2));
        print1();
        System.out.println("Rezultatul mediei este: " + media(1, 2, 3));
        printFace();
        System.out.println("Restul impartirii este: " + restulImpartirii(10, 2));

        double a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextDouble();
        System.out.println("Celsius temperature is = "+celsius(a));

        System.out.println("Enter value of inch: ");
        double inch = sc.nextDouble();
        convert(inch);

        System.out.println("Input distance in meters: ");
        float distance=sc.nextFloat();
        System.out.println("Input hour: ");
        float hr = sc.nextFloat();
        System.out.print("Input minutes: ");
        float min = sc.nextFloat();
        System.out.print("Input seconds: ");
        float sec = sc.nextFloat();

        convertValue(distance,hr,min,sec);
    }

    //1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void printMyName() {
        System.out.println("Hello\nLidia");
    }

    //2. Printati rezultatul sumei a doua numere(orice numere)
    public static void printSum() {
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println("The total sum is: " + sum);
    }

    //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public static void print3() {
        double x = 10;
        int y = 3;
        double rez = x / y;
        System.out.println("The result for 10/3 is: " + rez);
    }

    public static void print4() {
        //4. Printati rezultatul urmatoarelor operatiuni:
        //a. -5 + 8 * 6
        int total1 = -5 + 8 * 6;
        System.out.println("The result of \"-5 + 8 * 6\" is: " + total1);

        //b. (55+9) % 9
        float total2 = (55 + 9) % 9;
        System.out.println("The result of \"(55+9) % 9\" is: " + total2);

        //c. 20 + -3*5 / 8
        float total3 = 20 + -3 * 5 / 8;
        System.out.println("The result of \"20 + -3*5 / 8\" is: " + total3);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        float total4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("The result of \"5 + 15 / 3 * 2 - 8 % 3\" is: " + total4);
    }

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static int scadere(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;

    }

    public static int impartire(int primulNumar, int alDoileaNumar) {

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;

    }

    public static void print1() {
        System.out.println("   J    a   v     v  a   \n" +
                           "   J   a a   v   v  a a  \n" +
                           "J  J  aaaaa   v v  aaaaa \n" +
                           " JJ  a     a   v  a     a ");
    }

    public static int media(int primulNumar, int alDoileaNumar, int alTreileaNumar) {

        int rezultat = (primulNumar + alDoileaNumar + alTreileaNumar) / 3;

        return rezultat;

    }

    public static void printFace() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    public static double restulImpartirii(double primulNumar, double alDoileaNumar) {

        double rezultat = primulNumar%alDoileaNumar;

        return rezultat;

    }

    public static double celsius(double f)
    {
        return  (f-32)*5/9;
    }

    public static void convert(double inch)
    {
        double m = inch * 0.0254;
        System.out.println("Value of "+inch+" inch in meter: "+ m);
    }

    public static void convertValue(float distance, float hr, float min, float sec)
    {
        float timeSeconds = (hr*3600) + (min*60) + sec;
        float mps = distance / timeSeconds;
        float kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        float mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);
    }

}