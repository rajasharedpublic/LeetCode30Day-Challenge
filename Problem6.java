/*Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
        Output:
        [
        ["ate","eat","tea"],
        ["nat","tan"],
        ["bat"]
        ]*/




import java.util.*;

public class Problem6 {

    /*public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        //Algo
        //Iterate
        //to char array
        //Sort
        //Create new Array list
        //Else add in hashmap

        for(String s: strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            } else {
                map.get(s).add(s);
            }
        }

        return new ArrayList<List<String>>(map.values());

        }
   }*/

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
        public static void main(String args[]){

            String[] ar= {"eat", "tea", "tan", "ate", "nat", "bat"};
            groupAnagrams(ar);

           // for()


        }
}
