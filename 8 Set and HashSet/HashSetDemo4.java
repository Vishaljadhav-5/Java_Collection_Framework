import java.util.HashSet;

public class HashSetDemo4
{
    public static void main(String[] args) 
    {
        // In HashSet there is no get() method beecause it is not index based, so here iterotor is used.
        HashSet<Object> hs4 = new HashSet<>();


        hs4.add("aaa");
        hs4.add("bbb");
        hs4.add("ccc");
        hs4.add("ddd");

        System.out.println("Element is present or not: " + hs4.contains("bbb"));

        System.out.println("to remove: "+ hs4.remove("ccc"));

        System.out.println("The size of hashset : " + hs4.size());


        hs4.clear(); //clear all elements - []
        System.out.println("After Clearing : " + hs4);
    }
}

//Output:-

//Element is present or not: true
// to remove: true
// The size of hashset : 3
// After Clearing : []
