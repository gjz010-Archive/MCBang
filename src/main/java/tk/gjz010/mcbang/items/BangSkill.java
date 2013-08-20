/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items;

import org.bukkit.entity.Player;
import tk.gjz010.mcbang.BangGame;
import tk.gjz010.mcbang.BangPlayer;
import tk.gjz010.mcbang.enums.Situation;

/**
 *
 * @author Administrator
 */
public interface BangSkill extends BangItem{
    public boolean isPassive();
    public boolean isOncePerTurn();
    public void beforeTurn(BangPlayer p);
    public void afterTurn(BangPlayer p);
    
}
