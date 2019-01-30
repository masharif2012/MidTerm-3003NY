package datastructure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */

                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "London");
                map.put(2, "Oxford");
                map.put(3, "Cambridge");
                map.put(4, "Brighton");
                map.put(5, "Liverpool");
                map.put(6, "Manchester");
                System.out.println("Here's the Collection view of values(Cities)present in map");
                for (Map.Entry entry : map.entrySet()) {
                        System.out.println(entry.getKey()+" : "+entry.getValue());
                }
        }

}
