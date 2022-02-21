package Assignments.Assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurence {
    public static void main(String[] args)
    {
        Scanner fileScanner;
        PrintWriter fileWriter;
        try {

            HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();

            fileScanner = new Scanner(new File("assi11Input.txt"));

            while(fileScanner.hasNext()) {
                char[] charArray = fileScanner.next().toCharArray();
                for (char ch : charArray) {
                    if (charCount.containsKey(ch)) {
                        charCount.put(ch, charCount.get(ch) + 1);
                    } else {
                        charCount.put(ch, 1);
                    }
                }
            }
            fileWriter = new PrintWriter("assi11Output.txt");
            for (Map.Entry<Character,Integer> entry : charCount.entrySet())
            {
                fileWriter.println(entry.getKey() + ": " + entry.getValue());
            }
            fileScanner.close();
            fileWriter.close();
        }

        catch(FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
