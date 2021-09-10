package javaTestersL7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {

    @JsonProperty("IconPhrase")
    private String iconPhase;

    public Day(){}

    public Day(String iconPhase) {
        this.iconPhase = iconPhase;
    }

    public String getIconPhase() {
        return iconPhase;
    }

    public void setIconPhase(String iconPhase) {
        this.iconPhase = iconPhase;
    }

    @Override
    public String toString() {
        return "Day{" +
                "iconPhase='" + iconPhase + '\'' +
                '}';
    }
}
