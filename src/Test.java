import java.util.Locale;

public class Test {
  public static void main(String[] args) {
    Locale[] all = Locale.getAvailableLocales();
    for (Locale locale : all) {
      String country = locale.getCountry();
      if(country.equalsIgnoreCase("IN")){
        System.out.println(locale.getLanguage());
        System.out.println("code is not working fine");
        System.out.println("still working fine");
        System.out.println("yes its working");
        System.out.println("plese check the code once");
        System.out.println("code check done");
        System.out.println("code check done successsfully");
        System.out.println("FINAL VERSION DONE");
        

        
      }
    }
  }
} 