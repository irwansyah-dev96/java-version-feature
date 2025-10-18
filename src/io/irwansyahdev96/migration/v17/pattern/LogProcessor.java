package io.irwansyahdev96.migration.v17.pattern;

public class LogProcessor {
    
    public void processLog(Object log){
        if(log instanceof String message){
            System.out.println("Log message: "+ message);
        }else if(log instanceof Integer statusCode){

            if(statusCode >= 200 && statusCode < 300)
                System.out.println("[SUCCESS] with status code: " + statusCode);
            else if(statusCode >= 400 && statusCode < 500)
                System.out.println("[CLIENT ERROR] with status code: " + statusCode);
            else if(statusCode >= 500)
                System.out.println("[SERVER ERROR] with status code: " + statusCode);
            else
                System.out.println("[UKNOWN] with status code: " + statusCode);
        }else if(log instanceof Double responseTime){
            System.out.println("Response time: " + responseTime + " ms");
        }else{
            System.out.println("Unknown log type");
        }
    }
}
