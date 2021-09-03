package javaTestersL7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Maximum {
    @JsonProperty("Value")
    private String value;

    @JsonProperty("Unit")
    private String unit;

    public Maximum(){

    }

    public Maximum(String value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
