package be.intecbrussel.cookingMagazine;

import java.util.Comparator;
import java.util.List;

public class CookingMagazine extends Magazine {
	private List<Recipe> recipes;
	public CookingMagazine(String name, String category, List<Recipe> recipes) {
		super(name, category);
		this.recipes= recipes;
	}
	
	public void addRecipe(Recipe recipe) {
		if (recipe != null && !this.recipes.contains(recipe)) {
			this.recipes.add(recipe);
		}
	}
	public void removeRecipe(Recipe recipe) {
		if (recipe != null && this.recipes.contains(recipe)) {
			this.recipes.remove(recipe);
		}
	}
	
	public Recipe getRecipe(Recipe recipe) {
		for (Recipe r : recipes) {
			if (recipe != null && r.equals(recipe))
				return r;
			else
				System.out.println("No recepe with the name: " + recipe.getName());
		}
		return null;
	}
	
	public void updateRecipe(Recipe oldRecipe, Recipe newRecipe) {
		if (recipes.contains(oldRecipe))
			oldRecipe = newRecipe;
		else
			System.out.println("No " + oldRecipe + " in the list of recipes!");
	}
	
	public void sortRecipe() {
		recipes.sort(Comparator.comparing(Recipe:: getName));
	}
	
	
	
	//getters & setters
	public List<Recipe> getRecipes() {
		return recipes;
	}
	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	@Override
	public String toString() {
		return "CookingMagazine name: "+ this.getName()+",\n category: "+ this.getCategory()+ "[recipes:" + recipes + "]";
	}
	

}
