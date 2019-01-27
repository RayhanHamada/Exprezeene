package core.structures;

public enum RunStage {

    /*
    for scanning preprocessor such as import statement or syntax definition or keyword definition
     */
    SCANNING_PREPROCESSOR,

    /*
    for scanning all statement in the imported script, main method would be ignored and program will use the importer script's main method
     */
    SCANNING_IMPORTED_SCRIPT,

    /*
    for scanning main method, program would use the latest main method, if there's main method inside imported script(s), then the imported script's main method
    would be ignored.
     */
    SCANNING_MAIN_METHOD,

    /*
    for scanning all statement in the current script
     */
    SCANNING_ALL_STATEMENT,

    /*
    run the program
     */
    RUNNNING

}
