package tk.gjz010.mcbang;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class MCBang extends JavaPlugin{
        @Override
        public void onEnable(){
            getLogger().info("MCBang enabling...");
            players=new ArrayList<>();
            sessions=new ArrayList<>();
            getLogger().info("MCBang enabled!");
        }
     
        @Override
        public void onDisable() {
            getLogger().info("MCBang disabled!");
        }
        private List<BangPlayer> players;
        private List<BangGame> sessions;
        public BangPlayer getBangPlayer(BangGame session){
            for(BangPlayer p:players){
                if(p.getSession().equals(session)){
                    return p;
                }
            }
            return null;
        }
        public void addSession(BangGame session){
            sessions.add(session);
        }
        public void removeSession(BangGame session){
            sessions.remove(session);
        }
        public boolean isIngame(Player p){
            for(BangPlayer player:players){
                if(player.getPlayer().equals(p)){
                    return true;
                }
            }
            return false;
        }
}
