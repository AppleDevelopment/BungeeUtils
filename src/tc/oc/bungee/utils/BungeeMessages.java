package tc.oc.bungee.utils;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;


public class BungeeMessages {
	
	public static void sendLobbyMessage(CommandSender sender){
		TextComponent lobbyTP = new TextComponent("Teleporting you to the lobby...");
		lobbyTP.setColor(ChatColor.GREEN);
		
		sender.sendMessage(lobbyTP);
	}
	
	public static void sendLobbyError(CommandSender sender){
		TextComponent lobbyError = new TextComponent("Only Players may use this command");
		lobbyError.setColor(ChatColor.RED);
		
		sender.sendMessage(lobbyError);
	}
	
	public static void addServerMessage(CommandSender sender , String name){
		TextComponent addServer = new TextComponent("Added Server ");
		addServer.setColor(ChatColor.GREEN);
		addServer.addExtra(ChatColor.GOLD + name);
		
		sender.sendMessage(addServer);
	}
	
	public static void delServer(CommandSender sender, String name){
		TextComponent delServer = new TextComponent("Removed Server ");
		delServer.setColor(ChatColor.GREEN);
		delServer.addExtra(ChatColor.GOLD + name);
		
		sender.sendMessage(delServer);
	}
	
	public static void noServerError(CommandSender sender, String name){
		TextComponent noServer = new TextComponent("Could not find server ");
		noServer.setColor(ChatColor.RED);
		noServer.addExtra(ChatColor.GOLD + name);
		
		sender.sendMessage(noServer);
	}
	
}
