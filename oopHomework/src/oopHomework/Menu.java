package oopHomework;

public class Menu {
	// constructor
	public Menu() {
		System.out.println("Bu üst menü için bir constructor blokudur.");
	}
	
	public Menu (int id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name; 

}
