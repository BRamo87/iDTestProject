/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idtestproject;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
/**
 *
 * @author User
 */
public class IDTestProject {

    /**
     * @param args the command line arguments
     */


	public static void main(String[] args) throws FileNotFoundException, IOException {


		File file1 = new File("C://Users//User/1.txt");
		File file2 = new File("C://Users//User/2.txt");
		File three = new File("C://Users//User/3.txt");

		
                FileWriter writer = new FileWriter(three);

		Scanner scan1 = new Scanner(file1);
                Scanner scan2 = new Scanner(file2);

	
                 // The first 2 paths point to input files having one word or string per line. 
                 // Input files might contain thousands of strings.
                 
		List<String> one = new ArrayList<String>();

		List<String> two = new ArrayList<String>();

		while (scan1.hasNext()) {
			one.add(scan1.nextLine());
		}

		while (scan2.hasNext()) {
			two.add(scan2.nextLine());
		}


		
		String seiraproto = "";
		String seiradeutero = "";
		for (int i = 0; i < two.size(); i++) {

			seiraproto = two.get(i);

			for (int j = 0; j < one.size(); j++) {
				seiradeutero = one.get(j);

				if (seiraproto.equals(seiradeutero)) {
                                    
					//Im printing in the conse lines that are common in the two etext files
                                      
					System.out.println("these lines from text 1 and text 2 ARE the same >>>>  " + seiraproto + "\t" + seiradeutero+" <<<< and I will save it to 3.txt");
                                        
                                        
                                        // Programm it write to the 3rd file only 
                                        // the strings that are common in the two input files (intersection),
                                        // lexicographically ordered and without duplicates.
					writer.write(seiraproto);
					writer.write(System.getProperty("line.separator"));
					writer.flush();

                                        
                                        
                                        
					// I tried  removing duplicates using Hashset and adding again in list 
                                        //unfortunetaly it didnt work for me 
                                        
                                        //List<String> al = new ArrayList<>();
					//Set<String> hs = new HashSet<>();
					//hs.addAll(txtFile1);
					//hs.addAll(txtFile2);
					//al.clear();
					//al.addAll(hs);

				}

			}
		}
		writer.close();
	}
    
}
