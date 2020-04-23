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
	}
	
	public Magazine getMagazine(Magazine magazine) {
		for (Magazine r : magazines) {
			if (magazine != null && r.equals(magazine))
				return r;
			else
				System.out.println("No magazine with the name: " + magazine.getName());
		}
		return null;
	}
	
	public void updateMagazine(Magazine oldMagazine, Magazine newMagazine) {
		if (magazines.contains(oldMagazine))
			oldMagazine = newMagazine;
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
