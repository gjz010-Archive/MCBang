/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang;

import java.util.ArrayList;
import tk.gjz010.mcbang.items.BangSkill;

/**
 *
 * @author Administrator
 */
public interface BangActor {
    public ArrayList<BangSkill> getSkills();
    public int getMaxLife();
    public int setMaxLife();
    public int getLife();
    public int setLife();
}
