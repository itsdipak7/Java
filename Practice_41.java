import java.time.LocalDate;
import java.time.Period;

//Calculate Age
public class Practice_41 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate Bday=LocalDate.of(2000,07,17);
        int year=Period.between(Bday, today).getYears();

        System.out.println(today);
        System.out.println(Bday);
        System.out.println(year);
    }
}
