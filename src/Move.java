
public class Move {
	final public String name;
    final public String type;
    private String category;
    private int power;
    private int accuracy;
    private int pp;
    public Move(String n, String t){
    	this.name=n;
    	this.type=t;
    }
	public Move(MoveBuilder moveBuilder) {
		this.name=MoveBuilder.name;
		this.type=MoveBuilder.type;
		this.category=MoveBuilder.getCategory();
		this.power=MoveBuilder.getPower();
		this.accuracy=MoveBuilder.getAccuracy();
		this.pp=MoveBuilder.getPp();
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
    
    

}
