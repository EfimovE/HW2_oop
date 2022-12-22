public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat ("Pushok", 4, "Oleg" ))
                .addAnimal(new Dog ("Chicha", 4, "Petr"))
                .addAnimal(new Duck("Donald", 2, "Ivan"))
                .addAnimal(new Eagle("Gosha", 2, "Alex"))
                .addAnimal(new Dolphin("Willy", 0, "Gleb"))
                .addAnimal(new Penguin("Karl", 2, "Dmitry"));
        System.out.println(zoo);
        System.out.println("Как говорят животные:");
        System.out.println(zoo.talk());
        System.out.println("Скорости бега животных:");
        for (Runable item: zoo.getRunable()) {
            System.out.println(item.runSpeed());
        }
        System.out.println("Скорость чемпиона: ");
        System.out.println(zoo.getChampionSpeed());
        System.out.println("Скорости полёта животных: ");
        for (Flyable item: zoo.getFlyable()) {
            System.out.println(item.flySpeed());
        }
        System.out.println("Скорость плавания животных: ");
        for (Swimable item: zoo.getSwimable()) {
            System.out.println(item.swimSpeed());
        }
        SaverManager saverManager = new SaverManager();
        saverManager.save(zoo.getAnimals());
    }
}