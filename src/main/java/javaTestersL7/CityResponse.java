package javaTestersL7;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityResponse {
    private String LocalizedName;

    public CityResponse(){}

    @JsonCreator
    public CityResponse(@JsonProperty("LocalizedName") String localizedName) {
        this.LocalizedName = localizedName;
    }

    public String getLocalizedName() {
        return LocalizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.LocalizedName = localizedName;
    }

    @Override
    public String toString() {
        return LocalizedName;
    }
}
