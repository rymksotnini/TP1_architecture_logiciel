import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Base64;
public class encodeBasedOnNetworkAndDatabase implements IEncodingModule
{
        private URL url;
        private IDatabase database;
        public encodeBasedOnNetworkAndDatabase(URL url,IDatabase database)
        {

                this.url=url;
                this.database=database;
        }
        @Override
        public void encode() {
                InputStream in;
                in = this.url.openStream();
                InputStreamReader reader = new InputStreamReader(in);
                StringBuilder inputString1 = new StringBuilder();
                int c;
                c = reader.read();
                while (c != -1) {
                        inputString1.append((char) c);
                        c = reader.read();
                }
                String inputString = inputString1.toString();
                String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
                this.database.write(encodedString);
        }

}