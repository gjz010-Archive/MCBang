/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang;

import java.util.ArrayList;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import tk.gjz010.mcbang.items.BangItem;

/**
 *
 * @author Administrator
 */
public class BangGame {
    private ArrayList<Player> p;
    private ArrayList<Block> seats;
    private ArrayList<Chest> occcards;
    private ArrayList<Chest> normalcards;
    public int calculateRange(){
        return 1;
    }
    public boolean askforCard(BangItem b){
        return false;
    }
}
