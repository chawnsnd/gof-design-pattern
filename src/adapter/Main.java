// 어댑터패턴
// double말고 float으로 어댑터하고 싶음
// 강화된 알고리즘에 맞게 어댑터의 수정
package adapter;

public class Main {

	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(88f));
	}
}
