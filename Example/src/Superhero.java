
public class Superhero implements Comparable<Superhero>{
	
	private int id;
	
	private String name;
	
	private int age;
	
	public Superhero(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Superhero [id=" + id + ", name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Superhero superhero) {
		
		return this.id;
	}

	
	

}
