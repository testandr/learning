package javaTestersL7;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityResponse {

    @JsonProperty("AdministrativeArea")
    private AdministrativeArea administrativeArea;

    public CityResponse(){}

    public CityResponse(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @Override
    public String toString() {
        return "CityResponse{" +
                "administrativeArea=" + administrativeArea +
                '}';
    }
}
