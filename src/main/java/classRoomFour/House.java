package classRoomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    double platiba;
   Cena cena;
    boolean irStavvieta;


    //ja mums vajag zintan m2 , mums ir zinama summa un platība
    public double cenaKvadratmetra(){
        return cena.cena/platiba;
    }

public void printetAdresi(){
    System.out.println("Mājas adrese ir: " + ielasNosaukums + "" + majasNumurs);
}
public void printetPapildusinfo(){
    System.out.println("Mājai ir : " + stavuSkaits + "" + ieejuSkaits + "" + istabuSkaits + "" + platiba + "" + irStavvieta);
}
}












