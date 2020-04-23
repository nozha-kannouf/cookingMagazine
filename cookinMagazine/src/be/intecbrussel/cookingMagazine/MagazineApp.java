package be.intecbrussel.cookingMagazine;

import java.util.Comparator;
import java.util.List;

public class MagazineApp{
	List<Magazine> magazines;
	public MagazineApp() {
	}
	
	public void addMagazine(Magazine magazine) {
		if (magazine != null && !this.magazines.contains(magazine)) {
			this.magazines.add(magazine);
		}
	}
	
	public void removeMagazine(Magazine magazine) {
		if (magazine != null && this.magazines.contains(magazine)) {
			this.magazines.remove(magazine);
		}
		else System.out.println("No "+magazine+" in this cooking magazine! ");
	}
	
	public Magazine getMagazine(String name) {
		for (Magazine m : magazines) {
			if (name != null && m.getName().equals(name))
				return m;
			else
				System.out.println("No magazine with the name: " + name);
		}
		return null;
	}
	
	public void updateMagazine(Magazine oldMagazine, Magazine newMagazine) {
		if (magazines.contains(oldMagazine)) {
			if(!magazines.contains(newMagazine)) {
			magazines.set(magazines.indexOf(oldMagazine), newMagazine);
			}
			else magazines.remove(oldMagazine);
		}
		else
			System.out.println("No " + oldMagazine + " in the list of magazines!");
	}
	
	public void sortMagazineByName() {
		magazines.sort(Comparator.comparing(Magazine:: getName));
	}
	
	public void sortMagazineByCategory() {
		magazines.sort(Comparator.comparing(Magazine:: getCategory));
	}
	
	public List<Magazine> getMagazines() {
		return magazines;
	}

	public void setMagazines(List<Magazine> magazines) {
		this.magazines = magazines;
	}
	
	
	
	
	
	
}
