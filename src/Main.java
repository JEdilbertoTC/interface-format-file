import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    private static final Map<String, FileGenerator> fileGeneratorMap = new HashMap<>();

    static{
        fileGeneratorMap.put("html", new htmlFileGenerator());
        fileGeneratorMap.put("xml",new xmlFileGenerator());
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Persona> personas = new LinkedList<>();
        File file = new File(args[0]);
        readInput(personas, file);

        File outputFile = new File(args[1]);
        try (FileWriter writer = new FileWriter(outputFile)){
            String extension = args[1].substring(args[1].lastIndexOf(".")+1);
            FileGenerator fileGenerator = fileGeneratorMap.get(extension);
            fileGenerator.generate(personas,writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readInput(List<Persona> personas, File file) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            String line;
            scanner.nextLine();
            while (scanner.hasNext()) {
                String[] items = scanner.nextLine().split("\\|");
                Persona persona = new Persona(items[0], items[1], items[2], items[3]);
                personas.add(persona);
            }
        }
    }
}

