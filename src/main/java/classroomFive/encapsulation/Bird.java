package classroomFive.encapsulation;

 public class Bird {
     public String name;

     public void printText(){ // varam piekļūt no citām klasēm
         System.out.println("Šī ir publiska metode");
         System.out.println("Printēju putnu");
         printTextSpecial();
     }

     private void printTextSpecial(){ // varam piekļut no šīs klases
         System.out.println("Šī ir privāta metode");
     }

     void defultMethofExample(){  // varak piekļut pakotnes ietvaros
         System.out.println("Šī ir defult metode" +
                 "");
     }

}
