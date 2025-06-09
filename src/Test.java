import java.util.Locale;

public class Test {
  public static void main(String[] args) {
    Locale[] all = Locale.getAvailableLocales();
    for (Locale locale : all) {
      String country = locale.getCountry();
      if(country.equalsIgnoreCase("IN")){
        System.out.println(locale.getLanguage());
        System.out.println("code is working fine");
        
      }
    }
  }
} 