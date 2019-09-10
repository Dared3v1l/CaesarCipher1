package CaesarCipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class CaesarCipher {

    public static void main(String[] args) throws IOException {

        System.out.println("give me string to be converted");
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        Scanner myInput = new Scanner( System.in );

        String name = reader.readLine();
        name.replaceAll("\\s+","");
        System.out.println("give me number to use as Chipher");
        int num=myInput.nextInt();
        char [] stringToCharArray = name.toCharArray();


        String out="";

        for(int i=0;i<stringToCharArray.length;i++){
            stringToCharArray[i]=(char) (stringToCharArray[i]+num);
            out=out+stringToCharArray[i];



        }
        out=out.replace("!","");
        System.out.println(out);
    }
}

