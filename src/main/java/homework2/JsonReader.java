package homework2;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    private ObjectMapper mapper = new ObjectMapper();

    public List<Student> readJson(String path) throws IOException {
        InputStream inputStream = JsonReader.class.getClassLoader().getResourceAsStream(path);
        return mapper.readValue(inputStream, new TypeReference<List<Student>>() {});
    }
}
