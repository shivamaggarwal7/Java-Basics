/*To simply add content to a file,Bufferedwriter can be uses whereas to append
 * content to an existing file FileWriter needs to be used.
 * 
 * In order to buffer the data stream while FileWriter stream is wrapped with BufferedWriter*/

package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaIO {

	public static final String FILE_PATH_READ="C:\\Users\\556823\\git\\Java-Basics\\src\\SonnetI.txt";
	public static final String FILE_PATH_WRITE="C:\\Users\\556823\\git\\Java-Basics\\src\\Sonnet.txt";
			
	public static void main(String[] args) {
		readFile();
		writeToFile();

	}

	public static void readFile() {
		try {
			BufferedReader reader=Files.newBufferedReader(
										Paths.get(FILE_PATH_READ),StandardCharsets.UTF_8);		        
			List<String> stringList = reader.lines()
				  .flatMap((t)->Stream.of(t))
				  .map(String::toUpperCase)
				  .limit(1)
				  .collect(Collectors.toList());
			
			stringList.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Sorry,but the file is not available at the specified location");
		}

	}

	public static void writeToFile() {
		
		try {
			/*BufferedWriter writer=Files.newBufferedWriter(Paths.get(FILE_PATH_WRITE), StandardCharsets.UTF_8);
			
			writer.write("Wow");
			writer.close();*/
			
			FileWriter fileWriter=new FileWriter(new File(FILE_PATH_WRITE), true);
			BufferedWriter writer=new BufferedWriter(fileWriter);
			
			writer.write("Yayy!!");
			writer.close();			
			
			System.out.println("File writing done!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot read the file");
		}

	}

}
