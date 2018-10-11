package testy.aktivities.gateway;

public class SlovakWeatherForecastServiceClient implements WeatherServiceClient {
  @Override
  public String getWeatherForecastFor(final String city) {
    switch (city) {
      case "Zilina":
        return "pekne";
      case "Kosice":
        return "skaredo";
      case "Bratislava":
        return "pekne";
      default:
        throw new IllegalArgumentException("Take mesto nepoznam");
    }
  }
}
