
public class Cereal {
	private String type;
	private int calories;
	private int protein;
	private int fat;
	private int sodium;
	private int fiber;
	private double carbs;
	private int sugar;
	private int pottassium;
	private int vitamins;
	private int shelf;
	private double weight;
	private double cups;
	private double rating;

	public Cereal(String type, int calories, int protein, int fat, int sodium, int fiber, double carbs, int sugar,
			int pottassium, int vitamins, int shelf, double weight, double cups, double rating) {
		super();
		this.type = type;
		this.calories = calories;
		this.protein = protein;
		this.fat = fat;
		this.sodium = sodium;
		this.fiber = fiber;
		this.carbs = carbs;
		this.sugar = sugar;
		this.pottassium = pottassium;
		this.vitamins = vitamins;
		this.shelf = shelf;
		this.weight = weight;
		this.cups = cups;
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getSodium() {
		return sodium;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public int getFiber() {
		return fiber;
	}

	public void setFiber(int fiber) {
		this.fiber = fiber;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getPottassium() {
		return pottassium;
	}

	public void setPottassium(int pottassium) {
		this.pottassium = pottassium;
	}

	public int getVitamins() {
		return vitamins;
	}

	public void setVitamins(int vitamins) {
		this.vitamins = vitamins;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCups() {
		return cups;
	}

	public void setCups(double cups) {
		this.cups = cups;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
