import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk(){
        StringBuilder stringbuilder = new StringBuilder();
        for (Speakable item: getSpeakable()) {
            stringbuilder.append(item.speak()+ "\n");
        }
        return stringbuilder.toString();
    }
    private List<Speakable> getSpeakable(){
        List<Speakable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Speakable){
                result.add((Speakable) item);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<Runable> getRunable(){
        List<Runable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Runable){
                result.add((Runable) item);
            }
        }
        return result;
    }
    public int getChampionSpeed(){
        int max = 0;
        for (Runable item:getRunable()) {
            if (item.runSpeed() > max){
                max = item.runSpeed();
            }
        }
        return max;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Swimable){
                result.add((Swimable) item);
            }
        }
        return result;
    }

}