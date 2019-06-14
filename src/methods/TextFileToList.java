package methods;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class TextFileToList {

  public static void main(String[] args) {

    List<String> lineLst = getTextFileAsList("Files.txt");
    System.out.println(lineLst);
   // List<String>lineLst2 = getTextFileAsList();
  }
  /*
   * DO NOT MODIFY AND JUST USE IT
   * Method name : getTextFileAsList
   * @parameter  location of text file as String
   *   if your file is at root path (right under project folder)
   *  you may directly path your filename.txt
   *  if not pass /your/own/folder/name/filename.txt as String to method
   * 
   * @return List of String that contain each line as per element

   */
  public static List<String> getTextFileAsList(String filePath) {

    List<String> allLines = null;
    try {
      allLines = Files.readAllLines(Paths.get(filePath));
    } catch (Exception e) {
      System.out.println("Wrong file path probably");
    }
    return allLines;

  }
}