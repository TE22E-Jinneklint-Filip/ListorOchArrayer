import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] leksaker = {"Hotwheels", "Lego", "Fidgetspinner", "Barbie", "Rubickskub"};

        String[] klassKompisar = {"Vincent", "Damjan", "Anton", "Mikeal", "Tådor"};

        int[] femVärden = {1, 3, 5, 7, 9};

        ArrayList<String> cities = new ArrayList<String>();

        for (int i = 0; i < leksaker.length; i++) {
            System.out.println(klassKompisar[i] + " ger " + leksaker[i] + " betyget " + femVärden[i]);

        }
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv in namnet på en stad: ");
            String cityName = scan.nextLine();

            if (cityName.toLowerCase().equals("exit")) {
                break;
            } else {
                cities.add(cityName);
            }
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

    }
}