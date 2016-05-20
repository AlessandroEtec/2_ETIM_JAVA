package metodos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Alessandro
 * @create: 20/05/2016, 13:43:00
 */
public class Datas {

    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDate hoje = agora.toLocalDate();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(df));

        DateTimeFormatter dtf = DateTimeFormatter.
                ofPattern("HH:mm:ss");
        System.out.println(agora.format(dtf));

        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Amanha: " + amanha.format(df));

        System.out.println(hoje.getDayOfWeek());
        if (hoje.getDayOfWeek() == DayOfWeek.FRIDAY) {
            System.out.println("Hoje é Sexta");
        }

        LocalDate proximaSexta = hoje.plusDays(1);
        while (proximaSexta.getDayOfWeek() != DayOfWeek.FRIDAY) {
            proximaSexta = proximaSexta.plusDays(1);
        }
        System.out.println("Proxima Sexta: " + 
                proximaSexta.format(df));

        TemporalAdjuster ajustarProximaSegunda = 
                TemporalAdjusters.next(DayOfWeek.MONDAY);
        LocalDate proximaSegunda = LocalDate.now().
                with(ajustarProximaSegunda);
        System.out.println("Proxima Segunda: " +
                proximaSegunda.format(df));

        int diasProximaSexta = proximaSexta.compareTo(hoje);
        int diasProximaSegunda = proximaSegunda.compareTo(hoje);

        System.out.println("Faltam " + diasProximaSexta + 
                " dias para a proxima Sexta");
        System.out.println("Faltam " + diasProximaSegunda + 
                " dias para a proxima segunda");

        MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
        LocalDate natalDesseAno = 
                natal.atYear(Year.now().getValue());
        long diasAteONatal = 
           LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);

        System.out.println("Faltam " + diasAteONatal + 
                " dias para o Natal");
        LocalDate diaQualquer = 
                LocalDate.of(2017, Month.DECEMBER, 02);

        System.out.println(diaQualquer.format(df));
    }
}
