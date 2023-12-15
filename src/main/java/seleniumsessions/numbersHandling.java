package seleniumsessions;

public class numbersHandling {

	 public static void main(String[] args) {
	        Student student1 = new Student("Alice", 20);
	        Student student2 = student1;
	        Student student3 = new Student("Alice", 20);

	        boolean result1 = (student1 == student2);
	        boolean result2 = (student1.equals(student2));
	        boolean result3 = (student1 == student3);
	        boolean result4 = (student1.equals(student3));

	        System.out.println("Result 1: " + result1);
	        System.out.println("Result 2: " + result2);
	        System.out.println("Result 3: " + result3);
	        System.out.println("Result 4: " + result4);
	    }
	}

	class Student {
	    private String name;
	    private int age;

	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		
	    
	    

}
