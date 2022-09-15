import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperheroRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Superhero> sp = new ArrayList<Superhero>();
		sp.add(new Superhero(1, "aaa", 26));
		sp.add(new Superhero(2, "bbb", 28));
		sp.add(new Superhero(3, "ccc", 22));
		sp.add(new Superhero(4, "ddd", 29));
		
		Collections.sort(sp);
		
		sp.forEach(s-> System.out.println(s));

	}

}
