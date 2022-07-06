package classroomFive.inheritance;

public class Animal {
 int legCount;
 String name;

 public Animal (int legCount, String name) {
  this.legCount = legCount;
  this.name = name;

 }

 public void printLegCount(){
  System.out.println("Vārds : " + name + "Kāju skaits ir: " + legCount);  // lai uz ekrāna izvadītu kāju skaitu visās
 }

 public void makeSound() {
  System.out.println("Es esmu dzīvnieks. Arhgghhhh....");
 }






}
