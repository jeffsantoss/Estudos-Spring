import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

import com.model.Person;

public class TestsJava8 {
	
	List<Person> persons;
	
	@Before
	public void init() {
		this.persons = Arrays.asList(new Person(20,"Jefferson"), new Person(20,"Alice"));
	}

	@Test
	public void testando_predicate_consumer_do_java_8() {
		
		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() > 10;
		
		Predicate<String> p3 = p1.and(p2);
		
		List<String> listStrings = Arrays.asList("*","**","***","****");
		
		// define uma função que será executada
		Consumer<String> c1 = s -> System.out.println(s);
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c2 = s -> { 
			result.add(s);
			System.out.println("adicionando " + s + " na lista result");
		};
				
		listStrings.forEach(c1.andThen(c2));
				
		
		Stream<Person> stream = persons.stream();
		
		// se eu quiser 2 consumers dentro de uma stream. basta criá-los 
		Consumer<Person> c4 = p -> System.out.println("Nome: " + p.getNome());
		Consumer<Person> c5 = p -> System.out.println("Idade " + p.getIdade());
		Consumer<Person> c6 = p -> System.out.println("Referência " + p);
		
		
		stream.forEach(c4.andThen(c5).andThen(c6));
	}

	
	@Test
	public void testando_api_stream_com_filter_predicate_java8() {
		System.out.println("filter..");
		
		// implicitamente
		Predicate<Person> p1 = p -> p.getIdade() > 15;
		Predicate<Person> p2 = p -> !p.getNome().startsWith("A");
		
		System.out.println("implicitamente..");		
		persons.stream().filter(p1.and(p2))
						.forEach(x -> System.out.println(x.getNome()));
		
		// explicitamente
		System.out.println("explicitamente..");
		persons.stream().filter(p -> p.getIdade() == 20 && !p.getNome().startsWith("J"))
						.forEach(x -> System.out.println(x.getNome()));

		
	}
	
	
}

