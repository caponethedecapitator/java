import java.util.Map;
import java.util.HashMap;

public class HashMapTest 
{
    public static void main(String args[])
    {
        Map<String, String> CapitalCities = new HashMap<String, String>();
        CapitalCities.put("England", "London");
        CapitalCities.put("France", "Paris");
        CapitalCities.put("Germany", "Berlin");
        CapitalCities.put("Italy", "Rome");
        System.out.println(CapitalCities);
        CapitalCities.remove("Italy");
        System.out.println(CapitalCities.get("England"));
        System.out.println(CapitalCities);
    }    
}
