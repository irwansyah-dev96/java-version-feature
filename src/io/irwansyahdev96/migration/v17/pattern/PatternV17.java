package io.irwansyahdev96.migration.v17.pattern;

public class PatternV17 {
    
    public static void showPattern(){
        GuessType.showGuessType();
        System.out.println();
        System.out.println("========================");
        LogProcessor logProcessor = new LogProcessor();
        logProcessor.processLog("This is a log message");
        logProcessor.processLog(200);
        logProcessor.processLog(404);
        logProcessor.processLog(500);
        logProcessor.processLog(123.45);
    }
}
