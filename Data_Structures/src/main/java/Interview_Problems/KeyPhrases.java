package Interview_Problems;

import java.util.ArrayList;
import java.util.HashMap;

//Suppose you have a set of English text documents
//and wish to rank which document is most relevant to the query 
//the brown cow . A simple way to start out is by eleminating 
//documents  that do not contain all three words the brown, and cow
// but this still leaves many documents.

public class KeyPhrases
{
    public static void main(String[] args) {
        String text="Suppose you have a set of English text documents and wish to rank which document is most relevant to the query , the brown cow . A simple way to start out is by eleminating documents that do not contain all three words the brown , and cow , but this still leaves many documents.";
        ArrayList<String> wrodToExclude = new ArrayList<>();
        wrodToExclude.add("the");
        wrodToExclude.add("a");
        wrodToExclude.add("by");
        wrodToExclude.add("to");
        wrodToExclude.add("and");
        wrodToExclude.add("of");
        wrodToExclude.add(",");
        wrodToExclude.add(".");
        wrodToExclude.add("is");
        HashMap<String, Integer> wordFreq=new HashMap<>();
        int maxFrequency=0;
        System.out.println(text);
        String[] textSp=text.split(" ");
        for (String word : textSp) {
            System.out.println(word);
            if(wrodToExclude.contains(word) || word.trim().length()==0)
            {
                continue;
            }
            String key= word.trim().toLowerCase();
            if(wordFreq.get(key)==null)
            {
                wordFreq.put(key, 1);
            }
            else{
                int frequency=wordFreq.get(key)+1;
                wordFreq.put(key, frequency);

            }
            if(wordFreq.get(key)>maxFrequency)
            {
                maxFrequency=wordFreq.get(key);
            }
        }

        for (String key : wordFreq.keySet()) {
            if(wordFreq.get(key)==maxFrequency)
                System.out.println(key+":"+wordFreq.get(key));
        }

    }
}