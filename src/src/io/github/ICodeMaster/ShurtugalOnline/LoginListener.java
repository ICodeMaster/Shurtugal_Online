package io.github.ICodeMaster.ShurtugalOnline;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public class LoginListener implements Listener {
   
    private PotionEffect blind = new PotionEffect(PotionEffectType.BLINDNESS, 200, 1);
    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Hello Player!");
        player.setMaxHealth(20);
        player.setFoodLevel(20);
        player.setHealth(20);
    }
}