interface PetCarer {
	void feed();
	void play();
}
class Student implements PetCarer{
	public void feed() {
		System.out.println("Student feeding.");
	}
	public void play() {
		System.out.println("Student playing.");
	}
}
class Teacher implements PetCarer{
	public void feed() {
		System.out.println("Teacher feeding.");
	}
	public void play() {
		System.out.println("Teacher playing.");
	}
}
class Official implements PetCarer{
	public void feed() {
		System.out.println("Official feeding.");
	}
	public void play() {
		System.out.println("Official playing.");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		Official o = new Official();
		care(s);
		care(t);
		care(o);
	}
	
	private static void care(PetCarer p) {
		p.feed();
		p.play();
	}

}
