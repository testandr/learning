package javaTestersL7;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private String LocalizedName;

    public WeatherResponse() {

    }

    public WeatherResponse(String localizedName) {
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
        return "WeatherResponse{" +
                "LocalizedName='" + LocalizedName + '\'' +
                '}';
    }
}

