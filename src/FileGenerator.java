import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public interface FileGenerator {
    public void generate(List<Persona> personas, FileWriter writer) throws IOException;
}
