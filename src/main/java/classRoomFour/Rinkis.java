package classRoomFour;

public class Rinkis {
    final double PI = 3.14; //final lai kāds nenomainītu vērtību, ja ieliel privat final - tad neviens nevares no citam klasem pieprasit
    double radiuss ;

    //konstruktors
    Rinkis(){
        System.out.println("Veidoju riņķi ...");
    }

    // vel viens konstruktors, padod info uzreiz
    Rinkis(double radiuss){
        this.radiuss = radiuss;
    }

    public double rinkaLaukums() {
        return PI * (radiuss * radiuss);
    }
}
