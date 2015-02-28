import java.util.List;
import java.util.ArrayList;

// interface ListMapper<E> {
// 	E mapper(E ele);
// }

// class NumberMapper implements ListMapper{
// 	static Integer mapper(Integer num) {
// 		return num;
// 	}
// }

class CollectionUtils {
	
	static <E> List<E> map(List<E> list) {
		return list;
	}
	// static List<RT> mapper(List<E> list, ListMapper mapper) {
	// 	return null;
	// }  
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);

		System.out.println(numbers.toString());
		System.out.println(CollectionUtils.map(numbers));
		// ListMapper lm = new NumberMapper();
		// numbers.map(numbers, lm); 
	}
}