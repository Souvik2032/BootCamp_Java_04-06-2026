package variable;

public class Instance_variable {
	int RollNo;
	int TotalMarks;
	int Number;
	String name;
	
	public static void main(String args[]) {
		Instance_variable obj =new Instance_variable();
		obj.RollNo=34;
		obj.TotalMarks=45;
		obj.Number=12345678;
		obj.name="Souvik";
		System.out.println(obj.RollNo);
		System.out.println(obj.TotalMarks);
		System.out.println(obj.Number);
		System.out.println(obj.name);
	}
}
