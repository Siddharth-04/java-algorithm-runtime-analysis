import java.io.*;

public class FileReadPerformance {
    private static final String FILE_PATH = "file.txt";

    public static void main(String[] args) throws IOException {
        System.out.println("File Read Performance Test");

        long startTime = System.nanoTime();
        readUsingFileReader(FILE_PATH);
        long time1 = System.nanoTime() - startTime;
        System.out.println("Time taken using FileReader: " + time1 + " ns");

        startTime = System.nanoTime();
        readUsingInputStreamReader(FILE_PATH);
        long time2 = System.nanoTime() - startTime;
        System.out.println("Time taken using InputStreamReader: " + time2 + " ns");
    }

    public static void readUsingFileReader(String filePath) throws IOException {
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {
                //Read
            }
        }
    }

    public static void readUsingInputStreamReader(String filePath) throws IOException {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {
                // Reading byte stream converted to characters
            }
        }
    }
}
//File Read Performance Test
//Time taken using FileReader: 1565000 ns
//Time taken using InputStreamReader: 903200 ns