package Hashing;

public class HashTableArrayDemo {
    public static void main(String[] args) {
        
    
    HashTableArray<String> ht=new HashTableArray<String>(10);
    ht.put(11,"Mary");
    ht.put(41,"Alice");
    ht.put(13,"Job");
    System.out.println(ht.get(11));
    }
}
