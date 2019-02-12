package core.runtime;

import java.io.File;
import java.util.ArrayList;

public class Script {

    /*
    Script is just a file contains Exprezeene's program source code.
     */

    private String scriptPath; //script path
    private String scriptName; //script name
    private File scriptFile; //file representation the script
    private boolean isMainScript; // is this script is the main script
    private Script parentScript; //what script import this script, if main, then it would be null
    private ArrayList<Script> importedScript; // list of imported scripts

    public Script(String scriptPath, Script parentScript, boolean isMainScript)
    {
        this.scriptPath = scriptPath;
        this.scriptFile = new File(scriptPath);
        this.scriptName = scriptFile.getName();
        this.isMainScript = isMainScript;
        this.parentScript = parentScript;
        this.importedScript = new ArrayList<>();
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

    public ArrayList<Script> getImportedScript()
    {
        return importedScript;
    }

    public void addScript(Script s)
    {
        importedScript.add(s);
    }

    public void setImportedScript(ArrayList<Script> scripts)
    {
        importedScript = scripts;
    }

}


