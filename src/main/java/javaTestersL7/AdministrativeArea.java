package javaTestersL7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdministrativeArea {
    @JsonProperty("LocalizedName")
    private String localizedName;

    @JsonProperty("CountryID")
    private String countryID;

    public AdministrativeArea(){}

    public AdministrativeArea(String localizedName, String countryID) {
        this.localizedName = localizedName;
        this.countryID = countryID;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "AdministrativeArea{" +
                "localizedName='" + localizedName + '\'' +
                ", countryID='" + countryID + '\'' +
                '}';
    }
}
