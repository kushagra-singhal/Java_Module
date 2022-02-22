package Assignments.Assignment1;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    private void findFile()
    {

        // address of files or folder where to search
        File file = new File("/home/kushas/Documents");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continuous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is truer than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Re-enter the name of the file.");
            }
        } while(true);
    }

    //declared main()
    public static void main(String[] args){
        //object of Demo class is created
        FileSearch obj =new FileSearch();
        //calling the findFile()
        obj.findFile();
    }
}


