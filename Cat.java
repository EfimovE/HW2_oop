public class Cat extends Animal implements Speakable, Runable{

    @Override
    public String toString() {
        return "Cat" +super.toString();
    }

    public Cat(String name, int paws, String owner) {
        super(name, paws, owner);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public int runSpeed() {
        return 20;
    }


}