package com.src.TypeCasting;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

public class DowncastingInheritance {
    public static void main(String[] args) {
       
        Animal animalDog = new Dog(); 
        Animal animalCat = new Cat(); 

        Dog dog = (Dog) animalDog;
        dog.bark();

        Cat cat = (Cat) animalCat; 
        cat.meow(); 

        
        Dog anotherDog = (Dog) animalDog;
        anotherDog.bark();
    }
}

