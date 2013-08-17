/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import tk.gjz010.mcbang.enums.Occupation;

/**
 *
 * @author Administrator
 */
public class BangPlayer {
    private Player player;
    private Occupation ocp;
    private BangGame session;
    private Inventory inv;
    public BangPlayer(Player p){
        this.player=p;
        this.inv=p.getInventory();
    }
    public BangGame getSession(){
        return session;
    }
    public Player getPlayer(){
        return player;
    }
    public Occupation getOccupation(){
        return ocp;
    }
}
