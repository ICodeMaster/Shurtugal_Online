package io.github.ICodeMaster.ShurtugalOnline;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ItemHandler {

	
	public static ItemStack Empire(){
	 ItemStack Empire = new ItemStack(Material.REDSTONE_BLOCK, 1);
	 ItemMeta emp = Empire.getItemMeta();
	 emp.setDisplayName("Empire Helm");
	 Empire.setItemMeta(emp);
	return Empire;
    }
	public static ItemStack ICode(){
		ItemStack ICode = new ItemStack(Material.GOLD_SWORD, 1);
		ItemMeta icodeIM = ICode.getItemMeta();
		icodeIM.setDisplayName(ChatColor.RED + "Ricka ev Kodarent");
		icodeIM.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		icodeIM.addEnchant(Enchantment.DURABILITY, 10, true);
		ICode.setItemMeta(icodeIM);
		return ICode;
	}
	public static ItemStack Varden(){
		ItemStack Varden = new ItemStack(Material.LEATHER_HELMET, 1);
		LeatherArmorMeta vdm = (LeatherArmorMeta) Varden.getItemMeta();
		vdm.setDisplayName("Varden Helm");
		vdm.setColor(Color.BLUE);
		Varden.setItemMeta(vdm);
		return Varden;
	}
	public static ItemStack swordsman(){
		ItemStack swordsman = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta imb = swordsman.getItemMeta();
		imb.setDisplayName(ChatColor.DARK_AQUA + "Become Fighter");
		swordsman.setItemMeta(imb);
		return swordsman;
	}
	public static ItemStack archer(){
		ItemStack archer = new ItemStack(Material.CAKE_BLOCK, 1);
		ItemMeta ima = archer.getItemMeta();
		ima.setDisplayName(ChatColor.DARK_AQUA + "Become Crafter");
		archer.setItemMeta(ima);
		return archer;
	}
	public static ItemStack cannoneer(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Magician");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack baker(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Baker");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}public static ItemStack builder(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Buidler");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack smith(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Black Smith");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack swordsmans(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Swordsman");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}public static ItemStack archers(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Archer");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack cannon(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Cannoneer");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack healer(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Healer");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}public static ItemStack support(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Support Magicain");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
	public static ItemStack attack(){
		ItemStack cannoneer = new ItemStack(Material.FIREBALL, 1);
		ItemMeta imc = cannoneer.getItemMeta();
		imc.setDisplayName(ChatColor.DARK_AQUA + "Become Combat Magician");
		cannoneer.setItemMeta(imc);
		return cannoneer;
	}
}

