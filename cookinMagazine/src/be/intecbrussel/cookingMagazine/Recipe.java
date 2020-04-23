package be.intecbrussel.cookingMagazine;

import java.util.Comparator;
import java.util.List;

public class Recipe {
	private String name;
	private Author author;
	private List<String> ingridients;
	private String procedure;

	public Recipe(String name, Author author, List<String> ingridients, String procedure) {
		this.name = name;
		this.author = author;
		this.ingridients = ingridients;
		this.procedure = procedure;
	}

	public void addIngridient(String ingridient) {
		if (ingridient != null && !this.ingridients.contains(ingridient)) {
			this.ingridients.add(ingridient);
		}
	}

	public void removeIngridient(String ingridient) {
		if (ingridient != null && this.ingridients.contains(ingridient)) {
			this.ingridients.remove(ingridient);
		}
	}

	public String getIngridient(String name) {
		for (String ingridient : ingridients) {
			if (ingridient != null && ingridient.equals(name)) {
				return ingridient;
			}	
		}
		System.out.println("No ingridient with the name: " + name);
		return null;
	}

	public void updateIngridient(String oldIngridient, String newIngridient) {
		if (ingridients.contains(oldIngridient)) {
			if(! ingridients.contains(newIngridient)) {
			ingridients.set(ingridients.indexOf(oldIngridient), newIngridient);
			}
			else ingridients.remove(oldIngridient);
		}
		else
			System.out.println("No " + oldIngridient + " in the list of ingridients!");
	}

	public void sortIngridients() {
		ingridients.sort(Comparator.naturalOrder());
	}

	// getters & setters & toString()
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public List<String> getIngridients() {
		return ingridients;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setIngridients(List<String> ingridients) {
		this.ingridients = ingridients;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) { 
            return true; 
        } 
  
        if (!(obj instanceof Recipe)) { 
            return false; 
        } 
          
		Recipe recipe= (Recipe )obj;
		if(this.name.equals(recipe.getName())
				&&this.author.equals(recipe.author)
				&&this.ingridients.equals(recipe.getIngridients())
				&& this.procedure.equals(recipe.getProcedure())
				) return true;
		return false;
	}

	@Override
	public String toString() {
		return  name + " of the author: " + author + ",\n --->Ingridients=" + ingridients
				+ ",\n ---> procedure=" + procedure;
	}

}
