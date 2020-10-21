import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class htmlFileGenerator implements FileGenerator {
    @Override
    public void generate(List<Persona> personas, FileWriter writer) throws IOException {
        writer.write("<html>");
        writer.write("<head>");

        writer.write("<title>");
        writer.write("Personas");
        writer.write("</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<table>");
        writer.write("<tr>");
        writer.append("<td>").append("Name").append("</td>");
        writer.append("<td>").append("Email").append("</td>");
        writer.append("<td>").append("Phone").append("</td>");
        writer.append("<td>").append("Company").append("</td>");
        writer.append("</tr>");
        for(Persona persona : personas){
            writer.write("<tr>");
            writer.append("<td>").append(persona.getName()).append("</td>");
            writer.append("<td>").append(persona.getEmail()).append("</td>");
            writer.append("<td>").append(persona.getPhone()).append("</td>");
            writer.append("<td>").append(persona.getCompany()).append("</td>");
            writer.write("</tr>");
        }

        writer.write("</table>");
        writer.write("</body>");
        writer.write("</html>");
    }
}
