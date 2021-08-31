package javaTestersL7;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String test = "{\"Version\":1,\"Key\":\"2-242405_1_AL\",\"Type\":\"City\",\"Rank\":30,\"LocalizedName\":\"Chisinau\",\"EnglishName\":\"Chișinău\",\"PrimaryPostalCode\":\"\",\"Region\":{\"ID\":\"EUR\",\"LocalizedName\":\"Europe\",\"EnglishName\":\"Europe\"},\"Country\":{\"ID\":\"MD\",\"LocalizedName\":\"Moldova\",\"EnglishName\":\"Moldova\"},\"AdministrativeArea\":{\"ID\":\"CU\",\"LocalizedName\":\"Chișinău\",\"EnglishName\":\"Chișinău\",\"Level\":1,\"LocalizedType\":\"City\",\"EnglishType\":\"City\",\"CountryID\":\"MD\"},\"TimeZone\":{\"Code\":\"EEST\",\"Name\":\"Europe/Chisinau\",\"GmtOffset\":3.0,\"IsDaylightSaving\":true,\"NextOffsetChange\":\"2021-10-31T00:00:00Z\"},\"GeoPosition\":{\"Latitude\":47.027,\"Longitude\":28.842,\"Elevation\":{\"Metric\":{\"Value\":36.0,\"Unit\":\"m\",\"UnitType\":5},\"Imperial\":{\"Value\":118.0,\"Unit\":\"ft\",\"UnitType\":0}}},\"IsAlias\":true,\"ParentCity\":{\"Key\":\"242405\",\"LocalizedName\":\"Chișinău\",\"EnglishName\":\"Chișinău\"},\"SupplementalAdminAreas\":[],\"DataSets\":[\"AirQualityCurrentConditions\",\"AirQualityForecasts\",\"Alerts\",\"ForecastConfidence\",\"FutureRadar\",\"MinuteCast\",\"Radar\"]}";
        WeatherResponse weather = objectMapper.readValue(test, WeatherResponse.class);
        System.out.println(weather.toString());

    }

}