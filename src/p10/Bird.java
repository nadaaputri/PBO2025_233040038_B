package p10;

public class Bird extends Animal implements Flyable {

    @Override

    public void fly() {
        System.out.println("Burung terbang menggunakan sayap");
    }

    @Override
    public void sound() {
        System.out.println("wekwek");
    }
}
