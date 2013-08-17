/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items;

import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import tk.gjz010.mcbang.BangGame;
import tk.gjz010.mcbang.BangPlayer;

/**
 *
 * @author Administrator
 */
public interface BangItem {
    public String getName();
    public List<String> getLore();
    public String getPoker();
    public ItemStack getItemStack();
    public void onAction(BangPlayer from,BangPlayer target);
}
