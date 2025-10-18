package io.irwansyahdev96.migration.v11.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeV11 {
    
    /**
     * Trik & Penggunaan Efektif

        Pakai now() hanya di ujung logika (misalnya saat save ke DB), supaya konsisten.

        Gunakan plusDays, minusMonths, dll. daripada hitung manual.

        Kalau butuh timezone-aware, selalu pakai ZonedDateTime atau OffsetDateTime.

        Simpan di database sebagai Instant/UTC, tampilkan ke user dengan ZoneId lokal.

        Gunakan DateTimeFormatter.ISO_DATE_TIME kalau butuh format standar ISO-8601.
     * 
     */
    public static void showDateTimeV11(){
        System.out.println("Date Time V11");

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 5, 23);

        System.out.println("Today : "+today);
        System.out.println("Birthday : "+birthday);

        LocalTime now = LocalTime.now();
        LocalTime specific = LocalTime.of(14, 30);

        System.out.println("Time Now : "+now);
        System.out.println("Time Spesifik : "+specific);

        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime meeting = LocalDateTime.of(2025, 9, 25, 10, 0);

        System.out.println("Date Time Now : "+nowDate);
        System.out.println("Meeting : "+meeting);

        ZonedDateTime zona = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));

        Instant inst = Instant.now();
        long epoch = inst.toEpochMilli();

        System.out.println("Zoned Date Time : "+zona);
        System.out.println("Instant : "+inst);
        System.out.println("Epoch : "+epoch);

        System.out.println("Basic Operation");
        LocalDate tdy = LocalDate.now();
        LocalDate tomorrow = tdy.plusDays(1);
        LocalDate lastWeek = tdy.minusWeeks(1);

        System.out.println(tdy.isBefore(tomorrow)); // true
        System.out.println(tdy.isAfter(lastWeek));  // true

        System.out.println("Duration and Period");
        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2025, 9, 25);

        Period period = Period.between(start, end);
        System.out.println(period.getYears() + " tahun " + period.getMonths() + " bulan");

        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(12, 30);

        Duration duration = Duration.between(t1, t2);
        System.out.println(duration.toHours() + " jam " + duration.toMinutesPart() + " menit");

        System.out.println("Parsing and Formatting");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        String formatted = LocalDateTime.now().format(formatter);
        System.out.println(formatted); // 25-09-2025 15:30

        LocalDateTime parsed = LocalDateTime.parse("23-05-1995 10:15", formatter);
        System.out.println(parsed);



    }
}
