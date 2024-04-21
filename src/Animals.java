
class Animal {
    public void move() {

    }

    public void fly() {

    }

    public void swim() {
    }
}


class Cat  extends Animal {
    @Override
    public void swim() {
        System.out.println("I can swim.");
    }
}

class Sparrow extends Animal {
    @Override
    public void fly() {
        System.out.println("I can fly.");
    }
}

class GoldFish extends Animal {
    @Override
    public void swim() {
        System.out.println("I can swim.");
    }
}

class Turtle extends Animal {
    @Override
    public void swim() {
        System.out.println("I can swim.");
    }
}


























