import java.util.List;
import java.util.ArrayList;

interface ListMapper <RT,E>{
	public RT mapper(E ele);
}

	

class CollectionUtils {
	static <E,RT> List<RT> map(List<E> list, ListMapper m) {
		List result = new ArrayList();
		for (E ele : list) {
			result.add(m.mapper(ele));
		}
		return result;
	}
	// public static void main(String[] args) {
	// 	List<Integer> numbers = new ArrayList<Integer>();
	// 	numbers.add(1);
	// 	numbers.add(2);
	// 	numbers.add(3);
	// 	ListMapper mapper = new NumberMapper();

	// 	System.out.println(numbers.toString());	
	// 	System.out.println(CollectionUtils.map(numbers, mapper));
	// }
}