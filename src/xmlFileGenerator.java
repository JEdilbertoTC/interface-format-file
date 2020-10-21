import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class xmlFileGenerator implements FileGenerator {
    @Override
    public void generate(List<Persona> personas, FileWriter writer) throws IOException {
        writer.write("<Persona>");
        writer.write("<tr>");
        writer.append("<td>").append("Name").append("</td>");
        writer.append("<td>").append("Email").append("</td>");
        writer.append("<td>").append("Phone").append("</td>");
        writer.append("<td>").append("Company").append("</td>");
        writer.append("</tr>");
        for(Persona persona : personas){
            writer.write("<persona>");
            writer.append("<name>").append(persona.getName()).append("</name>");
            writer.append("<email>").append(persona.getEmail()).append("</email>");
            writer.append("<phone>").append(persona.getPhone()).append("</phone>");
            writer.append("<company>").append(persona.getCompany()).append("</company>");
            writer.write("</persona>");
        }

        writer.write("</Persona>");
    }
}
