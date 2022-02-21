package Assignments.Assignment11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Occurrence {
    private static final int DEFAULT_BUFFER_SIZE = 8912;

    public static void main(String[] args) {
        Map<Character, Integer> charCount = new HashMap<>();
        try {
            File file = new File("file.txt");
            InputStream in = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while((line = br.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    char c = line.charAt(i);
                    if(charCount.containsKey(c)){
                        int count = charCount.get(c);
                        charCount.put(c, count + 1);
                    }else{
                        charCount.put(c, 1);
                    }
                }
            }
            Iterator hmIterator = charCount.entrySet().iterator();
            byte[] bytes = new byte[DEFAULT_BUFFER_SIZE];
            //append = true
            FileOutputStream outputStream = new FileOutputStream("output.txt", true);
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                int count = (int) mapElement.getValue();
                String s = mapElement.getKey() + " : " + count +"\n";
                outputStream.write(s.getBytes(StandardCharsets.UTF_8));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}