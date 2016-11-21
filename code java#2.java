package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Delete all people that have the same name
*/

public class Solution
{
  
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Colin", "David");
        map.put("Horney", "Farell");
        map.put("Lost", "David");
        map.put("Braun", "Gven");
        map.put("Rent", "Farell");
        map.put("McCalister", "David");
        map.put("Perry", "Mathew");
        map.put("Shwimer", "Johb");
        map.put("Geller", "Ross");
        map.put("Kaufman", "David");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        
       Map<String, String> map1 = new HashMap<String, String>(map);
        Map<String, String> map2 = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : map1.entrySet()){
            map2.remove(pair.getKey());

            if (map2.containsValue(pair.getValue()))
                removeItemFromMapByValue(map, pair.getValue());
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
