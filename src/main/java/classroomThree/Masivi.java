package classroomThree;

import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {
        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0,1,1,2,3,5,8,13,21,34};
        double[] randomSkaitli = {21.3,323.23,412.32};

        // masīva garumu izvadīs 4 vienības, bet indeksācija kodējot sākas no 0
        System.out.println("Masīva garums ir: " + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);
        //System.out.println(gadalaiki[4]);  par šo rādīs kļūdu jo nav 5 mainīgā
        System.out.println(fibonacciNumbers[4]);


        gadalaiki[1]= "Juris";
        System.out.println(gadalaiki[1]);

        //Masīvs ar cilvēka vārdiem
        String[] cilveki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
        //System.out.println("Vārds: " + cilvēki[0] + "\n" + "Vecums: " + vecums[0] );
        printCilveks(cilveki,vecums,1);


        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";
        System.out.println(germanCars[3]);
        // ja piemēram 4 pozīciju opeli noņemam, tad izdrukā null, jo string ir 4, bet mēs esam viņu noņēmuši


        //Ievadi skaitliv 1, ievadi skaitli 2, ievadi skaitli 3
        int[] mansMasivs = generateArray();
        System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" +  mansMasivs[2]);

    }

    static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli ...");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli ...");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli ...");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        return skaitluMasivs;

    }


    static void printCilveks(String[] humans, int[] ages, int index){
        System.out.println("Vārds: " + humans[index] + "\n" + "Vecums:" + ages[index]);
    }











}
