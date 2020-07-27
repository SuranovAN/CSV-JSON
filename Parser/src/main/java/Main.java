import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = ParserCSV.parseCSV(columnMapping, fileName);
        String json = ParserCSV.listToJson(list);
        File jsonFile = new File("data.json");
        try(FileWriter fw = new FileWriter(jsonFile)) {
            jsonFile.createNewFile();
            fw.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}