package testy.aktivities.gateway;

public class SlovakNearestCityServiceClient implements NearestCityServiceClient {

  @Override
  public String find(final int lattitude, final int longitude) {
    if (lattitude == longitude) {
      return "Zilina";
    }
    if (lattitude > longitude) {
      return "Bratislava";
    }
    return "Kosice";
  }
}
