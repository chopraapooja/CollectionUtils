import static org.junit.Assert.*;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

class NumberMapper implements ListMapper<Integer, Integer>{
	public Integer mapper(Integer num) {
		return num;
	}
}

public class CollectionUtilsTest {
	@Test
	public void test_map_should_map_givenList_into_resultsant_list_using_mapper_provided_in_ListMapper() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		ListMapper mapper = new NumberMapper();
		String expected = numbers.toString();
		String actual = CollectionUtils.map(numbers, mapper).toString();
		assertEquals(expected, actual);
	}
}