package me.diego.support;

import me.diego.ticket.Bug;

public class SeniorEngineer extends Support {
  public SeniorEngineer(Support superior) {
    this.tickets.add(Bug.getBug());
    this.setSuperiorSupport(superior);
  }

  @Override
  public String getRoleDescription() {
    return "Engenheiro senior";
  }
}
