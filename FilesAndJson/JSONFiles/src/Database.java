import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    /* TODO
Declare a member variable that can
be EASILY set from the constructor. */
    public JsonObject data;

    public Database(JsonObject data){
        /* TODO 
set the memebr variable declared above.*/
        this.data = data;
    }

    public JsonObject getRestaurant(String name) {
        JsonArray restaurants = (JsonArray) this.data.get("restaurants");
        for (int i = 1; i <= restaurants.size(); i++) {
            JsonObject restaurant = (JsonObject) restaurants.get(i);
            String restaurantName = (String) restaurant.get("name");
            if (restaurantName.equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public double getAvgReviews(String name){
        JsonObject restaurant = getRestaurant(name);
        JsonArray reviews = (JsonArray) restaurant.get("reviews");
        double ratingsSum = 0;

        for (int i = 0; i < reviews.size(); i++) {
            JsonObject review = (JsonObject) reviews.get(i);
            ratingsSum += Double.parseDouble((review).get("rating").toString());
        }
        return ratingsSum / reviews.size();
    }
}
