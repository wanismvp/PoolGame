import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PocketFactory implements AbstractFactoryConfiguration{

    @Override
    public Pool_table getPoolTable(String filepath) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BallCollection getPoolBalls(String filepath) {
        return null;
    }


    @Override
    public PocketCollection getPoolPockets(String filepath) {
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader(filepath));


            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);

            JSONObject Pockets = (JSONObject) jsonObject.get("Pockets");
            // System.out.println(Balls);

            JSONArray pocket_array = (JSONArray) Pockets.get("pocket");

            // System.out.println("size is: " + ball_array.size());

            Builder pocketCollectionBuilder = new PocketCollectionBuilder(pocket_array);
            PocketCollection pocketCollection = pocketCollectionBuilder.ReadPockets();
            return pocketCollection;


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ParseException e3) {
            e3.printStackTrace();
        }

        // TODO Auto-generated method stub
        return null;
    }


}
