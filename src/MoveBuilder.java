
public class MoveBuilder {
	public static String name="default";
    public static String type="default";
    private static String category;
    private static int power;
    private static int accuracy;
    private static int pp;
    
    public MoveBuilder(String name){
    	this.name=name;
    }
    public MoveBuilder type(String type){
    	this.type=type;
    	return this;
    }
    public MoveBuilder category(String catergory){
    	this.category=category;
    	return this;
    }
    public MoveBuilder power(int power){
    	this.setPower(power);
    	return this;
    }
    public MoveBuilder accuracy(int accuracy){
    	this.setAccuracy(accuracy);
    	return this;
    }
    public MoveBuilder pp(int pp){
    	this.setPp(pp);
    	return this;
    }
    public Move build(){
    	return new Move(this);
    }
	public static int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public static int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	public static int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public static String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}
}
