package fr.edminecoreteam.corenetwork.hub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ChangeHubInfo
{
    private Map<String, ChangeHubInfo> serverInfo;
    private final String srv;
    private final ChangeHubData serverData;

    public ChangeHubInfo(String srv) {
        this.srv = srv;
        this.serverInfo = new HashMap<String, ChangeHubInfo>();
        this.serverData = new ChangeHubData(srv);
        this.serverInfo.put(srv, this);
    }

    public String getServerName() { return srv; }

    public List<String> getServer() { return serverData.getServer(); }

    public int getServerPageNumber() { return serverData.getServerPageNumber(); }

    public List<String> getServerForPage(int Page) { return serverData.getServerForPage(Page); }

    public String getServerMotd() { return serverData.getServerMotd(); }

    public int getServerOnlines() { return serverData.getServerOnlines(); }

    public int getServerID() { return serverData.getServerID(); }


}
