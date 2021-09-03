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
    public static final String FIVE_DAYS_URL = "5day";
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
                .addPathSegment(FIVE_DAYS_URL)
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
        CityResponse cr = objectMapper.readValue(Objects.requireNonNull(responseCity.body()).byteStream(), CityResponse.class);


        Response responseWeather = client.newCall(requestOneDayWeather).execute();
        WeatherResponse wr = objectMapper.readValue(Objects.requireNonNull(responseWeather.body()).byteStream(), WeatherResponse.class);

        for (DailyForecast forecast : wr.getDailyForecasts()){
            System.out.print(
                    "Погода в " + cr.getAdministrativeArea().getLocalizedName() + " на " + forecast.getDate() + "\n" +
                            " будет " +forecast.getDay().getIconPhase() + "\n"+
                            " температура от " + forecast.getTemperature().getMinimum().getValue() + forecast.getTemperature().getMinimum().getUnit() + " до " + forecast.getTemperature().getMaximum().getValue() + forecast.getTemperature().getMinimum().getUnit() + "\n"
            );
        }

    }

}
