/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.gjz010.mcbang.items.basic;

import java.util.ArrayList;
import tk.gjz010.mcbang.items.BangItem;
import tk.gjz010.mcbang.items.BangSkill;
import tk.gjz010.mcbang.items.BangSkill;

/**
 *
 * @author Administrator
 */
public abstract class BangActor implements BangItem{
    public abstract ArrayList<BangSkill> getSkills();
    private int maxlife;
    private int life;
    public int getMaxLife(){
        return maxlife;
    }
    public void setMaxLife(int maxlife){
        this.maxlife=maxlife;
    }
    public int getLife(){
        return life;
    }
    public void setLife(int life){
        if(life<=0){
            
        }
        if(life>=maxlife){
            life=maxlife;
        }
        this.life=life;
    }
}