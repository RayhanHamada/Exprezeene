package core;

import java.io.File;

public class Script {

    private String scriptPath;
    private String scriptName;
    private File scriptFile;
    private boolean isMainScript;

    public Script(String scriptPath, boolean isMainScript)
    {
        this.scriptPath = scriptPath;
        this.scriptFile = new File(scriptPath);
        this.scriptName = scriptFile.getName();
        this.isMainScript = isMainScript;
    }

    public String getScriptPath() {
        return scriptPath;
    }

    public String getScriptName() {
        return scriptName;
    }

    public File getScriptFile() {
        return scriptFile;
    }

    public boolean isMainScript() {
        return isMainScript;
    }
}


