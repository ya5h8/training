class Student{ 
	String name;
	int totalMarks;
	double percentage;

	public student(String name, int[] marks){
		this.name = name;
		this.totalMarks = 0;

		for(int mark : marks){
			this.totalMarks += mark;
		}
		this.percentage = (this.totalMarks /600.00) * 100;

	}
}
public class TwoTopper{
	public static void main(String[] args) {
		Student[] student = {new Student("Krish", new int[]{85, 90, 78, 92, 88, 95});
		new Student("Ritesh", new int[]{85, 90, 78, 92, 88, 95});
		new Student("Shrinath", new int[]{85, 90, 78, 92, 88, 95});
		new Student("Ubaid", new int[]{85, 90, 78, 92, 88, 95});
		new Student("kaushal", new int[]{85, 90, 78, 92, 88, 95});
	};
	for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].percentage < students[j + 1].percentage) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("Top 2 Students:");
        System.out.println(students[0].name + ":"+students[0].percentage);






	}
}