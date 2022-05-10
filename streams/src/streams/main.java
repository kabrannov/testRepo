package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Dorota", "abc", 25));
		list.add(new Person("Kasia", "asd", 26));
		list.add(new Person("Wacek", "gdfs", 17));
		list.add(new Person("Adam", "dgsf", 42));
		list.add(new Person("Radek", "sdfsdf", 72));
		list.add(new Person("Ola", "dfs", 53));
		list.add(new Person("Bola", "hgdf", 36));
		
		
		
		System.out.println(list);
		
		
	}

}
