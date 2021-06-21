package profileCourse;

public class CourseManager {
	
	public void addToCourse(Course course) {
		System.out.println("kursa dahil olundu :" + course.courseName);
	}
	public void nextLesson(Course course) {
		System.out.println("> bir sonraki derse gec :");
	}
	public void previousLesson(Course course) {
		System.out.println("< onceki derse gel :");
	}
	public void finishContinue(Course course) {
		System.out.println("bitir ve devam et");
	}
	
}
