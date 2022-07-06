package classRoomFour;

public class Main {

    public static void main(String[] args) {
        House majaViens = new House();
        majaViens.majasNumurs = 1;
        majaViens.ielasNosaukums = "Brīvības iela ";
        majaViens.stavuSkaits = 2;
        majaViens.ieejuSkaits = 1;
        majaViens.istabuSkaits = 5;
        majaViens.platiba = 120.50;
        majaViens.irStavvieta = true;
        majaViens.cena = new Cena();
        Cena cena1 = new Cena();
        cena1.cena=30000;
        cena1.valuta = '$';
        majaViens.cena = cena1;

        majaViens.printetAdresi();
        majaViens.printetPapildusinfo();


        House majaDivi = new House();
        majaDivi.majasNumurs = 2;
        majaDivi.ielasNosaukums = "Ģertrūdes iela ";
        majaDivi.printetAdresi();

        // ir kādas izmaiņas un jāmaina mājaiDivi ielas nosaukums
        majaDivi.ielasNosaukums = "Izmainīts nosaukums ";
        majaDivi.printetAdresi();

        // jauns velosipeda objekts
        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "Disku";
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;
        System.out.println(velosipeds1.atrumi);
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        System.out.println("Priekšā ir gājējs");
        velosipeds1.bremze();
        System.out.println("Velosipēda ātrums ir = " + velosipeds1.atrums);
        velosipeds1.bremze();
        velosipeds1.bremze();

        //kaķis
        Cat cat = new Cat();
        cat.suga = "Jauktenis";
        cat.krasa = "Daudzkrāsains";
        cat.vecums = 5;
        cat.cena = 10;
        cat.printetCatInfo();

        //Riņķis

        Rinkis rinkis2 = new Rinkis();

        rinkis2.radiuss = 15.30;

        Rinkis rinkis1 = new Rinkis(5.34);  // divi dažādi veidi kā nodefinēt

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());





    }

}
