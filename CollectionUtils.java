import java.util.List;
import java.util.ArrayList;

interface ListMapper <RT,E>{
	public RT mapper(E ele);
}

class NumberMapper implements ListMapper<Integer, Integer>{
	public Integer mapper(Integer num) {
		return num;
	}
}

class CollectionUtils {
	
	static <E> List<E> map(List<E> list, ListMapper m) {
		return list;
	}
	// static List<RT> mapper(List<E> list, ListMapper mapper) {
	// 	return null;
	// }  
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		ListMapper mapper = new NumberMapper();

		System.out.println(numbers.toString());	
		System.out.println(CollectionUtils.map(numbers, mapper));
	}
}