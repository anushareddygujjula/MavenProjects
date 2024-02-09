import execption.FileContentReader;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileContentReaderTest {

    @Test
    void testPrintFileContents() throws IOException {
        // Set up a test file with some content
        String fileName = "testFile.txt";
        String fileContent = "Hello, world!\nThis is a test file.";

        // Redirect stdout to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Write content to test file
        FileUtil.writeToFile(fileName, fileContent);

        // Create FileContentReader instance and call printFileContents
        execption.FileContentReader fileContentReader = new execption.FileContentReader();
        fileContentReader.printFileContents(fileName);

        // Reset stdout
        System.setOut(System.out);

        // Verify printed output matches file content
        assertEquals(fileContent, outContent.toString().trim());
    }
}

class FileUtil {
    public static void writeToFile(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();
    }
}