/**
 * Created by Vaas on 18.11.2015.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonFileSerializer implements Serializer {
    private Gson gson;
    private BufferedWriter writer;
    private BufferedReader reader;

    public JsonFileSerializer() {
        gson = new Gson();
    }

    public <T> void Serialize(T obj, String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(path));
        writer.write(gson.toJson(obj));
        writer.close();
    }

    public <T> T Deserialize(String path, Class<T> type) throws IOException {
        reader = new BufferedReader(new FileReader(path));
        T obj = gson.fromJson(reader, type);
        reader.close();

        return obj;
    }
}
