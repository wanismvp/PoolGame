

public class Reg_pool_ball extends PoolBalls {

	private Reg_pool_ball [] smallBalls = new Reg_pool_ball[5];
	public Reg_pool_ball() {
		smallBalls[0] = new Reg_pool_ball();
		smallBalls[0].setMass(1);
		smallBalls[1] = new Reg_pool_ball();
		smallBalls[0].setMass(1);
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
}















