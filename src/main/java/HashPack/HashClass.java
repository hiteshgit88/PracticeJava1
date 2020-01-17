package HashPack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

public class HashClass {

    public String getPropValue(String Key) throws IOException {

        Properties _properties = new Properties();
        HashMap<String, Integer> _hashmap = new HashMap<>();
        Hashtable<String, Integer> _hashtable = new Hashtable<>();

        InputStream inputStream = this.getClass().getResourceAsStream("/ConsoleApp");

        if (inputStream != null) {
            _properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file not found in the classpath");
        }

        for (String key : _properties.stringPropertyNames()) {
            String value = _properties.getProperty(key);
            _hashmap.put(key, Integer.valueOf(value));
        }

        System.out.println("HashMap: " + _hashmap.get((Key)));

        for (String key : _properties.stringPropertyNames()) {
            String value = _properties.getProperty(key);
            _hashtable.put(key, Integer.valueOf(value));
        }

        System.out.println("HashTable: " + _hashtable.get((Key)));


        return _properties.getProperty(Key);
    }



    public static void main(String[] args) throws IOException {

        HashClass _hashclass = new HashClass();

        _hashclass.getPropValue("testkey");

    }
}
