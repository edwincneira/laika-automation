package Utilities;

import java.util.ArrayList;

public class SwitchDriver {
    public static String getSO (cucumber.api.Scenario scenario)
    {
        ArrayList<String> sourceTagNames = new ArrayList<String>(scenario.getSourceTagNames());
        boolean isAndroid = sourceTagNames.get(0).equals("@Android") || sourceTagNames.get(1).equals("@Android") || sourceTagNames.get(2).equals("@Android");
        boolean isIOS = sourceTagNames.get(0).equals("@iOS") || sourceTagNames.get(1).equals("@iOS") || sourceTagNames.get(2).equals("@iOS");
        return isAndroid ? "Android" : (isIOS) ? "iOS" : "badTarget";
    }

}
