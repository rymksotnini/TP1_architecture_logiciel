import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;

public class encodeWithFiles implements IEncodingModule
{       String inputFilePath;
        String outputFilePath;
        public encodeWithFiles(inputFilePath,outputFilePath)
        {
            this.inputFilePath=inputFilePath;
            this.outputFilePath=outputFilePath;
        }
        @Override
        public void encode() {
                BufferedReader reader = null;
                BufferedWriter writer = null;
                try {
                        reader = new BufferedReader(
                                new FileReader(this.inputFilePath));
                        writer = new BufferedWriter(
                                new FileWriter(this.outputFilePath));
                        String aLine;
                        while ((aLine = reader.readLine()) != null) {
                                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
                                writer.append(encodedLine);
                        }
                } finally {
                        if (writer != null) {
                                writer.close();
                        }
                        if (reader != null) {
                                reader.close();
                        }
                }
        }
}