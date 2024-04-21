//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal  Cat = new Cat();
        Animal Sparrow  = new Sparrow();
        Animal GoldFish= new GoldFish();
        Animal Turtle  = new Turtle();
        Cat.move();

        Turtle.move();
        Turtle.swim();

        Sparrow.move();
        Sparrow.fly();

        GoldFish.move();
        GoldFish.swim();
    }
}

