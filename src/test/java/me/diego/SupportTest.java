package me.diego;

import static org.junit.jupiter.api.Assertions.assertEquals;

import me.diego.support.DevTeam;
import me.diego.support.Level1Support;
import me.diego.support.Level2Support;
import me.diego.support.SeniorEngineer;
import me.diego.ticket.AppCrashes;
import me.diego.ticket.Bug;
import me.diego.ticket.FeatureRequest;
import me.diego.ticket.ResetPassword;
import me.diego.ticket.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupportTest {

  private DevTeam devTeam;
  private SeniorEngineer seniorEngineer;
  private Level2Support level2Support;
  private Level1Support level1Support;

  @BeforeEach
  void setUp() {
    this.devTeam = new DevTeam(null);
    this.seniorEngineer = new SeniorEngineer(this.devTeam);
    this.level2Support = new Level2Support(this.seniorEngineer);
    this.level1Support = new Level1Support(this.level2Support);
  }

  @Test
  void shouldReturnLevel1Support() {
    assertEquals(
        "Suporte l1", this.level1Support.checkTicket(new Ticket(ResetPassword.getResetPassword())));
  }

  @Test
  void shouldReturnLevel2Support() {
    assertEquals(
        "Suporte l2", this.level1Support.checkTicket(new Ticket(AppCrashes.getAppCrashes())));
  }

  @Test
  void shouldReturnSeniorEngineer() {
    assertEquals("Engenheiro senior", this.level1Support.checkTicket(new Ticket(Bug.getBug())));
  }

  @Test
  void shouldReturnDevTeam() {
    assertEquals(
        "Time de desenvolvimento",
        this.level1Support.checkTicket(new Ticket(FeatureRequest.getFeatureRequest())));
  }
}
