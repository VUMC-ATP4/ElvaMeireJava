package classroomFive.statika;

public class Main {
    public static void main(String[] args) {
        Car auto1 = new Car("BMW", "melns");
        Car auto2 = new Car("Mersedes", "balts");
        auto1.klasesApraksts = "šī ir auto klase";
        System.out.println("auto1:" + auto1.getColor() + "" + auto1.getName() + auto1.klasesApraksts);
        System.out.println("auto2:" + auto2.getColor() + "" + auto1.getName() + auto2.klasesApraksts);
    }
}
