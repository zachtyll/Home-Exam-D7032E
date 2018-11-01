package refactor.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConfigSingleton {

   //create an object of SingleObject
   private static ConfigSingleton instance = new ConfigSingleton();

   //make the constructor private so that this class cannot be
   //instantiated
   private ConfigSingleton(){}

   //Get the only object available
   public static ConfigSingleton getInstance(){
      return instance;
   }

   public void showMessage() throws FileNotFoundException {
      System.out.println("Reading config file!");
      File file = new File("../Apples2ApplesHomeExam/src/refactor/config/config.txt");
      Scanner sc = new Scanner(file);
	  while (sc.hasNextLine()) {
	      String i = sc.nextLine();
	      System.out.println(i);
	  }
	  sc.close();

   }
}