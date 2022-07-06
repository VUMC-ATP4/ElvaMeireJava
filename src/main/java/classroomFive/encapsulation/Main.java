package classroomFive.encapsulation;

public class Main {


    public static void main(String[] args) {
        Bird putns = new Bird();
        putns.name =  "Polija";
        putns.printText();
        //putns.printTextSpecial(); nevar izsaukt jo privāta metode

        Human cilveks = new Human();
        cilveks.setAge(20);
        System.out.println(cilveks.getAge());
        cilveks.setName("Kārlis");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Indriksons");
        System.out.println(cilveks.getSurname());
        cilveks.setHeight( 2 );                     // Ņemam vērā set...
        System.out.println(cilveks.getHeight());    // Ņemam vērā get...

        Matematika matematika = new Matematika();
        matematika.add(30,20);
        matematika.add(1.3, 3.5);
        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Juris", true);
        matematika.paraditTekstu("Juris", false);



    }
}
