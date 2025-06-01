package me.diego.ticket;

public class FeatureRequest implements TicketType {
  private static FeatureRequest featureRequest = new FeatureRequest();

  private FeatureRequest() {}

  public static FeatureRequest getFeatureRequest() {
    return featureRequest;
  }
}
