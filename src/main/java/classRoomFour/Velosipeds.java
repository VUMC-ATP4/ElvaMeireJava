package classRoomFour;

public class Velosipeds {
    int atrums;
    int atrumi = 21;
    String nosaukums = "Specialized";
    String krasa = "Zaļa";
    int svarsGramos;
    double rataIzmersCollas;
    String bremzuTips;

    //viena metode kas samazinas atrumu - bremzet
    public void bremze(){

        // ja girbam uzrakstis, ja bremzu tips v , ja disku bremze atrak
                    //if(bremzuTips.equals("V-veida")) {
                        //atrums=atrums -2;
                        //}else if (bremzuTips.equals("Disku"))
                        //atrums = atrums -3;
                        //}else {
                        //atrums = atrums -1;

        atrums--;  //atrums = atrums -2;
    }

    //otra metode samazinam atrumu
    public void spiedPedalus(){
        atrums++;
    }
}
