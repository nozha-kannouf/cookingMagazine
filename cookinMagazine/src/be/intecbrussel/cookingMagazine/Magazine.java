package be.intecbrussel.cookingMagazine;

public class Magazine {
	private String name;
	private String category;

	public Magazine(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
