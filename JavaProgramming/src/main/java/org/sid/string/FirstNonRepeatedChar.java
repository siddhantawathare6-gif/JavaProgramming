package org.sid.string;

//Find the First Non-Repeated Character.(Find the first character that appears only once in a string.)

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "ssiiddhant";
        System.out.println(nonRepChar(str));

    }

    public static char nonRepChar(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
