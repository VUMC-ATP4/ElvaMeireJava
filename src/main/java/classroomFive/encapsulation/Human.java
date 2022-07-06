package classroomFive.encapsulation;

import java.awt.dnd.DragGestureEvent;

public class Human {
    private int age;
    private String name;
    private String surname;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Vecums nav pareizs. ");
            //throw new IllegalAccessException();   // izmet uz ekrāna kļūdas paziņojumu man viņš rāda kļūdu pašā pierakstā
        } else {
            this.age = age;
        } }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getSurname () {
            return surname;
        }

        public void setSurname (String surname){
            this.surname = surname;
        }

        public double getHeight () {
            return height;
        }

        public void setHeight ( double height){
            this.height = height;
        }
    }

