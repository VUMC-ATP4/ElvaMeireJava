package classroomTwo;

public class Metodes {
    public static void main(String[] args) {
        System.out.println("Sākās koda izpilde") ;
        printetText();
        System.out.println("beidzās koda izpilde");
        printetText();
        printetText();
        switchPiemers();

        int a = 10;
        int b = 50;
        int laukums = aprekinatKvadratLaukumu(a,b);
        System.out.println(laukums);

        loginUbPage("Juris123","parole123");


    }
    static void loginUbPage(String username, String password){
        System.out.println("Ievadām lietotāja vārdu" + username);
        System.out.println("Ievadām lietotāja paroli" + password);
    }
    static int aprekinatKvadratLaukumu (int a, int b){
        return a*b;
    }
    static void switchPiemers(){
        int skaitlisB = 343;
        switch (skaitlisB) {
            case 10:
                System.out.println("Skaitlis = 10");
                break;
            case 15:
                System.out.println("Skaitlis = 15");
                break;
            case 20:
                System.out.println("Skaitlis = 20");
                break;
            default:
                System.out.println("Skaitlis nezināms");
        }
    }
    static void printetText(){
        System.out.println("šī ir mana metode sākums");
        System.out.println("Es izsaucu šo metodi beigas");
    }

}
