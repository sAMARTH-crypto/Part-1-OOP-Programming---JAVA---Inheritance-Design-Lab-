public class HospitalEmployee 
{
	private String name;
	private int number;
	
	
	public HospitalEmployee() //Default Constructor
	{
		this.name = "None";
		this.number = 000;
		
	}
	
	public HospitalEmployee(String name, int number) // Parameterized Constructor
	{
		this.name = name;
		this.number = number;
		
	}

	public String getName() 
	{
		return name;
	}

	public int getNumber() 
	{
		return number;
	}

	
	
	public String toString() // will return string representation of object

	{

	return "Employee - " + this.name + " " + this.number + " | Employee";

	}
	
	public void work() 
	{
		System.out.println(name + " Works for the hospital");
	}
}

class Nurse extends HospitalEmployee
{
	String name;
	int number;
	int noOfPat;
	
	
	public Nurse() 
	{
		
		this.name = "None";
		this.number = 000;
		this.noOfPat = 000;
		
	}
	
	
	public Nurse(String name, int number, int noOfPat) 
	{
		
		this.name = name;
		this.number = number;
		this.noOfPat = noOfPat;
		
	}


	public String getName() {
		return name;
	}


	public int getNumber() {
		return number;
	}


	public int getNoOfPat() {
		return noOfPat;
	}



	
	public String toString() // will return string representation of object

	{

	return "Nurse - " + this.name + " " + this.number + " | Number of patients under her: " + this.noOfPat;

	}
	
	public void work() 
	{
		System.out.println(name + " Works for the hospital");
	}
		
}

class Doctor extends HospitalEmployee 
{
	String name;
	String speciality;
	int number;
	boolean avail;
	
	
	public Doctor() 
	{
		
		this.name = "None";
		this.speciality = "None" ;
		this.number = 000;
		this.avail = false;
	
	}
	
	public Doctor(String name, String speciality, int number, boolean avail) 
	{
		
		this.name = name;
		this.speciality = speciality;
		this.number = number;
		this.avail = avail;
		
	}

	public String getName() {
		return name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public int getNumber() {
		return number;
	}

	public boolean isAvail() {
		return avail;
	}

	
	public String toString() // will return string representation of object

	{

	return "Doctor - " + this.name + " " + this.number + " | Speciality: "+ this.speciality;
 
	}
	
	public void work() 
	{
		System.out.println(name + " Works for the hospital");
	}
}

class Surgeon extends HospitalEmployee
{
	String name;
	String speciality;
	int number;
	boolean avail;

	
	public Surgeon() 
	{
		
		this.name = "None";
		this.speciality = "None";
		this.number = 000;
		this.avail = false;
		
	}
	
	public Surgeon(String name, String speciality, int number, boolean avail) 
	{
		
		this.name = name;
		this.speciality = speciality;
		this.number = number;
		this.avail = avail;
		
	}

	public String getName() {
		return name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public int getNumber() {
		return number;
	}

	public boolean isAvail() {
		return avail;
	}

	

	public String toString() // will return string representation of object

	{

	return "Surgeon - " + this.name + " " + this.number + " | Speciality: "+ this.speciality;

	}
	public void work() 
	{
		System.out.println(name + " Works for the hospital");
	}
}
