import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris-data.csv");
    }

    public Database readCSV(String filename) {
        String contents = "";
        /* TODO.
Change what needs to go here to start reading "filename" */
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))){
            /* TODO
Create a byte array of about 1024 bytes or however many bytes you want. */
            byte[] buffer = new byte[1024];
            int lengthRead;
            /* TODO 
Create a while loop to read the contents of the file and put them in the variable "contents" declared at the beginning of the method. */
            while ((lengthRead = in.read(buffer)) > 0) {
                contents += new String(buffer, 0, lengthRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        /* TODO
Return a Databse object initialized with the contents read. */
        return new Database(contents);
    }
}
