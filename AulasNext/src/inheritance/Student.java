package inheritance;

public class Student extends Person{
	
	private int numCourses;
	private String[] courses;
	private int[] grades;
	public static final int MAX_COURSES = 30;
	
	
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	    grades = new int[MAX_COURSES];
	}
	
	@Override
	public String toString() {
		return "Student: " + super.toString();
	}
	
	public void addCourseGrade (String course, int grade) {
		if (numCourses == MAX_COURSES) {
			return;
		}
		courses[numCourses] = course;
		grades[numCourses] = grade;		
		numCourses++;		
	}
	
	public void printGrades() {
		for (int i = 0; i < numCourses; i++) {			
			System.out.println("Curso: " + courses[i] + " Nota: " + grades[i]);
			
		}
	}
	
	public double getAverageGrade() {
		double soma = 0;
		for (int i = 0; i < numCourses; i++) {			
			soma += grades[i];			
		}
		return soma/numCourses;
	}	

}
