package Polymorphism;


public class HerdMain {

    public static void main(String[] args) {
       
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Oscar");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}