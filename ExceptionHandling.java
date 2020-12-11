import javax.swing.JOptionPane;

public class ExceptionHandling {

		
	public String name;
	public String email;
	public String phoneNumber;
	public String grade;
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void getAndPrintDat(){
		String name= JOptionPane.showInputDialog("Please enter name :");
		String email= JOptionPane.showInputDialog("Please enter email :");
		String phoneNumber= JOptionPane.showInputDialog("Please enter Phone number :");
		String gradeString= JOptionPane.showInputDialog("Please enter Grade :");

		int grade=0;
		try {
		 grade = Integer.parseInt(gradeString);

		} catch (NumberFormatException e) {
		}
		
		
		JOptionPane.showMessageDialog(null, "***** Data******\n Name is :" +name +"\nEmail is :"+email 
				+"\n Phone number is :"+phoneNumber +"\nGrade is :"+grade);
		

	}
	

	
	}

	
