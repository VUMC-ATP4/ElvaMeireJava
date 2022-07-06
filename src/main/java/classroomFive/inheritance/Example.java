package classroomFive.inheritance;

public class Example {

    public static void main(String[] args) {
        Dog dog1 = new Dog(4, "Reksis");
        Octopus octopus1 = new Octopus(8, "Astoņkājis");

        //dog1.legCount = 4;
        //octopus1.legCount = 8;   ievadot iekavās kāju skaitu suņa un astoņkāja vairs šitās divas rindas nav nepieciešamas,
        // 'dog1 un octopus1 mēs aizpildījām manuāli kāju skaitu.
        //dog1.printLegCount();  // uzraksta dog1.un parādās printLegCount ko arī izvēlamies.
        Vista vista1 = new Vista(2, "Baltā vista");
        Vista vistaVienkajis = new Vista(1, "Melnā vista");

        System.out.println(octopus1.waterType);


        Fox lapsa = new Fox("Kūmiņš", 4);

        int[] ieluNumuri = {1,2,3,4,5,6};
        Animal[] dzivnieki = {dog1, octopus1, vista1, vistaVienkajis};

        for (int i = 0; i< dzivnieki.length; i ++){
            dzivnieki[i].printLegCount();
        }








    }


}
