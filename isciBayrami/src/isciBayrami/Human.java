package isciBayrami;

public class Human {

	public Human(int hopeLevel, int unscrupulousnessLevel) {
		this.hopeLevel = hopeLevel;
		this.unscrupulousnessLevel = unscrupulousnessLevel;
	}
	private int hopeLevel;
	private int unscrupulousnessLevel;

	public int getHopeLevel() {
		return hopeLevel;
	}
	public void setHopeLevel(int hopeLevel) {
		this.hopeLevel = hopeLevel;
	}
	public int getUnscrupulousnessLevel() {
		return unscrupulousnessLevel;
	}
	public void setUnscrupulousnessLevel(int unscrupulousnessLevel) {
		this.unscrupulousnessLevel = unscrupulousnessLevel;
	}
}