package refactor.fileReader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
	public List<String> readFile(String filename) {
		List<String> returnList = new ArrayList<String>(); 
		Path card_path = Paths.get("../Apples2ApplesHomeExam/src/refactor/inputFiles/", filename + ".txt");

		try {
	        List<String> lines = Files.readAllLines(card_path, StandardCharsets.ISO_8859_1);
	    for (String line : lines) {
	 	   returnList.add(line);
	        }
	    }   catch (IOException e) {
	            System.out.println(e);
	        }
	    return returnList;
	}
}
