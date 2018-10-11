package testy.aktivities.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DefaultActivitiesRepository implements ActivitiesRepository{

  List<String> niceWeatherActivities = Arrays.asList("Chod napriklad do parku.", "Zabehaj si.", "Mozes si zahrat tenis.");
  List<String> badWeatherActivities = Arrays.asList("Sed radsej doma.", "Zbehni do kina.", "Utekaj do krcmy.");

  @Override
  public String getRandomActivity(final String weather) {

    Random random = new Random();

    if(weather.equals("pekne")){
      return niceWeatherActivities.get(random.nextInt(3));
    }else{
      return badWeatherActivities.get(random.nextInt(3));
    }
  }
}
