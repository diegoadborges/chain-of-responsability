package me.diego.support;

import me.diego.ticket.AppCrashes;

public class Level2Support extends Support {
  public Level2Support(Support superior) {
    this.tickets.add(AppCrashes.getAppCrashes());
    this.setSuperiorSupport(superior);
  }

  @Override
  public String getRoleDescription() {
    return "Suporte l2";
  }
}
