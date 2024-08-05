package your.group.name.projectname;

import org.bukkit.plugin.java.JavaPlugin;

public class ProjectName extends JavaPlugin {
  @Override
  public void onEnable() {
      getLogger().info("Plugin enabled with version: " + this.getPluginMeta().getVersion());
  }

  @Override
  public void onDisable() {
  }
}
