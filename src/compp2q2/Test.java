/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compp2q2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ardakonak
 */


public class Test {
    public static void main(String[] args) throws Exception {
        // Variables
        SeparateChainHash separateChainHash = new SeparateChainHash(40);
        Scanner userInput = new Scanner(System.in);
        Scanner reader1 = new Scanner(new File("/Users/ardakonak/Desktop/1.txt"));
        Scanner reader2 = new Scanner(new File("/Users/ardakonak/Desktop/2.txt"));
        Scanner reader3 = new Scanner(new File("/Users/ardakonak/Desktop/3.txt"));
        Scanner reader4 = new Scanner(new File("/Users/ardakonak/Desktop/4.txt"));
        Scanner reader5 = new Scanner(new File("/Users/ardakonak/Desktop/5.txt"));
        Scanner reader6 = new Scanner(new File("/Users/ardakonak/Desktop/6.txt"));
        Scanner reader7 = new Scanner(new File("/Users/ardakonak/Desktop/7.txt"));
        Scanner reader8 = new Scanner(new File("/Users/ardakonak/Desktop/8.txt"));
        Scanner reader9 = new Scanner(new File("/Users/ardakonak/Desktop/9.txt"));
        Scanner reader10 = new Scanner(new File("/Users/ardakonak/Desktop/10.txt"));
        // Reading
        reader1.useDelimiter(" ");
        while(reader1.hasNext()){
            separateChainHash.addElement(reader1.next(), "1.txt");
        }
        reader1.close();
        
        reader2.useDelimiter(" ");
        while(reader2.hasNext()){
            separateChainHash.addElement(reader2.next(), "2.txt");
        }
        reader2.close();
        
        reader3.useDelimiter(" ");
        while(reader3.hasNext()){
            separateChainHash.addElement(reader3.next(), "3.txt");
        }
        reader3.close();
        
        reader4.useDelimiter(" ");
        while(reader4.hasNext()){
            separateChainHash.addElement(reader4.next(), "4.txt");
        }
        reader4.close();
        
        reader5.useDelimiter(" ");
        while(reader5.hasNext()){
            separateChainHash.addElement(reader5.next(), "5.txt");
        }
        reader5.close();
        
        reader6.useDelimiter(" ");
        while(reader6.hasNext()){
            separateChainHash.addElement(reader6.next(), "6.txt");
        }
        reader6.close();
        
        reader7.useDelimiter(" ");
        while(reader7.hasNext()){
            separateChainHash.addElement(reader7.next(), "7.txt");
        }
        reader7.close();
        
        reader8.useDelimiter(" ");
        while(reader8.hasNext()){
            separateChainHash.addElement(reader8.next(), "8.txt");
        }
        reader8.close();
        
        reader9.useDelimiter(" ");
        while(reader9.hasNext()){
            separateChainHash.addElement(reader9.next(), "9.txt");
        }
        reader9.close();
        
        reader10.useDelimiter(" ");
        while(reader10.hasNext()){
            separateChainHash.addElement(reader10.next(), "10.txt");
        }
        reader10.close();
        // User Input
        System.out.print("Enter a word: ");
        String userWord = userInput.next();
        System.out.println(separateChainHash.toString(userWord));
        
    }
}
