package serviceImplementation;
import java.net.*;
import java.io.*;

public class ConsumeService {
    public static void main(String[] args) throws Exception {
        URL request= new URL("http://localhost:3000/products.json");
        URLConnection rc = request.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                rc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}