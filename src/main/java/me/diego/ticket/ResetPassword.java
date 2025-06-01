package me.diego.ticket;

public class ResetPassword implements TicketType {
  private static ResetPassword resetPassword = new ResetPassword();

  private ResetPassword() {}

  public static ResetPassword getResetPassword() {
    return resetPassword;
  }
}
