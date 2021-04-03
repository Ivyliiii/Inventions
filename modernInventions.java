public class modernInventions extends Invention{
	private String inventor;
	
	public modernInventions(String name, int age, String placeOfOrigin, String inventor) {
		super(name, age, placeOfOrigin);
		this.inventor = inventor;
	}
	
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + super.getPlaceOfOrigin() + ", " + inventor;
	}
	
	public String getInventor() {
		return inventor;
	}
	
	public boolean isFromUS() {
		if(super.getPlaceOfOrigin() == "USA") {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		modernInventions computer = new modernInventions("computer", 37, "USA", "J. Presper Eckert and John Mauchly");
		System.out.println(computer);
		System.out.println(computer.isFromUS());
	}
	
	
}
