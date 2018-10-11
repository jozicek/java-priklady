package testy.aktivities;

import testy.aktivities.gateway.SlovakNearestCityServiceClient;
import testy.aktivities.gateway.SlovakWeatherForecastServiceClient;
import testy.aktivities.gateway.NearestCityServiceClient;
import testy.aktivities.gateway.WeatherServiceClient;
import testy.aktivities.repository.ActivitiesRepository;
import testy.aktivities.repository.DefaultActivitiesRepository;
import testy.aktivities.service.ActivitiesService;
import testy.aktivities.service.DefaultActivitiesService;
import testy.aktivities.service.MobilePhoneLocationProvider;
import testy.aktivities.service.LocationProvider;

public class ActivityApp {

  public static void main(String[] args) {


    NearestCityServiceClient nearestCityServiceClient = new SlovakNearestCityServiceClient();
    WeatherServiceClient weatherServiceClient = new SlovakWeatherForecastServiceClient();
    ActivitiesRepository activitiesRepository = new DefaultActivitiesRepository();
    LocationProvider locationProvider = new MobilePhoneLocationProvider();


    ActivitiesService activitiesService = new DefaultActivitiesService(nearestCityServiceClient,
        weatherServiceClient,
        activitiesRepository,
        locationProvider);

    System.out.println(activitiesService.pickActivity());
  }

}
