import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadExample {
        public static void main(String[] args) {
                    String inputFilePath = "input.txt"; // Path to your input file

                            try {
                                // Read all lines from the file into a List of Strings
                                List<String> lines = Files.lines(Paths.get(inputFilePath))
                                        .collect(Collectors.toList());
                                                                                                          
                                //Print Each line to the console
                                lines.forEach(System.out::println);                                                                                    // Print each line to the console
                                                                                                                                  lines.forEach(System.out::println);

                            } catch (Exception e) {
                                            e.printStackTrace();
                            }
        }
}
                           
        
