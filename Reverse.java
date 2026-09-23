// import java.util.*;

// class Reverse { 
//     public static void main(String[] args) { 
//         String name = "Hello"; 
//         int greatest = 0; 
//         HashMap<Character, Integer> map = new HashMap<>(); 

//         for(int i = 0; i < name.length(); i++){
//             char currentChar = name.charAt(i); 
//             if(map.containsKey(currentChar)){ 
//                 map.put(currentChar, map.get(currentChar) + 1);
//             } else { 
//                 map.put(currentChar, 1); 
//             } 
//         } 

//         for(char ch : map.keySet()){ 
//             if(map.get(ch) > greatest){ 
//                 greatest = map.get(ch); 
//             }
//         }

//         System.out.println(greatest); 
//     } 
// }

class Reverse{
    public static void main(String[] args) {
        String str = "Yash";
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}