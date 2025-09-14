package oops2;

public class Course_main {
	 public static void main(String[] args) {
	        Course c1 = new Course("Java Programming", 6, 15000.0);
	        Course c2 = new Course("Web Development", 4, 12000.0);

	        System.out.println("Before Updating Institute");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	        System.out.println("Updating Institute Name ");
	        Course.updateInstituteName("XYZ Academy");

	        System.out.println(" After Updating Institute");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	    }

}
