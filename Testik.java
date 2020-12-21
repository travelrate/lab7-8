package lab78;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
public class Testik {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        String[] st = new String[5];
        states.add("Ukrain");
        states.add("Moldova");
        states.add(1,"USA");
        states.add("Russia");
        System.out.println(states.get(1));
        for(int i = 0;i<states.size();i++)System.out.println(states.get(i));

        /////////////////////////////////////
        System.out.println("////////////////////////");
        Object[] countries = states.toArray();
        for(Object count : countries){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
////////////////////////////////////////////////////////
        for (String it: states) System.out.println(it);
        LinkedList<String> vaze = new LinkedList<String>();
        vaze.add("Orange");
        vaze.addFirst("Cucumber");
        vaze.addLast("Apple");
        vaze.add(1,"Citrus");
        for(String it:vaze){
            System.out.println(it);
        }
        String tmp = vaze.getFirst();
        System.out.println("first elem of list "+tmp);
        vaze.remove("plun");
        for(String it:vaze){
            System.out.println(it);
        }
        ///////////////////////////////////////////////
        System.out.println("////////////////////////");
    }
}