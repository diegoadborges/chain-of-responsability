package me.diego.ticket;

public class AppCrashes implements TicketType {
  private static AppCrashes appCrashes = new AppCrashes();

  private AppCrashes() {}

  public static AppCrashes getAppCrashes() {
    return appCrashes;
  }
}
