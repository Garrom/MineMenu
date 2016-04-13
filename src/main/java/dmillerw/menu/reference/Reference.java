package dmillerw.menu.reference;

public class Reference {
    public static final String MOD_ID = "MineMenu"; //TODO Change to lower case next time moving to a new MC version
    public static final String MOD_NAME = "MineMenu";
    public static final String MOD_VERSION = "%MOD_VERSION%";
    public static final String CLIENT_PROXY_CLASS = "dmillerw.menu.proxy.ClientProxy";
    public static final String SERVER_PROXY_ClASS = "dmillerw.menu.proxy.CommonProxy";
    public static final String DEPENDENCIES = "required-after:Forge@[12.16.0,)";
    public static final String GUI_FACTORY_CLASS = "dmillerw.menu.gui.config.MineMenuGuiFactory";
}