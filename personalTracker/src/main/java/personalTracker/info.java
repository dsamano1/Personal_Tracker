package personalTracker;

public class info {
	String name;
	String date;
	String calories;
	String carbs;
	String proteins;
	String fats;
	
	public info(String Name, String Date, String Calories, String Carbs, String Proteins, String Fats){
		 name = Name;
		 date = Date;
		 calories = Calories;
		 carbs = Carbs;
		 proteins = Proteins;
		 fats = Fats;
	}
	
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getCalories() {
		return calories;
	}
	public String getCarbs() {
		return carbs;
	}
	public String getProteins() {
		return proteins;
	}
	public String getFats() {
		return fats;
	}
	
	public void setName(String Name) {
		name = Name;
	}
	public void setDate(String Date) {
		date = Date;
	}
	public void setCalories(String Calories) {
		calories = Calories;
	}
	public void setCarbs(String Carbs) {
		carbs = Carbs;
	}
	public void setProteins(String Proteins) {
		proteins = Proteins;
	}
	public void setFats(String Fats) {
		fats = Fats;
	}
	public String toString() {
		String x = "Name: " + name + " Date: " + date + " Calories:" + calories + " Carbs: " + carbs + " Proteins: " + proteins + " Fats: " + fats;
		return x;
	}
}


