
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public String getCategory() {
		return category;
	}
	public void setDirector(String director) {
		this.director=director;
	}
	public String getDirector() {
		return director;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	public void setCost(float cost) {
		this.cost=cost;
	}
	public float getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	public DigitalVideoDisc(String category, String title, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	public DigitalVideoDisc(String director,String category, String title, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.director = director;
	}
	public DigitalVideoDisc(String title,String category, String director,int length, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		this.director = director;
		this.length = length;
	}

	
	
	

}
