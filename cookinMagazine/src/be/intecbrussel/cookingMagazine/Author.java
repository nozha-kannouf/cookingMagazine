package be.intecbrussel.cookingMagazine;

public class Author {
	private String firstName;
	private String lastName;
	

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName +lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) { 
            return true; 
        } 
  
        if (!(obj instanceof Author)) { 
            return false; 
        } 
        Author author= (Author)obj;
		if(this.firstName.equals(author.getFirstName())
				&& this.lastName.equals(author.getLastName())) return true;
		return false;
	}
	
}
