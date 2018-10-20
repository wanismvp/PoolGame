import java.util.ArrayList;

public class PocketCollection {

    protected ArrayList<PoolPocket> nodes = new  ArrayList<>();

    public void addPocket(PoolPocket pocket) {
        nodes.add(pocket);
    }
    public ArrayList<PoolPocket> getPockets(){
        return nodes;
    }
}
