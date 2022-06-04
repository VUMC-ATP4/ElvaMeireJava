package classroomThree;

import java.util.Scanner;

public class Masivi {
    public static void main(String[] args) {
        String[] gadalaiki = {"Pavasaris", "Vasara", "Rudens", "Ziema"};
        int[] fibonacciNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        double[] randomSkaitli = {21.3, 323.23, 412.32};

        // masīva garumu izvadīs 4 vienības, bet indeksācija kodējot sākas no 0
        System.out.println("Masīva garums ir: " + gadalaiki.length);

        System.out.println(gadalaiki[0]);
        System.out.println(gadalaiki[1]);
        System.out.println(gadalaiki[2]);
        System.out.println(gadalaiki[3]);
        //System.out.println(gadalaiki[4]);  par šo rādīs kļūdu jo nav 5 mainīgā
        System.out.println(fibonacciNumbers[4]);


        gadalaiki[1] = "Juris";
        System.out.println(gadalaiki[1]);

        //Masīvs ar cilvēka vārdiem
        String[] cilveki = {"Juris", "Pēteris", "Anna"};
        int[] vecums = {33, 40, 28};
        //System.out.println("Vārds: " + cilvēki[0] + "\n" + "Vecums: " + vecums[0] );
        //printCilveks(cilveki, vecums, 1);


        String[] germanCars = new String[4];
        germanCars[0] = "Mercedes";
        germanCars[1] = "Audi";
        germanCars[2] = "BMW";
        germanCars[3] = "Opel";
        System.out.println(germanCars[3]);
        // ja piemēram 4 pozīciju opeli noņemam, tad izdrukā null, jo string ir 4, bet mēs esam viņu noņēmuši

        int iterators = 0;  //cikls
        while (iterators < germanCars.length) {
            System.out.println(germanCars[iterators]);
            iterators++;
        }


        //Ievadi skaitliv 1, ievadi skaitli 2, ievadi skaitli 3
        //int[] mansMasivs = generateArray();
        //System.out.println(mansMasivs[0] + "" + mansMasivs[1] + "" + mansMasivs[2]);


        //Cikli . Kamēr nosacījums ir paties izpildās kods, izpildās kods,
        // izpildās kods utt, līdz ko kods neizpildās iziet ārā


        //       int p = 0;
        //       while(p<5){
        //           System.out.println("I ir: " + p); // 'pie šāda printēsies mūžīgi, jo nosacījums patiess.
        //           p = p +1;  // šādi parādīsies 5 reizes no 0-4
        //       }

        //       System.out.println("Cikla izeja");
        //i++; ir tas pats kas i = i + 1;
        //int u = 10;
        //while(u>1){
        //System.out.println("U ir: " +u);
        //u++; //šis izpildīsies bezgalīgi
        //u--; //tas pats kas u = u-1;


        int[] bingoLotoLaimigieSkaitli = {31, 9, 5, 5};  //masīvos skaitļi var atkārtoties, jo viņi nav unikāli
        int counter = 0;
        while (counter < bingoLotoLaimigieSkaitli.length) {
            System.out.println(bingoLotoLaimigieSkaitli[counter]);
            counter++;

            // ja uzrakstā tādu kā apakšā static void tad // šo daļu var dzēst
            //printIntArray(bingoLotoLaimigieSkaitli); // bet ieraksta šādu komandu
        }

        //Mēs spēlējam kārtis
        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kārava dāma"};
        // es gribu izvadīt visas kārtis kuras man ir
        int karts = 0;
        while (karts < 3) {    // 3 vietā var rakstīt kartis.lenght
            System.out.println(kartis[karts]);
            karts++;

            //do while
            Scanner scanner = new Scanner(System.in);
            String parole = "Parole123";
            String lietotajaParole;
            do{
                System.out.println("Ievadi paroli");
                lietotajaParole = scanner.nextLine();
                System.out.println("Pārbaudām paroli");
            } while(!!lietotajaParole.equals(parole));  //equals - vienāds, vēl ielikām !(nav vienāds) lai cikls neatkārtotos mūžīgi ievadot pareizu paroli
            System.out.println("Pareiza parole");

            // var vēl šādi
            // int number;
            //do{
                //System.out.println("Ievadi skaitli starp lielāku par 0, bet mazāku par 10");
                //number = scanner.nextInt();
            //} while (number<0 && number>10); // && - un


            // for cikls - ātri uzrakstīt fori // ja i ir mazāks par 10 tad dari kaut ko
            //for (int i = 0; i < 10; i++) {
              //  System.out.println(i);
            //}

            //for (int n = 0; n < 10; n=n+2) {    // printēs visus pārskaitļus līdz 1000
              //  System.out.println(n);
            //}

            // piemēram gadalaikus
           // for (int j = 0; j < gadalaiki.length; j++) {
            //System.out.println(gadalaiki[j]);
            //}

            //Šobrīd ciematā ir iespēja iegādāties mājas ar mājas numuriem no 1 līdz 50.
            //Pircējs vēlas iegādāties māju ciematā, bet viņš nevēlas māju, kuras numurs dalās ar 3 vai 5.
            //Cik māju numuri atbilst prasībām?  un ja pieliek klāt ka negribas 13 numuru pieliek vēl || vienu iekavu
            for (int i = 1; i <=50; i++) {
                System.out.println("i");
                if((i%3==0)|| (i%5==0) || (i==13)){
                    System.out.println("Šie numuri mums neder " + i);
                }else{
                    System.out.println("Šis numurs mums der " + i);
                }
            }

            int[] skaitlos = {1,3,4,6,8}; // izvadīs visus skaitļus
            //for each
            for (int skaitlis : skaitlos) {
                System.out.println(skaitlis);
            }

           int[] skaitloss = {1,5,6,3,5};
            int summa = 0;
                for (int skaitliss : skaitloss) {
                    summa = summa + skaitliss;
                }
            System.out.println(summa);




        String[] vardi = {"ābols", "bumbieris", "Burkāns"};
        for (String vards : vardi){
            System.out.println(vards);
        }


        //break - apstājās brīdī kad atrod  norādīto elementu
            for (int i = 0; i < 10; i++) {
                if(i==5){
                    break;
                }
                System.out.println(i);
            }


            // ja caur masīvu iterē
            int[] skaitluMasivs = {1,5,63,35,-5,9,5}; // piem jāapstājas kad atrod -5
            for (int i = 0; i < skaitluMasivs.length ; i++) {
                if (skaitluMasivs[i]==-5) {
                    System.out.println(skaitluMasivs[i]); // ja šo neieraksta viņš neizvada viņu ārā, bet ja pievieno tad izvada -5
                   break;
                }
                System.out.println(skaitluMasivs[i]);
            }

            System.out.println("==============================");  // atstarpe

            //turpināt paziņojumu(continue) -atgriežās uz nākamo iterāciju

            for (int i = 0; i <= 10; i++) {
                if(i>4 && i<8){
                    continue;
                }
                System.out.println(i);
            }















        // mēs izvadīsim pozitīvus skaitļus
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ieraksti skaitli");
        //int number = scanner.nexInt();
        //int summa = 0;
        //while (number>0){
        //summa = summa + number;
        //System.out.println("Ieraksti skaitli");
        //number = scanner.nextInt();
    //}
        //System.out.println("Pozitīvo skaitļu summa ir: " + summa);
        //return summa;

        //šis izvadīs pozitivo skaitļu summu, un neiziet no cikla ārā, kamēr neievadīs negatīvu skaitli



        //do while - vienmēr izpildīsies koda bloks  - atšķirās no while

    }

            //static void printIntArray(int[] randomMasivs){
            //int counter = 0;
            //while(counter < randomMasivs.length){
               // System.out.println(randomMasivs[counter]);
                //counter++;
                // ja es gribētu izveidot String metodi, tad jārāksta būtu šādi
                //static void printStringArray(String[] randomMasivs){
                // jo int ir tikai veseliem skaitļiem
            //}
            //}

                                                        // length  ir daudzums

    //static int[] generateArray(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi pirmo skaitli ...");
        int a = scanner.nextInt();
        System.out.println("Ievadi otro skaitli ...");
        int b = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli ...");
        int c = scanner.nextInt();
        int[] skaitluMasivs = {a, b, c};
        //return skaitluMasivs;








    }


   // static void printCilveks(String[] humans, int[] ages, int index){
       // System.out.println("Vārds: " + humans[index] + "\n" + "Vecums:" + ages[index]);
    //}











}
