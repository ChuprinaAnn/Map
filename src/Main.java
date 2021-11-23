import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int k1 = scanner.nextInt();
        scanner.nextLine();
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < k1; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();
            map.put(key,value);
        }
        int k2 = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= k2; i++) {
            String test = scanner.nextLine();
            if (map.containsKey(test)) {
                out.println(map.get(test));
                map.remove(test);
            }
            else {
                out.println("null");
            }
        }

        out.println(map.size());
        Set keys = map.keySet();
        for (Object key: keys) System.out.println(key);
    }
}