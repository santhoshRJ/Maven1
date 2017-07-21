import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;

class MapConcept
{
public static void main(String[] args) {
List<String> tamilcity=new ArrayList<String>();
tamilcity.add("Erode");
tamilcity.add("Salem");
tamilcity.add("Coimbatore");
List<String> keralacity=new ArrayList<String>();
keralacity.add("palaikadu");
keralacity.add("ernakulam");
Map<String,List<String>> state=new HashMap<>();
state.put("tamilnadu", tamilcity);
state.put("kerala",keralacity);
Map<String,Map<String,List<String>>> country=new HashMap<>();
country.put("india",state);

for(Map.Entry s : country.entrySet())
{
	System.out.println(s.getKey());
}

//country.entrySet().stream().filter(str->str.getkey()=="india").flatMap(str->str.stream()).collect(Collectors.toMap(str->str.getkey(),str->str));

}
}