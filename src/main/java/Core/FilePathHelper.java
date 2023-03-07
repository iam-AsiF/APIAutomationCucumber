package Core;

import java.io.File;

public class FilePathHelper {

    public static final String dir = System.getProperty("user.dir");
    static File f = new File(dir);
    static String filepath = f.getParent();
    public static final String FileBathInCore = filepath + "/E2EAutomation/src/main/java/repository/localRepo/";
    // D:\Apps\Programming Language\AutomationWithSelniumAdvanced\SeleniumFunctions\E2EAutomation
    public static final String postApiPath = FileBathInCore + "POSTEmployeeData.json";

    public static final String putApiPath = FileBathInCore + "PUTEmployeeData.json";

    public static final String patchApiPath = FileBathInCore + "PatchEmployeeData.json";


}