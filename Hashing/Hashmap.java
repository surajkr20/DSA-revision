package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void copyArr(int[] arr){
        HashMap<Integer, Integer> copyOfArr = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(!copyOfArr.containsKey(arr[i])){
                copyOfArr.put(arr[i], 1);
            }else{
                copyOfArr.put(arr[i], +1);
            }
        }
    }
    public static void main(String[] args) {
        // inmplementation of hashmap - country(key), population(value)
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        // insertion
        countryPopulation.put("india", 1500000000);
        countryPopulation.put("china", 1550000000);
        countryPopulation.put("usa", 15300000);
        countryPopulation.put("austrelia", 2500000);

        // deletion
        countryPopulation.remove("austrelia");

        // search or loopup
        System.out.println(countryPopulation.get("india")); // return actual value of key
        System.out.println(countryPopulation.containsKey("austrelia")); // return existence of key in the boolean 

        // iterate on the hashmap
        for(Map.Entry<String, Integer> e: countryPopulation.entrySet()){     // entrySet() - copy of map(key and value both)
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // iterate only keys
        Set<String> keys = countryPopulation.keySet(); // keySet() - copy only keys from map
        for(String value: keys){
            System.out.println(value + " ");
        }

        System.out.println(countryPopulation);
    }
}
