/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang;

import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import tk.gjz010.mcbang.items.BangItem;

/**
 *
 * @author Administrator
 */
public class BangGame implements Listener{
    private ArrayList<BangPlayer> p;
    private ArrayList<Block> seats;
    private HashMap<BangItem,BangPlayer> cards;
    public BangGame(){
        
    }
    public int calculateRange(){
        return 1;
    }
    public boolean askforCard(BangItem b){
        return false;
    }
    @EventHandler
    public void disableChangeWeapon(PlayerItemHeldEvent e){
        for(BangPlayer ps:p){
            if(ps.getPlayer().equals(e.getPlayer())){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void disableHotbarClick(InventoryClickEvent e){
        for(BangPlayer ps:p){
            if(ps.getPlayer().equals(e.getWhoClicked())&e.getClick()==ClickType.NUMBER_KEY){
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void dieOnExit(PlayerQuitEvent e){
        for(BangPlayer ps:p){
            if(ps.getPlayer().equals(e.getPlayer())){
                peopleDie(ps);
            }
        }
    }
    public void peopleDie(BangPlayer player){
        
    }
    public void addSeat(Block b){
        seats.add(b);
    }
    public ArrayList<BangPlayer> getPlayers(){
        return p;
    }
    public void addCard(BangItem item){
        
    }
    public void bang(BangPlayer from,BangPlayer target){
        
    }
}
