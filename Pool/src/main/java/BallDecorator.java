public abstract class BallDecorator extends PoolBalls {
	protected PoolBalls decoratedBall_l; 

	public BallDecorator(PoolBalls decoratedBall){
		
		
		 decoratedBall_l =  decoratedBall;
		 System.out.println( "rus" +this.decoratedBall_l.getCenterX() );
	 }
	 public void setMass(double mass){
		 decoratedBall_l.setMass(mass);
	 }
}
