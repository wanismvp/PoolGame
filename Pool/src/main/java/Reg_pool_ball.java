import javafx.scene.paint.Color;

public class Reg_pool_ball extends PoolBalls {

	private Reg_pool_ball [] smallBalls = new Reg_pool_ball[5];
	public Reg_pool_ball() {
		smallBalls[0] = new Reg_pool_ball();
		smallBalls[0].setMass(2);
		smallBalls[0].setFill(Color.web("red"));
		smallBalls[0].setRadius(3.0);
		smallBalls[1] = new Reg_pool_ball();
		smallBalls[1].setMass(1);
		smallBalls[1].setFill(Color.web("orange"));
		smallBalls[1].setRadius(1.0);
	}

	protected void setMass(double mass) {
		this.mass = mass; 
	}
	protected double getMass() {
		return mass; 
	}
	Reg_pool_ball(int x, int y, int r){
		super(x, y ,r); 
	}

	protected void setVelocity(double Velx, double Vely) {
		this.Velx = Velx; 
		this.Vely= Vely;
		
	}
	protected void setVelocityX(double Velx) {
		this.Velx = Velx;
		
	}
	protected double getVelocityX() {
		return Velx;
		
	}
	protected void setVelocityY(double Vely) {
		this.Vely= Vely;
		
	}
	protected double getVelocityY() {
		return Vely; 
		
	}
	protected void setChange(double changeX, double changeY) {
		 
	}
	
	protected double getChangeX() {
		return 0; 
	}
	protected double getChangeY() {
		return 0; 
	}
	protected void setOpos(double OposX, double OposY) {
	
	}
	protected double getOposX() {
		return 0; 
	}
	protected double getOposY() {
		return 0; 
	}

	public Reg_pool_ball[] getSmallBalls() {
		for (Reg_pool_ball ball : smallBalls) {
			ball.setVelocityX(this.getVelocityX() / 2);
			ball.setVelocityY(this.getVelocityY() / 2);
			ball.setCenterX(this.getCenterX());
			ball.setCenterY(this.getCenterY());
		}
		return smallBalls;
	}
}















