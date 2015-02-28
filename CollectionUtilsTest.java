import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

class IdentityMapper implements ListMapper<Integer, Integer>{
	public Integer mapper(Integer num) {
		return num;
	}
}

class Name2LengthMapper implements ListMapper<Integer, String>{
	public Integer mapper(String name) {
		return name.length();
	}
}

public class CollectionUtilsTest {
	@Test
	public void map_should_map_numbers_to_itself_on_providing_ItselfMapper(){
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		ListMapper mapper = new IdentityMapper();
		String expected = numbers.toString();
		String actual = CollectionUtils.map(numbers, mapper).toString();
		assertEquals(expected, actual);
	}

	@Test 
	public void map_should_map_names_to_there_corresponding_lengths() {
		List<String> names = new ArrayList<String>();
		names.add("pooja");
		names.add("poo");
		names.add("puju");
		ListMapper mapper = new Name2LengthMapper();
		String expected = "[5, 3, 4]";
		String actual = CollectionUtils.map(names, mapper).toString();
		assertEquals(expected, actual);	
	}
}