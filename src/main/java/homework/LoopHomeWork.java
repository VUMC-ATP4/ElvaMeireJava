
package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LoopHomeWork {
        public static void main(String[] args) {
                // 1.uzdevums
                int a = 0;
                while (a <= 101) {
                        System.out.println(+a);
                        a = a + 1;
                        if (a == 101) {
                                System.out.println("Gatavs");
                                break;
                        }
                }
                //2. uzdevums

                System.out.println("Šis skaitlis ir pirmskaitlis : 2 ");
                System.out.println("Šis skaitlis ir pirmskaitlis : 3 ");

                for (int b = 4; b <= 30; b++) {

                        if ((b % 2 == 0) || (b % 3 == 0) || (b % 5 == 0) || (b == 2) || (b == 3)) {
                                System.out.println("Šis cipars mums neder " + b);
                        } else {

                                System.out.println("Šis cipars ir pirmskaitlis : " + b);
                        }

                }

                // 3. uzdevums

                int[] vienasIelasMajasNmuri = {1, 3, 5, 7, 9, 11};
                int counter = 0;
                while (counter < vienasIelasMajasNmuri.length) {
                        System.out.println(vienasIelasMajasNmuri[counter]);
                        counter++;
                }
                Scanner scanner = new Scanner(System.in);
                String[] latvijasNovadi = new String[4];
                latvijasNovadi[0] = "Latgale ";
                latvijasNovadi[1] = "Vidzeme ";
                latvijasNovadi[2] = "Zemgale ";
                latvijasNovadi[3] = "Kurzeme ";

                for (int i = 0; i < latvijasNovadi.length; i++) {
                        System.out.println(latvijasNovadi[i]);
                }


                char valuta = '$';
                do {
                        System.out.println("Ievadi dollara valūtas zīmi: "  );
                        valuta = (char) scanner.nextInt(valuta);
                } while (valuta == '$');

                // 4. uzdevums


                for (int i = 1; i <=100; i++) {
                        System.out.println("i");
                        if((i%2==0)){
                                System.out.println(i);
                        }
        }

        }
}
