package hellomain;


import java.util.*;

/**
 * Created by yjw on 17/1/22.
 */
public class Demo2 {

	public String variable = "class level variable";

	public static void main(String[] args) {
		ss2();
	}

	public void lambdaExpression(){
		String variable = "Method Local Variable";
		String nonFinalVariable = "This is non final variable";
		new Thread (() -> {
			System.out.println("->" + variable);
			System.out.println("->" + this.variable);
		}).start();
	}



	public static void ss() {
		String nonFinalVariable = "Non Final Example";
		String variable = "Other Method Variable";

		new Thread(new Runnable() {
			String variable = "Runnable Class Member";

			public void run() {
				String variable = "Runnable Method Variable";
				System.out.println("->" + variable);
				System.out.println("->" + this.variable);
			}
		}).start();
	}

	public static void ss2() {

		List<String> names = Arrays.asList("a", "b", "c", "d");
		List<Integer> integers = Arrays.asList(1, 2, 3);
		List<Object> objs = Arrays.asList("e", 4, "f", 'g');

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str2.compareTo(str1);
			}
		});

		Collections.sort(objs,(Object a , Object b) -> b.toString().compareTo(a.toString()));

		System.out.println("names:" + names.toString());
		System.out.println("objs:" + objs.toString());
	}

	public static void ss3() {
		ArrayList<User> userList = new ArrayList<>();
		User user = new User();
		user.setUserName("王二");
		userList.add(user);
		userList.add(new User().setUserName("张三"));

	}

}