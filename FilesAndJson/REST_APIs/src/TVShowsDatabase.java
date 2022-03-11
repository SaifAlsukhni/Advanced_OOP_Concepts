import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";
/* TODO
Create a method getURLSource that returns a String and gets a URL object as a parameter. It should also throw an exception.
This method should read the open stream of the url and concatenate it in a String. It should then return that String. */

    public String getURLSource(URL url) {
        String results = "";
        try {
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()) {
                results += urlScanner.nextLine();
            }
            urlScanner.close();

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "{\"result\":" + results + "}";
    }

    public JsonObject getShowsByName(String name) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"shows?q="+name);
        return (JsonObject) Jsoner.deserialize(getURLSource(url), new JsonObject());
    }


    public JsonObject getPeopleInShows(String query) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"people?q="+query);
        return (JsonObject) Jsoner.deserialize(getURLSource(url), new JsonObject());
    }


    public String formatShowAsString(JsonObject doc){
        /* TODO
This should return a String with each show in four fields:
Name:the name of the show
Link:the link to the show
rating average:The rating average of teh show, and
summary, the summary of the show.*/
        String results = "";
        JsonArray shows = (JsonArray) doc.get("result");

        for (Object show : shows) {
            JsonObject object = (JsonObject) show;
            JsonObject json = (JsonObject) object.get("show");
            results += "Name:" + json.get("name") + "\n";
            results += "Link:" + json.get("url") + "\n";
            results += "Rating average:" + json.get("rating") + "\n";
            results += "Summary:" + json.get("summary");
        }
        return results;
    }

    public void saveShows(String text, String outfile){
        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */
        try (FileOutputStream fos = new FileOutputStream(outfile)) {
            fos.write(text.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
