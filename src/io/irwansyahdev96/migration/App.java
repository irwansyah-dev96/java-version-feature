package io.irwansyahdev96.migration;

import io.irwansyahdev96.migration.v11.datetime.DateTimeV11;
import io.irwansyahdev96.migration.v11.httpclient.HttpClientV11;
import io.irwansyahdev96.migration.v11.lambdaexp.LambdaExpression;
import io.irwansyahdev96.migration.v17.pattern.PatternV17;
import io.irwansyahdev96.migration.v17.record.RecordDto;
import io.irwansyahdev96.migration.v17.sealedv17.Sealed17;
import io.irwansyahdev96.migration.v17.switcher.SwitchV17;
import io.irwansyahdev96.migration.v17.threading.Threading;

public class App {
    
    public static void main(String[] args) throws Exception {
        LambdaExpression.showLambdaExpression();
        System.out.println();
        System.out.println("========================");
        DateTimeV11.showDateTimeV11();
        System.out.println();
        System.out.println("========================");
        // HttpClientV11.showHttpClientV11();
        System.out.println();
        System.out.println("========================");
        RecordDto.showRecord();
        System.out.println();
        System.out.println("========================");
        SwitchV17.showSwitch();
        System.out.println();
        System.out.println("========================");
        PatternV17.showPattern();
        System.out.println();
        System.out.println("========================");
        Sealed17.show();
        System.out.println();
        System.out.println("========================");
        Threading.show();
    }
}
