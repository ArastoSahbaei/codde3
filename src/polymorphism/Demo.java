package polymorphism;

public class Demo
{
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.makeNoise();

        Animal a2 = new Dog();
        a2.makeNoise();
    }
}