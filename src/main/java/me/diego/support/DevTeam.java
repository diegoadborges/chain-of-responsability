package me.diego.support;

import me.diego.ticket.FeatureRequest;

public class DevTeam extends Support {
  public DevTeam(Support superior) {
    this.tickets.add(FeatureRequest.getFeatureRequest());
    this.setSuperiorSupport(superior);
  }

  @Override
  public String getRoleDescription() {
    return "Time de desenvolvimento";
  }
}
