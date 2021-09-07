package javaTestersL8;

public class Weather {
    private String city;
    private String date;
    private String weatherDescription;
    private String temperature;

    public Weather(String city, String date, String weatherDescription, String temperature) {
        this.city = city;
        this.date = date;
        this.weatherDescription = weatherDescription;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", text='" + weatherDescription + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}
