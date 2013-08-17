/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items.basic;

import java.util.ArrayList;
import java.util.List;
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
    public List<String> getLore() {
        List<String> str=new ArrayList<String>();
        str.add("Your aim is to:");
        switch(getOccupation()){
            case SHERIFF:
                str.add("kill the outlaws and the thieves.");
                break;
            case DEPUTY:
                str.add("help the sheriff kill the outlaws and the thieves.");
                break;
            case THIEF:
                str.add("kill the outlaws and the sheriff.");
                break;
            case OUTLAW:
                str.add("kill everyone and live at last.");
                break;
        }
        return str;
    }

    public String getName() {
        return "Occupation card";
    }

    public String getPoker() {
        return "";
    }

    public ItemStack getItemStack() {
        ItemStack paper=new ItemStack(339,1);
        ItemMeta meta=paper.getItemMeta();
        meta.setDisplayName(getName());
        meta.setLore(getLore());
        return paper;
    }

    public void onAction(Player from, Player target) {
    }

    @Override
    public void onAction(BangPlayer from, BangPlayer target) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
