package by.it.akhmelev.jd01_12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TaskB1 {
    public static void main(String[] args) {

        Map<String,Integer> map=new TreeMap<>();

        Scanner scanner=new Scanner(System.in);
        while (true){
            String line=scanner.nextLine();
            if (line.equals("end"))
                break;
            String[] words = line.split("[^a-zA-Z']+");
            //перебор слов
            for (String word : words) {
                //проверка слова в карте
                if (map.containsKey(word)) {
                    int count=map.get(word);
                    map.put(word,count+1);
                }
                else
                    map.put(word,1);

            }

        }

        //перебор карты
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey()+"="+pair.getValue());
        }


    }
}
