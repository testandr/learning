package javaTestersL7;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main {
    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String ONE_DAY_URL = "1day";
    public static final String LOCATIONS = "locations";
    public static final String API_V = "v1";
    public static final String CITY_ID = "2-242405_1_AL";
    public static final String API_KEY = "TpzDN4DaUsgaVRgUrDmK6ho2Gbj7Kw5L";


    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();
        HttpUrl cityUrl = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(API_V)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey", API_KEY)
                .build();

        HttpUrl oneDayUrl = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(FORECAST_URL)
                .addPathSegment(API_V)
                .addPathSegment(DAILY_URL)
                .addPathSegment(ONE_DAY_URL)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey", API_KEY)
                .build();

        Request requestCity = new Request.Builder()
                .url(cityUrl)
                .build();

        Request requestOneDayWeather = new Request.Builder()
                .url(oneDayUrl)
                .build();

        Response responseCity = client.newCall(requestCity).execute();
        String city = Objects.requireNonNull(responseCity.body()).string();
        System.out.println(city);


        CityResponse cN = objectMapper.readValue(city, CityResponse.class);
        String cityName = cN.toString();

        Response responseWeather = client.newCall(requestOneDayWeather).execute();
        String weather = Objects.requireNonNull(responseWeather.body()).string();
        System.out.println(weather);
        JsonNode day = objectMapper
                .readTree(weather)
                .at("/HeadLine/EffectiveDate");
        String selectedDay = day.asText();

        JsonNode text = objectMapper
                .readTree(weather)
                .at("/HeadLine/Text");
        String weatherText = text.asText();

        JsonNode minimumTemperature = objectMapper
                .readTree(weather)
                .at("/DailyForecasts/Temperature/Minimum/Value");
        String minTemp = minimumTemperature.asText();

        JsonNode maximumTemperature = objectMapper
                .readTree(weather)
                .at("/DailyForecasts/Temperature/Maximum/Value");
        String maxTemp = maximumTemperature.asText();

        System.out.println("В городе " + cityName + " " + selectedDay + " будет " + weatherText + " а температура от " + minTemp + " до " + maxTemp);


    }

}
