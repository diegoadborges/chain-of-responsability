package me.diego.support;

import me.diego.ticket.ResetPassword;

public class Level1Support extends Support {
  public Level1Support(Support superior) {
    this.tickets.add(ResetPassword.getResetPassword());
    this.setSuperiorSupport(superior);
  }

  @Override
  public String getRoleDescription() {
    return "Suporte l1";
  }
}
