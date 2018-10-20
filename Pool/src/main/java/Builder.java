import org.json.simple.JSONArray;

public abstract  class Builder {
	
	JSONArray arrayToRead;
	public abstract  BallCollection ReadBalls();
	public abstract  PocketCollection  ReadPockets();


}