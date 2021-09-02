package javaTestersL7;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private String EffectiveDate;
    private String Text;
    private String Unit;


    public WeatherResponse() {

    }

    @JsonCreator
    public WeatherResponse(@JsonProperty("EffectiveDate") String effectiveDate,
                           @JsonProperty("Text") String text,
                           @JsonProperty("Unit") String unit) {
        this.EffectiveDate = effectiveDate;
        this.Text = text;
        this.Unit = unit;
    }

    public String getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.EffectiveDate = effectiveDate;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        this.Text = text;
    }


    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        this.Unit = unit;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "EffectiveDate='" + EffectiveDate + '\'' +
                ", Text='" + Text + '\'' +
                ", Unit='" + Unit + '\'' +
                '}';
    }
}

