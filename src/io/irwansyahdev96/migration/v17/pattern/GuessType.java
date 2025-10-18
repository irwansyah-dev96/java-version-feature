package io.irwansyahdev96.migration.v17.pattern;

public class GuessType {

    
    public static void showGuessType(){
        Object obj = "Hello World";
        
        if (obj instanceof String){
            String str = (String) obj;
            System.out.println("String: " + str);
        }

        if (obj instanceof Integer){
            Integer integer = (Integer) obj;
            System.out.println("Integer: " + integer);
        }

        if (obj instanceof Double){
            Double dbl = (Double) obj;
            System.out.println("Double: " + dbl);
        }

        // Pattern Matching for instanceof
        if (obj instanceof String str){
            System.out.println("String: " + str);
        } else if (obj instanceof Integer integer){
            System.out.println("Integer: " + integer);
        } else if (obj instanceof Double dbl){
            System.out.println("Double: " + dbl);
        } else {
            System.out.println("Unknown Type");
        }
    }
    
}
