package testy.aktivities.service;

public class MobilePhoneLocationProvider implements LocationProvider{
  @Override
  public int getLattitude() {
    return 1;
  }

  @Override
  public int getLongitude() {
    return 2;
  }
}
