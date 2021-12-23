package gameObjects;

public class Gameobject {
	private int id;
	private String name;
	private int[][] comparison= {
			{0,1},
			{1,0}
	};	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Gameobject [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Gameobject ob) {
		return comparison[id][ob.id];
	}
	
	
}
