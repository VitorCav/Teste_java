package inheritance;

public class Teacher extends Person{
	
	private int numCourses;
	private String[] courses;
	public static final int MAX_COURSES = 5;
	
	public Teacher(String name, String address) {
		super(name, address);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];		
	}
	
	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}
	
	public boolean addCourse(String course) {
		
		for (int i =0; i < MAX_COURSES; i++) {
			if (course == this.courses[i]) {
				System.out.println("Curso já cadastrado!");
				return false;				
			}			
		}
		if (this.numCourses == 5) {
			System.out.println("Numero maximo de cursos cadastrado!");
			return false;
		}
		this.courses[this.numCourses] = course;
		this.numCourses++;
		return true;
	}
	
	public boolean removeCourse(String course) {
		for (int i =0; i < MAX_COURSES; i++) {
			if (course == this.courses[i]) {
				this.courses[i] = "";
				this.numCourses--;
				System.out.println("Curso removido");
				return true;				
			}			
		}
		System.out.println("Curso não listado! ");
		return false;
		
	}
	

}
