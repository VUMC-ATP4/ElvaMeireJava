package homework;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {

        // 1 uzdevums
        int a = 5;
        System.out.println(a > 4);
        int b = 9;
        System.out.println(b > 10);
        int c = 7;
        System.out.println(c > 5 && c <= 10);
        int d = 8;
        System.out.println(!(d <= 5) && d < 10);
        int e = 6;
        System.out.println(e == 0 || e == 10);
        int f = 5;
        System.out.println((f * f) > 10);

        // 2 uzdevums
        int menesis = 12;
        switch (menesis) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("Aprīlis");
                break;
            case 5:
                System.out.println("Maijs");
                break;
            case 6:
                System.out.println("Jūnijs");
                break;
            case 7:
                System.out.println("Jūlijs");
                break;
            case 8:
                System.out.println("Augusts");
                break;
            case 9:
                System.out.println("Septembris");
                break;
            case 10:
                System.out.println("Oktobris");
                break;
            case 11:
                System.out.println("Novembris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
        }


        // 3 uzdevums
        int p = 12;
        int o = 14;
        int i = 17;
        if (p > o && p > i) {
            System.out.println("Lielākais skaitlis " + p);
        } else if (o > p && o > i) {
            System.out.println("Lielākais skaitlis " + o);
        } else if (i > p && i > o) {
            System.out.println("Lielākais skaitlis " + i);

        }

        luksafors();
        vizitkarte("Kārlis", "Kalniņš", "+3712536942", "1976");
        vizitkarte("Hans", "Indriksons", "+37126547895", "1985");
        vizitkarte("Aldis", "Rietnieks", "+ 3712259748", "1968");

        printBusinessCardsTwo("Olafs", "Kūdrītis", "+37125654852", "1950");
        printBusinessCardsTwo("Ignats", "Silnieks", "+37126581459", "1974");

        int summa = sum(5, 8);
        System.out.println(sum(5, 8));


        double rezultats = average(1.5,2.5,5.5);
        System.out.println (average (1.5,2.5,5.5));

    }

    // 4 uzdevums
    static void luksafors() {
        Scanner scanner = new Scanner(System.in);
        String sarkans = "sarkana";
        String dzeltens = "dzeltena";
        String zals = "zaļa";
        System.out.println("Lūdzu ievadiet kādu no krāsām : ");
        String krasa = scanner.nextLine();
        boolean redColor = sarkans.equals(krasa);
        boolean yelloyColor = dzeltens.equals(krasa);
        boolean greenColor = zals.equals(krasa);

        if (redColor) {
            System.out.println("Stop!");
        } else if (yelloyColor) {
            System.out.println("Uzmanību! ");
        } else if (greenColor) {
            System.out.println("Droši ej!");
        } else {
            System.out.println("Luksofors nedarbojas");
        }
    }


    // 5 uzdevums
    static void vizitkarte(String name, String lastname, String phonNumber, String dzimsanasGads) {

        System.out.println("Vizītkarte ");
        System.out.println("###############");
        System.out.println("Vārds : " + name);
        System.out.println("Uzvārds : " + lastname);
        System.out.println("Tel.numurs : " + phonNumber);
        System.out.println("Dzimšanas gads " + dzimsanasGads);

    }

    // 6 uzdevums
    static void printBusinessCardsTwo(String firstName, String lastName, String phoneNumber, String birthYear) {

        System.out.println("Vizītkarte ");
        System.out.println("###############");
        System.out.printf("Vārds : " + firstName);
        System.out.printf("Uzvārds : " + lastName);
        System.out.printf("Telefona nr.: " + phoneNumber);
        System.out.printf("Dzimšanas gads : " + birthYear);
        System.out.println("###############");
        // 6 uzdevumā - metode pieņem kā arguments- nesaprotu kas tieši jāizmanto
    }

    // 7 uzdevums

    static int sum(int a, int b) {
        return a + b;
    }

    // 8 uzdevums
    static double average(double c, double d, double e) {
        return c + d + e;
    }

}

