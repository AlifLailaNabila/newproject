package abstract_class;

public class TestEducation {

	public static void main(String[] args) {
		Education ed = new MyEducation();
			ed.school();
			ed.students();
			ed.teachers();
			
		
		MyEducation me = new MyEducation();
		me.school();
		me.presentation();
		
		
		Encapsulation en = new Encapsulation();
		en.setStName("Abby");
		System.out.println(en.getStName());
		
		en.setStID(103);
		System.out.println(en.getStID());
	}
}
