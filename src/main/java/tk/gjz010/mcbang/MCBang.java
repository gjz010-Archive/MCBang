package tk.gjz010.mcbang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import tk.gjz010.mcbang.enums.Occupation;
import tk.gjz010.mcbang.items.basic.BangCard;
import tk.gjz010.mcbang.items.basic.HealCard;
import tk.gjz010.mcbang.items.basic.HideCard;
import tk.gjz010.mcbang.items.basic.OccupationCard;

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
        public ArrayList<BangPlayer> getBangPlayers(BangGame session){
            return session.getPlayers();
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
        public void createGame(Player p){
            BangGame g=new BangGame();
            p.sendMessage(ChatColor.LIGHT_PURPLE+"You created a BANG! game!Now you can bound the seats and start!");
            addSession(g);
        }
        public void joinGame(Player p){
            
        }
        public static String randomPoker(){
            StringBuilder sb=new StringBuilder("");
            sb.append(ChatColor.WHITE);
            Random r=new Random();
            int num=r.nextInt(13)+1;
            int pok=r.nextInt(4);
            switch(pok){
                case 0:
                    sb.append("Spade");
                    break;
                case 1:
                    sb.append(ChatColor.RED);
                    sb.append("Heart");
                    break;
                case 2:
                    sb.append(ChatColor.RED);
                    sb.append("Diamond");
                    break;
                case 3:
                    sb.append("Club");
                    break;
            }
            sb.append(" ");
            switch(num){
                case 0:
                    sb.append("A");
                    break;
                case 11:
                    sb.append("J");
                    break;
                case 12:
                    sb.append("Q");
                    break;
                case 13:
                    sb.append("K");
                    break;
                default:
                    sb.append(Integer.toString(num));
                    break;
            }
            sb.append(ChatColor.WHITE);
            return sb.toString();  
        }
    @Override
      public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
               if (cmd.getName().equalsIgnoreCase("bang")) {
         		if (!(sender instanceof Player)) {
         			sender.sendMessage("This command can only be run by a player.");
            		} else {
                                if(args[0].equals("getbang")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new BangCard().getItemStack());
                                }
                                if(args[0].equals("gethide")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new HideCard().getItemStack());
                                } 
                                if(args[0].equals("getheal")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new HealCard().getItemStack());
                                } 
                                if(args[0].equals("owner")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new OccupationCard(Occupation.Owner).getItemStack());
                                } 
                                if(args[0].equals("operator")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new OccupationCard(Occupation.Operator).getItemStack());
                                } 
                                if(args[0].equals("griefer")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new OccupationCard(Occupation.Griefer).getItemStack());
                                } 
                                if(args[0].equals("cheater")){
        			Player player = (Player) sender;
                                player.getInventory().addItem(new OccupationCard(Occupation.Cheater).getItemStack());
                                } 
         		}
          		return true;
           	}
           	return false;
      }


}
