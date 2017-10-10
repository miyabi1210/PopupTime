package miyabi.time;

import java.text.SimpleDateFormat;
import java.util.Date;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

public class Time extends PluginBase implements Listener{
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("§a起動しました §bby miyabi1210");
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		int x = 20;
		this.getServer().getScheduler().scheduleRepeatingTask(null, new Runnable(){

			@Override
			public void run() {
				Date d = new Date();
				SimpleDateFormat d2 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
				String q2 = d2.format(d);
					player.sendPopup("§a[情報]§f"+q2);

			}

		       }, x);


	}


}

