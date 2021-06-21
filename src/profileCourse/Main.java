package profileCourse;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"yazilim gelistirici yetistirme kampi Java + React",15,"engin demirog");
		Course course2 = new Course(2,"yazilim gelistirici yetistirme kampi C# + Angular",20,"engin demirog");
		Course course3 = new Course(3,"yazilim gelistirici yetistirme kampi javascript",18,"engin demirog");
		
		
		System.out.println("Kurslar :");
		
		Course[] courses = {course1,course2,course3};
		for(Course course : courses) {
			System.out.println(course.courseName);
		}
		
		Profile profile1 = new Profile(8,"mehmet","demir","demirmehmet@deneme.com");
		Profile profile2 = new Profile(9,"ayse","koken","aysekoken@deneme.com");
		Profile profile3 = new Profile(10,"zeliha","sert","zelihasert@deneme.com");
		
		System.out.println("Profiller :");
		Profile[] profiles = {profile1,profile2,profile3};
		
		for(Profile profile : profiles) {
			System.out.println(profile.name);
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.nextLesson(course1);
		courseManager.previousLesson(course1);
		courseManager.finishContinue(course1);
		
		
	}

}
