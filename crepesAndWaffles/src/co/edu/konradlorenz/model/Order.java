package co.edu.konradlorenz.model;

public class Order {

    // - // - // - // Attributes // - // - // - //
    private String plateName;
	private String drinkName;
    private String annotation;
	private int price;


    // - // - // - // Methods // - // - // - //

    //   «» Constructor no parameters «»   //
    public Order() {

    }//close constructor no parameters

    //   «» Constructor with parameters «»   //
    public Order(String plateName, String drinkName, String annotation, int price) {
        this.plateName = plateName;
        this.drinkName = drinkName;
        this.annotation = annotation;
        this.price = price;
    }//close constructor with parameters

    //   «» Getters & Setters «»   //
    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    //close getters & setters

	@Override
	public String toString() {
		return "Order [plateName=" + plateName + ", drinkName=" + drinkName + ", annotation=" + annotation + ", price="
				+ price + "]";
	}//close toString
	

}//close class