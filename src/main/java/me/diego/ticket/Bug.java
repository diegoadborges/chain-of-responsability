package me.diego.ticket;

public class Bug implements TicketType {
  private static Bug bug = new Bug();

  private Bug() {}

  public static Bug getBug() {
    return bug;
  }
}
