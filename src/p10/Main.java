package p10;
public class Main{
    public void main(String[] args){
        Dog d = new Dog();
        d.sound();
        d.eat();
        Bird b = new Bird();
        b.fly();
        b.eat();
        b.sound();

        Airplane a = new Airplane();
        a.fly();
    }
}
