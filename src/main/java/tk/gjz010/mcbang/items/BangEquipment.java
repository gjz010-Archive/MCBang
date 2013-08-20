/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items;

/**
 *
 * @author Administrator
 */
public interface BangEquipment extends BangItem{
    public int getRange();
    public boolean replaceItem(BangItem item);
}
