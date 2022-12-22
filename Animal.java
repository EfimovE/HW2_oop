public abstract class Animal {
    String name;
    int paws;
    String owner;


    public Animal(String name, int paws, String owner) {
        this.name = name;
        this.paws = paws;
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", paws=" + paws +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return paws;
    }

    public String getOwner() {
        return owner;
    }
}