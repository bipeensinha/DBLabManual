import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteExample {
        public static void main(String[] args) {
                    String outputFilePath = "output.txt"; // Path to your output file

                            List<String> linesToWrite = List.of("Hello, world!", "This is a test.");

                                    try {
                                                    // Write the list of lines to the file
                                                    Files.write(Paths.get(outputFilePath), linesToWrite);
                                                                            
                                                    System.out.println("Data written to file successfully.");

                                         } catch (Exception e) {
                                        e.printStackTrace();
                                 }
                }
            }

                                                                                                