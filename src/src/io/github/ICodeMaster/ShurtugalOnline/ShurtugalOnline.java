package io.github.ICodeMaster.ShurtugalOnline;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.GameRuleCommand;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView.Property;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import pgDev.bukkit.DisguiseCraft.DisguiseCraft;
import pgDev.bukkit.DisguiseCraft.api.DisguiseCraftAPI;
import pgDev.bukkit.DisguiseCraft.disguise.Disguise;
import pgDev.bukkit.DisguiseCraft.disguise.DisguiseType;
 
public class ShurtugalOnline extends JavaPlugin implements Listener 
{
	    boolean isRider;
		private int hunger;
		public final Logger logger = Logger.getLogger("minecraft");
		public static ShurtugalOnline plugin;
		ItemStack swords = ItemHandler.swordsman();
		ItemStack archer = ItemHandler.archer();
		ItemStack cannoneer = ItemHandler.cannoneer();
		ItemStack baker = ItemHandler.baker();
		ItemStack builder = ItemHandler.builder();
		ItemStack smith = ItemHandler.smith();
		ItemStack healer = ItemHandler.healer();
		ItemStack support = ItemHandler.support();
		ItemStack attack = ItemHandler.attack();
		ItemStack swordman = ItemHandler.swordsmans();
		ItemStack arch = ItemHandler.archers();
		ItemStack cannon = ItemHandler.cannon();
		ItemStack empire = ItemHandler.Empire();
		ItemStack Varden = ItemHandler.Varden();
		public static boolean isEMP;
		public static Inventory bags;
		public static boolean isVAD;
		
		@Override
	    public void onEnable(){
			PluginDescriptionFile pdfFile = this.getDescription();
			getServer().getPluginManager().registerEvents(new LoginListener(), this);
			getServer().getPluginManager().registerEvents(this, this);
	    	this.logger.info(pdfFile.getName() + " Version " +pdfFile.getVersion() + " has been enabled");
	    	setupDisguiseCraft();
	    }	 
	    @Override
	    public void onDisable() {
	    	PluginDescriptionFile pdfFile = this.getDescription();
	    	this.logger.info(pdfFile.getName() + " has been disabled");
	    }	     
		
	    DisguiseCraftAPI dc;

	    public void setupDisguiseCraft() {
	    	dc = DisguiseCraft.getAPI();
	    }
	    
	    
	    
	    //Commands  
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    	//setup

	    	//Start command
	    	if(cmd.getName().equalsIgnoreCase("start"))
	    		{ 
	    		if(args.length == 0){
	    		World world = getServer().getWorld("world");  		
	    		    Player player = (Player) sender;
	    		    world.setFullTime(0);
	    			List<Player> onlinePlayers = Arrays.asList(Bukkit.getServer().getOnlinePlayers());
	    			Iterator<Player> iter1 = onlinePlayers.iterator();
	    			while(iter1.hasNext()){
	    				Player onlinePlayer = iter1.next();
	    				onlinePlayer.sendMessage(ChatColor.BLUE + "Game Starting!");
	    				Random team = new Random();
	    				Random clas = new Random();
	    				int j;
	    				int k;
	    				onlinePlayer.setMaxHealth(20);
	    				onlinePlayer.setHealth(20);
	    				onlinePlayer.setFoodLevel(20);
	    				PlayerInventory pi = onlinePlayer.getInventory();
	    				for(int counter = 1; counter<=1; counter ++){
	    					j = 1+team.nextInt(2);
	    					if(j == 1){
	    						onlinePlayer.setDisplayName(ChatColor.RED + onlinePlayer.getName() + " Of the Empire" + ChatColor.RESET);
	    						pi.setHelmet(empire);
	    						isEMP = true;
		    					}	    						
	    							pi.setItem(0, swords);
	    							pi.setItem(1, archer);
	    							pi.setItem(2, cannoneer);
	    						if(onlinePlayer.getName().equalsIgnoreCase("1CodeMaster")){
			                		boolean Levels = true;
			                		ItemStack icode = ItemHandler.ICode();
			                		pi.clear(0);
			        				pi.setItem(4, icode);
		    						pi.setItem(1, swords);
		    						pi.setItem(2, archer);
		    						pi.setItem(3, cannoneer);
		    						onlinePlayer.setDisplayName(ChatColor.GOLD + onlinePlayer.getName() + " The Shade" + ChatColor.RESET);
	    						}
	    					if(j == 2){
	    						isVAD = true;
	    						onlinePlayer.setDisplayName(ChatColor.DARK_GREEN + onlinePlayer.getName() + " " + " Of the Varden" + ChatColor.RESET);
	    						pi.setHelmet(Varden);
		    					}
	    							pi.setItem(0, swords);
	    							pi.setItem(1, archer);
	    							pi.setItem(2, cannoneer);
	    						if(onlinePlayer.getName().equalsIgnoreCase("1CodeMaster")){
			                		boolean Levels = true;
			                		ItemStack icode = ItemHandler.ICode();
			                		pi.clear(0);
			        				pi.setItem(4, icode);
		    						pi.setItem(1, swords);
		    						pi.setItem(2, archer);
		    						pi.setItem(3, cannoneer);
		    						onlinePlayer.setDisplayName(ChatColor.GOLD + onlinePlayer.getName() + " The Shade" + ChatColor.RESET);
	    					}
	    					}
	    			  }
	    			
	    			}
	    			return true;
	    		
	   			
		}   	    	  
	    	//Rider Command
			if (sender instanceof Player) {
	               Player player = (Player) sender;
	               if(cmd.getName().equalsIgnoreCase("dragon")){ 
	            	isRider = true;
	            	sender.sendMessage("You are now a dragon!");
	            	dc.disguisePlayer(player, new Disguise(dc.newEntityID(), DisguiseType.EnderDragon));
	            	((Player) sender).setMaxHealth(200);
	            	((Player) sender).setHealth(200);
	            	((Player) sender).setAllowFlight(true);
	            	((Player) sender).setFoodLevel(10000);
	            	PlayerInventory pi = player.getInventory();
	            	pi.clear();
	           		return true;
	           	}
	            } else {
	               sender.sendMessage("You must be a player!");
	               return false;
	            }
			
			return false;
	}
	    //Events
	    @EventHandler
	    public void rightClick(PlayerInteractEvent evt){
	        Player p = evt.getPlayer();
	        Location l = p.getLocation();
	        if(evt.getAction() == Action.RIGHT_CLICK_AIR && p.getItemInHand().getType() == Material.ANVIL){ //Right clicking block or the air.
	                evt.setCancelled(true);
	                p.openWorkbench(l, true).setProperty(Property.BURN_TIME, 30);
	                p.playSound(l, Sound.ANVIL_USE, 10, 1);
	        }
	        PlayerInventory pi = p.getInventory();
			for(int counter = 1; counter<=1; counter ++){
				int k;
				Random classs = new Random();
				k = 1+classs.nextInt(3);
	        if(evt.getAction() == Action.RIGHT_CLICK_AIR && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "Become Fighter")){ //Right clicking block or the air.
                pi.clear();
	        	evt.setCancelled(true);
                p.playSound(l, Sound.LEVEL_UP, 20, 1);
                if(k==1){
                	pi.setItem(0, swordman);
                }
                if(k==2){
                	pi.setItem(0, arch);
                }
                if(k==3){
                	pi.setItem(0, cannon);
                }
                   }
	        if(evt.getAction() == Action.RIGHT_CLICK_AIR && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "Become Crafter")){ //Right clicking block or the air.
	        	pi.clear();
	        	evt.setCancelled(true);
                p.playSound(l, Sound.LEVEL_UP, 20, 1);
                if(k==1){
                	pi.setItem(0, baker);
                }
                if(k==2){
                	pi.setItem(0, builder);
                }
                if(k==3){
                	pi.setItem(0, smith);
                }
                   }
	        if(evt.getAction() == Action.RIGHT_CLICK_AIR && p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_AQUA + "Become Magician")){ //Right clicking block or the air.
	        	pi.clear();
	        	evt.setCancelled(true);
                p.playSound(l, Sound.LEVEL_UP, 20, 1);
                if(k==1){
                	//code
                }
                if(k==2){
                	//code
                }
                if(k==3){
                	//code
                }
                   }
			}
			}
	    @EventHandler
	    public void respawnEvent(PlayerRespawnEvent event){
	    	Player player = event.getPlayer();
	    	player.setCustomName(ChatColor.YELLOW + player.getName());
	    }
	    @EventHandler
	    public void onDamage(PlayerDeathEvent event){
	    
	    Player p = (Player)event.getEntity();
	    setScore(p);
	    }
	    
	    //Methods
	    public static void setScore(Player p){
	    	Team team = null;
	    	for (Player online : Bukkit.getOnlinePlayers()){
	    	String name1 = online.getName();
	    	ScoreboardManager manager = Bukkit.getScoreboardManager();
	    	Scoreboard board = manager.getNewScoreboard();
	    	if (board.getTeam(name1) == null){
	    	team = board.registerNewTeam(name1);
	    	team.addPlayer(online);
	    	}
	    	if (board.getObjective(name1) == null){
	    	board.registerNewObjective(name1, "dummy");
	    	}
	    	board.getObjective(name1).setDisplaySlot(DisplaySlot.BELOW_NAME);
	    	String display = Integer.toString(online.getMaxHealth());
	    	board.getObjective(name1).setDisplayName("§2" + display);
	    	Score score = board.getObjective(name1).getScore(online);
	    	score.setScore(online.getHealth());
	    	 
	    	online.setScoreboard(board);
	    	}
	    	}
	    }
	   
	    
		
	    
	    
	   


	
	

 