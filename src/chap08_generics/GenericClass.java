package chap08_generics;

public class GenericClass {

	public static void main(String[] args) {
		CourseAds<String, Integer> courseObj = new CourseAds();
		courseObj.setTime("11");
		courseObj.setChapter(8);
		System.out.println(courseObj.getTime());
		System.out.println(courseObj.getChapter());
	}

}
