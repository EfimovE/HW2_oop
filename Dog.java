public class Dog extends Animal implements Speakable,Runable {

    public Dog(String name, int paws, String owner) {
        super(name, paws, owner);
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }

    @Override
    public String speak() {
        return "woof";
    }

    @Override
    public int runSpeed() {
        return 30;
    }
}