import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class dataWriting {
	public File fileCreation() throws IOException {
		File f = new File("C://Users//theju//Desktop//Details.txt");
		f.createNewFile();
		return f;
	}
	
	public File getDetails(dataFetching df,File f) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = s.nextInt();
		df.setId(id);
		System.out.println("Enter name : ");
		String name = s.next();
		df.setName(name);
		System.out.println("Enter gender : ");
		String gender = s.next();
		df.setGender(gender);
		System.out.println("Enter age : ");
		int age = s.nextInt();
		df.setAge(age);
		System.out.println("Enter DOB : ");
		String dateOfBirth = s.next();
		df.setDateOfBirth(dateOfBirth);
		FileWriter fw = new FileWriter(f);
		fw.write("Id : "+df.getId());
		fw.write("Name : "+df.getName());
		fw.write("Gender : "+df.getGender());
		fw.write("Age : "+df.getAge());
		fw.write("Date of birth : "+df.getDateOfBirth());
		fw.close();
		return f;
	}
	
	
	public static void main(String[] args) throws IOException {
		dataWriting dw = new dataWriting();
		File f1 = dw.fileCreation();
		dataFetching df = new dataFetching();
		@SuppressWarnings("unused")
		File f2 = dw.getDetails(df, f1);
		
	}

}
