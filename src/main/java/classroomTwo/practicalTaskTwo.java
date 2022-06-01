package classroomTwo;

import java.util.Scanner;

public class practicalTaskTwo {
    public static void main(String[] args) {
        // tips nosaukums = dekleracija
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Ievadi savu vārdu");
        //Lietotājam jāieraksta piem. savs vārds
       //String vards = scanner.nextLine();
        //System.out.println("Labdien " + vards + "!");
        //System.out.println("Esi sveicināts kalkulatora programmā!");



        int a;
        int b;
        int summa;
        //scanner.nextInt - lietotāju ievade
        // System.out.println("Ievadi skaitli a");
        // a = scanner.nextInt();
        // System.out.println("Ievadi skaitli b");
        // b = scanner.nextInt();
        // System.out.println(a>b);

        System.out.println("šeit jābūt nepatiesam: " + (5>10));
        System.out.println((5<10));
        System.out.println(6==5); //false
        System.out.println(5==5); //true
        System.out.println(6!=5); //true
        System.out.println(5!=5); //false

        //vai cilvēks var piedalīties vēlēšanās
        int vecums = 18;
        System.out.println(vecums = 18); // sistēma nesaprot ka arī 18 var piedlīties vēlēšanās
        System.out.println(vecums >= 18); // saprot, ka ir 18 un vairāk gadu
        int bernaVecums = 5;
        System.out.println(bernaVecums<=5);
        System.out.println(vecums>bernaVecums);
        boolean isEligibleToVote = vecums >= 18;
        System.out.println("Vai cilvēks drīkst balsot ? " + isEligibleToVote);

        //String name = "Haralds";
        //String nameTwo = "Haralds";
        //System.out.println(name.equals(nameTwo));
        //System.out.println(true==true); //true
        //System.out.println(true==false); //vienmēr false
        //System.out.println(false==false); //vienmēr true
        //System.out.println(true!=false);  // true- jo true nav vienāds false

      //System.out.println("Ievadi x");
      //int x = scanner.nextInt();
     //int x=4;
      //boolean vaiIrPatiess = (x<5 && x<10); //true
      //x=5;
     //System.out.println(x<5 && x<10); //false

     // nodefinēšu VAI
     //System.out.println((k<5|| i<10)); //true

     //int k  =10;
     //int i = 20;
     //int c = 20;
     //int d = 0;
     //System.out.println((k<i) && (i==c)); //true
     //System.out.println(k>i || c==d); //false
     //System.out.println(!(k>i)); //true  !nav vienāda? tātad taisnība







        //  summa = a + b;
        // System.out.println(String.format("%s, %s + %s = %s", vards, a, b, summa));


        //double a=100.25;
        //double b=10.32;
        //System.out.println("a-b = " + (b/a));
        //String.format("%2f" , (b/a));
        //%.2f - norāda cik zīmes aiz komanta tiek izvadītas uz ekrāna
        //System.out.println(String.format("%.2f",(b/a)));

        String firstname = "Jānis";
        String lastname = "Kalniņš";
        String role = "Profesors";
        double videjaAtzime = 7.256;
        // divi pieraksti ar vienādu darbību
        String concatTeikums = "Mani sauc " + firstname + "Mans uzvārs ir " + lastname + "Es esmu " + role;
        String teikums = String.format("Mani sauc %s. Mans vārds ir %s. Es esmu %s .", firstname, lastname, role);
        // Ja es gribu norādīt daļskaitļus jānorāda burtiņš f
        // String teikums = String.format("Mani sauc %s. Mans vārds ir %s. Es esmu %.Mana vid atz ir %f " , firstname, lastname, role, videjaAtzime);
        //Ja grib vienu zīmi aiz komata, tad . un 1 - %.1f
        //String teikums = String.format("Mani sauc %s.  Mans vārds ir %s. Es esmu %s. Mana vid atz ir %.1f " , firstname, lastname, role, videjaAtzime);
        System.out.println(teikums);
        System.out.println(concatTeikums);


     if (6 > 3) {

      System.out.println("6 ir lielāks par 3");
     }

      //Scanner scanner = new Scanner(System.in);
      //int vecumsx;
      //boolean drikstBalsot = false
      //System.out.println("Paskaties cilvēka pasē");
      //vecumsx = scanner.nextInt();
      //if  (vecumsx >=18) {
       //   drikstBalsot = true
       //System.out.println("Drīskt balsot");
     // }
       // System.out.println("Vai drikst balsot? " + drikstBalsot);
      //System.out.println("Tālākās darbības");

        // ja f ir lielāks par l, kā izvadīt uz ekrāna
        int l = 10;
        int f = 20;
        //if(f>l) {
         //   System.out.println(true);
        //}

        if (f>=l) {
            System.out.println("F ir lielāks par L");
        }

        //if (l>f && f>5){
            //System.out.println("y ir lielāks par x un lielāks par 5");
       // }

        //if (f>l || f>25){       true
            //System.out.println("Nosacījums izpildās");
        //}


        int skaitlis = 5;
        if (skaitlis>0){
            System.out.println(skaitlis + " ir pozitivs!");
        }else{
            System.out.println(skaitlis + " ir negativs!");
        }



        //Scanner scanner = new Scanner(System.in);
        //int gadi;
        //System.out.println("Paskaties cilvēka pasē?");
        //gadi = scanner.nextInt();
        //if (gadi>=18) {
         //   System.out.println("Drīkst balsot");
        //}else{
        //    System.out.println("Nedrīkst balsot");
        //}



        //if -else-if(Ja)
        int skaitlisss = 5;
        if (skaitlisss >0) {
            System.out.println(skaitlisss + " ir pozitīvs!");
        } else if (skaitlisss<0) {
            System.out.println(skaitlisss + " ir negatīvs");
        }  else{
            System.out.println(skaitlisss + " ir NULLE!");
        }


        int skaitli = 15;
        if (skaitli == 10){
            System.out.println("Skaitlis = 10");
        } else if (skaitli == 15){
            System.out.println(skaitlis == 15);
        } else if (skaitlis == 20){
            System.out.println("Skailtis = 20");
        } else {
            System.out.println("Skaitlis nezināms");
        }


        //Scanner scanner = new Scanner(System.in);
        //int vecums;
        //boolean canVote = false;
        //System.out.println("Paskaties cilvēka pasē");
        //vecuma = scanner.nextInt();
        //if (vecums >= 18) {
        //    canVote = true;
        //}
        //if(canVote){
        //    System.out.println("Cilvēks var balsot");
        //} else {
        //    System.out.println("Cilvēks nevar balsot");
        //}


        //switch - slēdzis, šo izmantojam tikai tad kad ir zināmi precīzi gadījumi, mēneši, mēneša dienas
        // switch var taisīt gan ar ciparu gan ar tekstu
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("Janvāris");
                break;
            case 2:
                System.out.println("Februāris");
                break;
            case 12:
                System.out.println("Decembris");
                break;
            default:
                System.out.println("Mēnesis" + month + " nav definēts");
        }



        //int skaitlisB = 343;
        //switch (skaitlisB){
       //     case 10:
        //        System.out.println("Skaitlis = 10");
        //        break;
        //    case 15:
        //        System.out.println("Skaitlis = 15");
        //        break;
        //     case 20:
        //        System.out.println("Skaitlis = 20");
        //        break;
        //     default:
        //        System.out.println("Skaitlis nezināms");
        //}

        //1 uzdevums
        int q = 10;
        if (q>0){
            System.out.println("Skaitlis ir lielāks par nulli");
        }

        //2 uzdevums
        int cilvekaVecums = 65;
        char dzimums = 'V';
        boolean drikstDoties = false;

        if(dzimums == 'V' && cilvekaVecums >=65){
            drikstDoties = true;
        } else if (dzimums == 'S' && cilvekaVecums >= 60) {
            drikstDoties = true;
        }

        System.out.println("Cilvēks drīkst doties pensijā " + drikstDoties);


        // 3 uzdevums
        int diena = 7;
        switch (diena){
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
                break;
            case 3:
                System.out.println("Trešdiena");
                break;
            case 4:
                System.out.println("Ceturdiena");
                break;
            case 5:
                System.out.println("Piektdiena");
                break;
            case 6:
                System.out.println("Sestdiena");
                break;
            case  7:
                System.out.println("Svētdiena");
                break;
            default:
                System.out.println("Nav definēts");
        }

        // 4  uzdevums
        //13 % 2 = 1 ; 12 % 2 = 0 (jo nav atlikuma); 15 % 2 =

        int skaitlisX = 15;
        if(skaitlisX%2==0){
            System.out.println("Skaitlis ir pāra");
        }else{
            System.out.println("Skaitlis ir nepāra");
        }







    }
}
