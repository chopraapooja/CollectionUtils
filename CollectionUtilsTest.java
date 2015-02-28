import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import CollectionUtils;

class NamesMapper implements ListMapper{
	static <String> mapper(String name) {
		return name;
	} 
}

public class CollectionUtilsTest {
	@Test
	public void test_map_should_map_givenList_into_resultsant_list_using_mapper_provided_in_ListMapper() {
		List<String> names = new ArrayList<String>();
		names.add("motu Sharma");
		names.add("golu Singh");
		names.add("molu");
		List<String> namesCopy = CollectionUtils.map(names, ListMapper);
		
		for (String n : namesCopy) {
			assertEquals(n = "motu Sharma");
		}
	}
}