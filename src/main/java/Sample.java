import com.fasterxml.jackson.annotation.JsonProperty;

public record Sample(@JsonProperty("example_property") String exampleProperty) {
}
