package core;

import java.io.File;

public class Script {

    private String scriptPath; //script path
    private String scriptName;
    private File scriptFile; //file representation of this script
    private boolean isMainScript;
    private Script parentScript; //what script import this script

    public Script(String scriptPath, Script parentScript, boolean isMainScript)
    {
        this.scriptPath = scriptPath;
        this.scriptFile = new File(scriptPath);
        this.scriptName = scriptFile.getName();
        this.isMainScript = isMainScript;
        this.parentScript = parentScript;
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

    public Script getParentScript()
    {
        return parentScript;
    }
}


