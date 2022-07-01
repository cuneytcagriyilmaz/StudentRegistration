package Services;

import Models.Student;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonService {

    Student student = new Student();

    // Added IOException to all method
    public JsonService() throws IOException {

        //Reading json file as String
        String data = new String(Files.readAllBytes(Paths.get("src/main/resources/Students.JSON")));

        // Importing String data JsonArray:
        JSONArray jsonArray = new JSONArray(data);

        // For loop that will traverse the entire array and get all the data
        for(int i = 0; i < jsonArray.length(); i++){

            String str = jsonArray.get(i).toString();
            JSONObject object1 = new JSONObject(str);

            //Values read from JSON passed to Student variables.
            String name = object1.getString("name");
            String surname = object1.getString("surname");
            int age = object1.getInt("age");

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Age: " + age);

        }
    }
}
