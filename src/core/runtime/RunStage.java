package core.runtime;

public enum RunStage {

    /*
    for scanning preprocessor such as import statement or syntax definition or keyword definition
    */
    SCANNING_PREPROCESSOR,

    /*
    for scanning all statement in the current script
     */
    SCANNING_NON_PREPROCESSOR_STATEMENT,

    /*
    run the program
     */
    RUNNING

}
