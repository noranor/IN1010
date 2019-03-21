import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class Studentsystem{

	private HashMap<String, Fag> fagliste = new HashMap<String, Fag>();
	private HashMap<String, Student> studentliste = new HashMap<String, Student>();
	private Scanner input =new Scanner(System.in);

	public void leseFil(String filnavn){
		try{
			fil = new Scanner(new File(filnavn));
		} catch (FileNotFoundException e){
			System.out.println("Finner ikke " + filnavn + "!");
			System.exit(1);
		}

		while(fil.hasNextLine()){
			String linje = fil.nextLine();
			// Dersom den første character i linje er *..
			if(linje.charAt(0) =="*"){
				// ..så opprettes et nytt fag. 
				// .substring(1) gjør sånn at navnet ikke starter på "*".
				Fag fag = new Fag(linje.substring(1));
				fagliste.put(fag.toString(), fag);
			}else{
				Student student;
				// Hvis studentlisten allerede har navnet i seg..
				if(studentliste.containsKey(linje)){
					// Så finner den fram det navnet.
					student = studentliste.get(linje);
				}else{
					student = new Student(linje);
					studentliste.put(student.toString(), student);
				}
				student.leggTilFag(fag);
				fag.leggTilStudent(student);
			}
		}
	}
}