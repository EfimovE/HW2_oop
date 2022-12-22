import java.util.List;
import java.io.*;

public class SaverManager {
    public void save(List<Animal> animals) {
        try (FileWriter writer = new FileWriter("list.txt", false)) {
            for (Animal item : animals) {
                writer.write(item.toString() + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}