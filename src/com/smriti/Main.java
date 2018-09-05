package com.smriti;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /////////////Smriti
        Animal animal = new Animal();
        System.out.println("Smriti " + animal.getName());

        LifeForms lifeform = (LifeForms)animal;
        System.out.println("Smriti " + lifeform.getName());
        /////////////////// End Smriti
    }
}
class Rocks {
    String getName() {
        return "Animal";
    }
}
class Animal extends LifeForms {
    String getName() {
        return "Animal";
    }
}

class Human extends  Animal{
    String getName() {
        return "Human";
    }
}

class Person extends Human {

}

class LifeForms {
    String getName() {
        return "Lifeform";
    }
}
// Animals
/// Plants
// VirusS