public class Duck extends Animal implements Speakable, Runable, Flyable{

    public Duck(String name, int paws, String owner) {
        super(name, paws, owner);
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }


    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Krya";
    }
}