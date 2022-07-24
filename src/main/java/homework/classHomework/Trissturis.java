package homework.classHomework;

public class Trissturis {
    String trissturis;
    int a = 10;
    int b = 10;
    int c =15;
    double laukums;
    Trissturis (){
        System.out.println("Veidoju trīstūri ...");
    }

    Trissturis (double laukums){
        this.laukums  = laukums;

    }

    public double getLaukums() {
        return ((a + b + c) /2 );
    }

}
