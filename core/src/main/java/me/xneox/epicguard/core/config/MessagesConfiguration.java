/*
 * EpicGuard is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EpicGuard is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.xneox.epicguard.core.config;

import java.util.Arrays;
import java.util.List;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;

@SuppressWarnings("ALL") // make intellij shut up about using final fields that would break the config loader.
@ConfigSerializable
public class MessagesConfiguration {

  // Config sections.
  private Command command = new Command();
  private Disconnect disconnect = new Disconnect();

  private String actionbarMonitor = "&cEpicGuard &8// &6%cps% &7connections/s &8| %status%";
  private String actionbarNoAttack = "&7No attack...";
  private String actionbarAttack = "&cAttack detected!";

  public Command command() {
    return this.command;
  }

  public Disconnect disconnect() {
    return this.disconnect;
  }

  public String actionbarMonitor() {
    return this.actionbarMonitor;
  }

  public String actionbarNoAttack() {
    return this.actionbarNoAttack;
  }

  public String actionbarAttack() {
    return this.actionbarAttack;
  }

  @ConfigSerializable
  public static class Command {
    private String prefix = " &cEpicGuard &8// &7";
    private String usage = "&cCorrect usage: &6{USAGE}";
    private String unknownCommand = "&cUnknown command, use &6/epicguard &cfor available commands.";
    private String reloaded = "&7Succesfully reloaded config and messages!";
    private String toggleStatus = "&7You have toggled your attack status!";
    private String invalidArgument = "&cCould not resolve address for this nickname, or provided address is invalid.";

    private List<String> mainCommand =
        Arrays.asList(
            "",
            " &6EpicGuard Protection System &8- &7Running version &f{VERSION}",
            "",
            " &8▸ &7Under attack: {ATTACK}",
            " &8▸ &7Connections: &e{CPS}/s",
            " &8▸ &7Blacklist: &e{BLACKLISTED-IPS} &7IPs",
            " &8▸ &7Whitelist: &e{WHITELISTED-IPS} &7IPs",
            "",
            " &8/&fguard status &8- &7Toggle attack status on actionbar.",
            " &8/&fguard reload &8- &7Reload config and messages.",
            " &8/&fguard save &8- &7Save data to the database.",
            " &8/&fguard analyze <nick/address> &8- &7Perform detailed analysis on specified user.",
            "");

    private List<String> analyzeCommand =
        Arrays.asList(
            "",
            " &6EpicGuard Analysis System &8- &7Results for &f{ADDRESS}",
            "",
            " &eGeographic Data:",
            "  &8▸ &7Country: &f{COUNTRY}",
            "  &8▸ &7City: &f{CITY}",
            "",
            " &eKnown Accounts&6 ({ACCOUNT-AMOUNT}):",
            "  &8▸ &f{NICKNAMES}",
            "",
            " &eOther Data:",
            "  &8▸ &7Whitelisted: {WHITELISTED}",
            "  &8▸ &7Blacklisted: {BLACKLISTED}",
            "");

    public String prefix() {
      return this.prefix;
    }

    public String usage() {
      return this.usage;
    }

    public String unknownCommand() {
      return this.unknownCommand;
    }

    public String reloaded() {
      return this.reloaded;
    }

    public String toggleStatus() {
      return this.toggleStatus;
    }

    public String invalidArgument() {
      return this.invalidArgument;
    }

    public List<String> mainCommand() {
      return this.mainCommand;
    }

    public List<String> analyzeCommand() {
      return this.analyzeCommand;
    }
  }

  @ConfigSerializable
  public static class Disconnect {
    private List<String> geographical = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYour country/city is not allowed on this server.");

    private List<String> blacklisted = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYou have been blacklisted on this server.");

    private List<String> proxy = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYou are using VPN or Proxy.");

    private List<String> reconnect = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cJoin the server again.");

    private List<String> nickname = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYou nickname is not allowed on this server.");

    private List<String> accountLimit = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYou have too many accounts on your IP address.");

    private List<String> serverListPing = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYou must add our server to your servers list to verify yourself.");

    private List<String> nameSimilarity = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cYour nickname is too similar to other users connecting to the server.");

    private List<String> settingsPacket = Arrays.asList(
        "&8» &7You have been kicked by &bAntiBot Protection&7:",
        "&8» &cBot-like behaviour detected, please join the server again.");

    public List<String> geographical() {
      return this.geographical;
    }

    public List<String> blacklisted() {
      return this.blacklisted;
    }

    public List<String> proxy() {
      return this.proxy;
    }

    public List<String> reconnect() {
      return this.reconnect;
    }

    public List<String> nickname() {
      return this.nickname;
    }

    public List<String> accountLimit() {
      return this.accountLimit;
    }

    public List<String> serverListPing() {
      return this.serverListPing;
    }

    public List<String> nameSimilarity() {
      return this.nameSimilarity;
    }

    public List<String> settingsPacket() {
      return this.settingsPacket;
    }
  }
}
