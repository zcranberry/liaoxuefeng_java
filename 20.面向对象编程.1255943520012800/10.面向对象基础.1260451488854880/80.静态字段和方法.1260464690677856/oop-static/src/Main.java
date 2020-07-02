
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Integer [] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		Arrays.sort(ns, (i2,i1) -> {return i1.compareTo(i2);});
		System.out.println(Arrays.toString(ns));
	}
}
