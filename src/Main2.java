import java.util.Scanner;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k1 = scanner.nextInt();
            scanner.nextLine();
            Map<String,String> map = new TreeMap<String, String>();
            do {
                String key = scanner.nextLine();
                String value = scanner.nextLine();
                if (map.containsKey(key)) {
                    System.out.println(map.get(key));
                    map.remove(value);
                }
                map.put(key,value);
            } while (map.size()<k1);
            SortedSet keys = (SortedSet) map.keySet();
            for (Object key: keys) System.out.println(key);
        }
}

