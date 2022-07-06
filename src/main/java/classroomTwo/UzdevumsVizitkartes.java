package classroomTwo;

import java.util.Scanner;

public class UzdevumsVizitkartes {
    public static void main(String[] args) {

        //var pievienot rakstīt šādi 1
        //Scanner scanner = new Scanner(System.in);

        printetVizitkarti("Janis", "Kreilis", "+371 2569852", 1996);
        printetVizitkarti("Kārlis", "Zeltiņš", "+371 2560852", 1993);
        printetVizitkarti("Inese", "Valge", "+371 2569853", 1995);
        printetVizitkarti("Oskars", "Jasmins", "+371 2569842", 1994);
        //luksafors("violeta");
        //int summa =18;  sum metodes rezultāts ir tas pats int
        sum(5, 3, 10);

        //otro vizitkarti mes varam izdrukāt divos veidos
        System.out.println(printBuisnessCardTwo("Oskars", "Jasmins", "+371 2569842", 1994));
        String oskaraVizitKarte = printBuisnessCardTwo("Oskars", "Jasmins", "+371 2569842", 1994);
        System.out.println(oskaraVizitKarte);


        // lai izvadītu 1 - te varēs ierakstīt krāsas un tiks dota atbilde
        //luksafors(scanner.nextLine());
        //luksafors(scanner.nextLine());
        //luksafors(scanner.nextLine());

        //luksaforsDivi(scanner.nextLine());   nevaru saprast, kāpēc neatrod

        //Metode kas pieņem 3 veselus skaitlus un atgriez so skaitlu summu


        // String name = "Juris";
        // String surname = "Kreilis";
        // String telephone = "+371 6658965";
        // int dateOfBirth = 1990;
        // System.out.println("Vizītkarte");
        // System.out.println("##########");
        // System.out.println("Vārds: "  + name);
        // System.out.println("Uzvārds: " + surname);
        // System.out.println("Telefona numurs: " + telephone);
        // System.out.println("Dzimšanas gads: " + dateOfBirth);
        // System.out.println("###########");
    }

    static int sum(int asdas, int yyisjdj, int daksks) {
        return asdas + yyisjdj + daksks;
    }


    static void printetVizitkarti(String name, String surname, String telephone, int dateOfBirth) {
        //String name = "Juris";
        //String surname = "Kreilis";
        //String telephone = "+371 6658965";
        //int dateOfBirth = 1990;
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telephone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("###########");
    }

    //Lai printē vizitkarti neprintē neko ārā, bet atgriež jau noformatētu String , tad Main metodē
    //uzrakstīšu sout.. printēt vizītkarti
    static String printBuisnessCardTwo(String name, String surname, String telephone, int dateOfBrith) {
        return "#######\nVizītkarte\nVārds: " + name + "\nUzvārds: " + surname + "" + "\nTelefona nr: " + telephone + "\nDzimšanas gads: " + dateOfBrith + "\n#########";
    }


    //  static void luksaforsDIVI(){
//            Scanner scanner = new Scanner(System.in);
//            String zals = "Zaļš";
//            String dzeltens = "Dzeltens";
//            String sarkans = "Sarkans";
//            System.out.println("Lūdzu ievadi kādu no luksafora krāsām!");
//            String gaisma = scanner.nextLine();
//            boolean isGreen = zals.equals(gaisma);
//            boolean isYellow = dzeltens.equals(gaisma);
//            boolean isRed = sarkans.equals(gaisma);
//
//            if(isGreen){
//                System.out.println("Ejam");
//            } else if (isYellow) {
//                System.out.println("Gatavoties!");
//            } else if (isRed) {
//                System.out.println("Stāvam");
//            }else {
//                System.out.println("Luksaforā nav tādas krāsas");
//            }


}






