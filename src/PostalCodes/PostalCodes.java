package PostalCodes;

import java.util.HashMap;
import java.util.Map;

public class PostalCodes {
    Map<String, String> streetsByPostalCode = new HashMap<>();
    public static void main(String[] args) {
        PostalCodes p = new PostalCodes();
        p.generateData();

        System.out.println(p.streetsByPostalCode.get("2180"));
        System.out.println("");

        p.printAllStreets();
        System.out.println("");

        p.printAllData();
        System.out.println("");

        p.printStreet("2600");
        System.out.println("");


    }

    public void generateData(){
        streetsByPostalCode.put("2180", "Handboogstraat");
        streetsByPostalCode.put("2170", "laaglandlaan");
        streetsByPostalCode.put("2900", "Alice Nahonlei");
        streetsByPostalCode.put("2600", "Vredestraat");
        streetsByPostalCode.put("2627", "Provinciale Steenweg");
    }

    public void printAllStreets(){
        for (Map.Entry<String, String> entry : streetsByPostalCode.entrySet()){
            System.out.println(entry.getValue());
        }
    }

    public void printAllData(){
        for (Map.Entry<String, String> entry : streetsByPostalCode.entrySet()){
            System.out.printf("%s : %s%n", entry.getKey(), entry.getValue());
        }
    }

    public void printStreet(String ZIP){
        for (Map.Entry<String, String> entry : streetsByPostalCode.entrySet()){
            if (entry.getKey().equals(ZIP)){
                System.out.println(entry.getValue());
            }
        }
    }

}
