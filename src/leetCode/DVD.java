package leetCode;

public class DVD {
	
	DVD[] dvd = new DVD[20];
	public String name;
	public int releaseYear;
	public String director;
	
	public DVD(String name, int releaseYear, String director) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}
	
	public String toString() {
		
		return this.name + ", Directed by "+ this.director+ ", Release year " + this.releaseYear;
	}
	
	public static void main(String[] args) {
		
		DVD dvd = new DVD("Puspa", 2014, "Rajamauli");
		dvd.director = "sampat";
		
		System.out.println(dvd);
	}
	
	

}
