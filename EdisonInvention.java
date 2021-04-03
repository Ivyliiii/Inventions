public class EdisonInvention extends modernInventions{
	private String field;

	public EdisonInvention(String name, int age, String placeOfOrigin, String field) {
		super(name, age, placeOfOrigin, "Thomas Edison");
		this.field = field;
	}
	
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + super.getPlaceOfOrigin() + ", " + super.getInventor() + ", "+ field; 
	}
	
	public int edisonAge() {
		int age = super.getAge();
		age = 2021-age;
		age = age - 1847;
		return age;
	}
	
	public static void main(String[] args) {
		EdisonInvention lightBulb = new EdisonInvention("lightbulb", 142, "New Jersey", "electricity");
		System.out.println(lightBulb);
		System.out.println(lightBulb.edisonAge());
	}
	
	
}
