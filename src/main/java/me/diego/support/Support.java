package me.diego.support;

import java.util.ArrayList;
import java.util.List;
import me.diego.ticket.Ticket;
import me.diego.ticket.TicketType;

public abstract class Support {
  protected List<TicketType> tickets = new ArrayList<>();
  private Support superior;

  public Support getSuperiorSupport() {
    return this.superior;
  }

  public void setSuperiorSupport(Support superior) {
    this.superior = superior;
  }

  public abstract String getRoleDescription();

  public String checkTicket(Ticket ticket) {
    if (this.tickets.contains(ticket.getType())) return this.getRoleDescription();

    return this.superior != null ? this.superior.checkTicket(ticket) : "Sem permissão";
  }
}
