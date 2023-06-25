package pl.dropnames.events;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Events implements Listener {

    @EventHandler
    public void onItemSpawn(EntitySpawnEvent event) {
        if(!(event.getEntity() instanceof Item)) {
            return;
        }
        Item item = (Item) event.getEntity();
        ItemStack is = item.getItemStack();
        ItemMeta im = is.getItemMeta();
        if(im != null) {
            if(im.getDisplayName().equals("")) {
                return;
            }
            item.setCustomName(im.getDisplayName());
            item.setCustomNameVisible(true);
        }
    }

}
