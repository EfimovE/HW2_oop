public class Dolphin extends Animal implements Swimable, Speakable {

    public Dolphin(String name, int paws, String owner) {
        super(name, paws, owner);
    }

    @Override
    public String toString() {
        return "Dolphin" + super.toString();
    }

    @Override
    public String speak() {
        return "ooouuiii";
    }

    @Override
    public int swimSpeed() {
        return 50;
    }
}