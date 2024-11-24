import com.fasterxml.jackson.jr.annotationsupport.JacksonAnnotationExtension;
import com.fasterxml.jackson.jr.ob.JSON;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var json = JSON.builder()
                .register(JacksonAnnotationExtension.std)
                .build();

        var sample = new Sample("example value");

        System.out.println("Record to JSON:");
        var jsonSample = json.asString(sample);
        System.out.println(jsonSample);

        System.out.println("JSON to Record:");
        var sampleFromJson = json.beanFrom(Sample.class, jsonSample);
        System.out.println(sampleFromJson);
    }
}
