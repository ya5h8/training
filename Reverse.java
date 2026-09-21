import java.util.*;

class Reverse { 
    public static void main(String[] args) { 
        String name = "Hello"; 
        int greatest = 0; 
        HashMap<Character, Integer> map = new HashMap<>(); 

        for(int i = 0; i < name.length(); i++){
            char currentChar = name.charAt(i); 
            if(map.containsKey(currentChar)){ 
                map.put(currentChar, map.get(currentChar) + 1);
            } else { 
                map.put(currentChar, 1); 
            } 
        } 

        for(char ch : map.keySet()){ 
            if(map.get(ch) > greatest){ 
                greatest = map.get(ch); 
            } 
        } 

        System.out.println(greatest); 
    } 
}
