package se;

/**
 * Created by yjw on 17/1/22.
 */
public class Demo2 {

	public String variable = "class level variable";

	public static void main(String[] args) {
		ss();
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
}