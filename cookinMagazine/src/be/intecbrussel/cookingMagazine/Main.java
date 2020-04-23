package be.intecbrussel.cookingMagazine;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Author author1= new Author("nozha", "kannouf");
		Author author2= new Author("Andy", "Baraghani");
		List<String> ingridientsOfMisoTurnips = new ArrayList<>(List.of("1 pound small turnips",
																		"2 tablespoons white miso",
																		"2 tablespoons unsalted butter",
																		"1 teaspoon sugar",
																		"kosher",
																		"salt",
																		"peper",
																		"2 tablespoons fresh lemon juice"
																	));
		
		List<String> ingridientsOfCharredLeeks = new ArrayList<>(List.of("4 medium leeks",
																		 "2 Tbsp. sherry vinegar",
																		 "2 tsp. honey",
																		 "2 Tbsp. extra-virgin olive oil"
																		));
		
		Recipe misoTurnips= new Recipe("Miso-Glazed Turnips", author2, ingridientsOfMisoTurnips, " procedure of the recipe");
		Recipe  charredLeeks= new Recipe("CharredLeeks", author1, ingridientsOfCharredLeeks, " procedure of the recipe");
		List<Recipe> recipes=  new ArrayList<>();
		//recipes.add(misoTurnips);
		recipes.add(charredLeeks);
		
		CookingMagazine  cookingMagazine= new CookingMagazine("Recipes with less than 5 ingridients", "Category S", recipes);
		
		//Cheking if the operations of Recipe class are OK
		checkRecipeOperations(misoTurnips);
		//Cheking if the operations of CookingMagazine class are OK
		checkCokingMagazineOperations(cookingMagazine);
		
	}
	public static void checkRecipeOperations(Recipe recipe) {
		System.out.println("***method addIngridient in the class Recipe***");
		recipe.addIngridient("Test add ingridient");
		//recipe.getIngridients().stream().forEach(System.out::println);

		System.out.println("***method removeIngridient in the class Recipe***");
		recipe.removeIngridient("Test add ingridient");
		//recipe.getIngridients().stream().forEach(System.out::println);

		System.out.println("***method getIngridient in the class Recipe***");
		recipe.getIngridient("4 medium leeks");
		System.out.println("Ingridient returned by getIngridient: "+ recipe.getIngridient("salt"));
		//recipe.getIngridients().stream().forEach(System.out::println);
		
		System.out.println("***method updateIngridient in the class Recipe***");
		recipe.updateIngridient("salt", "sugar");
		//recipe.getIngridients().stream().forEach(System.out::println);
		
		System.out.println("***method sortIngridient in the class Recipe***");
		recipe.sortIngridients();
		recipe.getIngridients().stream().forEach(System.out::println);
	}
	public static void checkCokingMagazineOperations(CookingMagazine cookingMagazine) {
		System.out.println(cookingMagazine);
		Author author2= new Author("Andy", "Baraghani");
		List<String> ingridientsOfMisoTurnips = new ArrayList<>(List.of("1 pound small turnips",
				"2 tablespoons white miso",
				"2 tablespoons unsalted butter",
				"1 teaspoon sugar",
				"kosher",
				"salt",
				"peper",
				"2 tablespoons fresh lemon juice"
			));
		Recipe misoTurnips= new Recipe("AMiso-Glazed Turnips", author2, ingridientsOfMisoTurnips, " procedure of the recipe");
		System.out.println("***method addRecipe in the class CokingMagazine***");
		cookingMagazine.addRecipe(misoTurnips);
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);

		System.out.println("***method removeRecipe in the class CokingMagazine***");
		//cookingMagazine.removeRecipe(misoTurnips);
		//cookingMagazine.removeRecipe(misoTurnips);
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
		
		System.out.println("***method getRecipe in the class CokingMagazine***");
		//System.out.println("Recipe returned by getRecipe() is: "+ cookingMagazine.getRecipe("CharredLeeks"));
		//System.out.println("Recipe returned by getRecipe() is: "+ cookingMagazine.getRecipe("Miso-Glazed Turnips"));
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
		
		System.out.println("***method updateRecipe in the class CokingMagazine***");
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
		//System.out.println("After update");
		//cookingMagazine.updateRecipe(misoTurnips,cookingMagazine.getRecipe("CharredLeeks"));
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
		
		System.out.println("***method sortCokingMagazine in the class CokingMagazine***");
		
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
		//System.out.println("After sort ");
		//cookingMagazine.sortRecipes();
		//cookingMagazine.getRecipes().stream().forEach(System.out::println);
	}
}
