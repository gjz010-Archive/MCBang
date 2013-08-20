/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items.basic;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import tk.gjz010.mcbang.BangPlayer;
import tk.gjz010.mcbang.enums.Occupation;
import tk.gjz010.mcbang.items.BangItem;

/**
 *
 * @author Administrator
 */
public class OccupationCard implements BangItem{
    public OccupationCard(Occupation o){
        this.o=o;
    }
    private Occupation o;
    public Occupation getOccupation(){
        return o;
    }
    @Override
    public List<String> getLore() {
        List<String> str=new ArrayList<>();
        str.add(ChatColor.WHITE+"Your occupation is "+ChatColor.GOLD+getOccupation().toString());
        str.add(ChatColor.WHITE+"Your aim is to:");
        switch(getOccupation()){
            case Owner:
                str.add(ChatColor.RED+"kill the griefers and the cheaters.");
                break;
            case Operator:
                str.add(ChatColor.RED+"help the sheriff kill the griefers and the cheaters.");
                break;
            case Griefer:
                str.add(ChatColor.RED+"kill the owner.");
                break;
            case Cheater:
                str.add(ChatColor.RED+"kill everyone and live at last.");
                break;
        }
        return str;
    }

    @Override
    public String getName() {
        return "Occupation card";
    }

    @Override
    public String getPoker() {
        return "";
    }

    @Override
    public ItemStack getItemStack() {
        ItemStack paper=new ItemStack(339,1);
        ItemMeta meta=paper.getItemMeta();
        meta.setDisplayName(getName());
        meta.setLore(getLore());
        paper.setItemMeta(meta);
        return paper;
    }

    @Override
    public void onAction(BangPlayer from, BangPlayer target) {
        
    }
    
}
