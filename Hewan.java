public class Hewan{
	String kucing;
	String ayam;
	void info (String kucing){
		this.kucing=kucing;
	}
	String ayam(String ayam){
		this.kucing=ayam;
	return ayam;
	}
	
	public static void main(String[] args){
		Hewan obj = new Hewan();
		System.out.println("Nama kucing : "+(obj.kucing="melahirkan"));
		System.out.println("Nama ayam : "+(obj.ayam="bertelur"));
	}
}