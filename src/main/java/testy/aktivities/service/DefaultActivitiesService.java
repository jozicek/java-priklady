package testy.aktivities.service;

import testy.aktivities.gateway.NearestCityServiceClient;
import testy.aktivities.gateway.WeatherServiceClient;
import testy.aktivities.repository.ActivitiesRepository;

public class DefaultActivitiesService implements ActivitiesService{


  private NearestCityServiceClient nearestCityServiceClient;
  private WeatherServiceClient weatherServiceClient;
  private ActivitiesRepository activitiesRepository;
  private LocationProvider locationProvider;

  public DefaultActivitiesService(final NearestCityServiceClient nearestCityServiceClient,
                                  final WeatherServiceClient weatherServiceClient,
                                  final ActivitiesRepository activitiesRepository,
                                  final LocationProvider locationProvider) {
    this.nearestCityServiceClient = nearestCityServiceClient;
    this.weatherServiceClient = weatherServiceClient;
    this.activitiesRepository = activitiesRepository;
    this.locationProvider = locationProvider;
  }

  @Override
  public String pickActivity() {
    String nearestCity = nearestCityServiceClient.find(locationProvider.getLattitude(), locationProvider.getLongitude());
    String weather = weatherServiceClient.getWeatherForecastFor(nearestCity);
    return "V meste " + nearestCity + " je dneska " + weather + ". " + activitiesRepository.getRandomActivity(weather);
  }
}
