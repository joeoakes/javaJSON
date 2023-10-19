import com.google.gson.Gson;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Serialization
        Student student = new Student("John Doe", 20);
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);

        // Deserialization
        String inputJsonString = "{\"name\":\"Jane Doe\",\"age\":25}";
        Student deserializedStudent = gson.fromJson(inputJsonString, Student.class);
        System.out.println(deserializedStudent.name + " is " + deserializedStudent.age + " years old.");
    }
}
