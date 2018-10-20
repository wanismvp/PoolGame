import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import javafx.scene.paint.Color;

public class PocketCollectionBuilder extends Builder{


    PocketCollectionBuilder(JSONArray arrayToRead){
        this.arrayToRead = arrayToRead;
    }

    @Override
    public BallCollection ReadBalls() {
        return null;
    }

    public PocketCollection ReadPockets() {
        PocketCollection PocketCollection = new PocketCollection();
        if(arrayToRead != null) {

            for(int i=0; i< arrayToRead.size(); i++){

                JSONObject Pocket = (JSONObject) arrayToRead.get(i);
                JSONObject position  = (JSONObject) Pocket.get("position");

                double x = (Double) position.get("x");
                int n_pX = (int) Math.round(x);

                double y  = (Double) position.get("y");
                int n_pY = (int) Math.round(y);
                double radius = (Double) Pocket.get("radius");



                PoolPocket Pocket_element = new PoolPocket(n_pX, n_pY, radius);
                Color c = Color.web("black");
                Pocket_element.setFill(c);
                PocketCollection.addPocket(Pocket_element);
            }
            return PocketCollection;

        }
        else {
            System.out.println( "Array is null");
        }


        return null;
    }

}
