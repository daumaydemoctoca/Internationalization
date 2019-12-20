import java.text.NumberFormat;
import java.util.Locale;

public class NumberExample {
    static void printNumber(Locale locale) {
        double dbl = 105000.3245;
        NumberFormat formatter = NumberFormat.getNumberInstance(locale);
        String number = formatter.format(dbl);
        System.out.println(number + " for the locale " + locale);
    }

    public static void main(String[] args) {
        printNumber(Locale.UK);
        printNumber(Locale.US);
        printNumber(Locale.FRANCE);
        printNumber(Locale.JAPAN);
        printNumber(new Locale("vi"));
    }
}
