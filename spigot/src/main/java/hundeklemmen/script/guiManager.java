package hundeklemmen.script;

import hundeklemmen.MainPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class guiManager {

    private MainPlugin plugin;

    public guiManager(MainPlugin plugin){
        this.plugin = plugin;
    }

    public ItemStack newItemStack(Material obj){
        return new ItemStack(obj);
    }

}
