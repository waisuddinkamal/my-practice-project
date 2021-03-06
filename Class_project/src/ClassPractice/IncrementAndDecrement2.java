package ClassPractice;

public class IncrementAndDecrement2 {

	public static void main(String[] args) {
		int x = 1;
		System.out.println(x);
		System.out.println(x + 1);
		System.out.println(x);
		x = x + 1;
		x += 10; // x = 12
		x *= 2;
		x = x * 5;
		System.out.println("here " + x);
		int y = 1;
		// know the current value of y -
		// add 1 to the current value
		// assign the new value to y
		System.out.println(y = y + 1);
		System.out.println("here: " + y);
		int z = 6;
		++z; // increment
		--z; // decrement
		System.out.println(z + 1);
		++z; // increment
		--z; // decrement
		System.out.println("here: " + z);
		int w = 2;
		System.out.println(w + 1);
		w = w + 1; // w = 3
		System.out.println(++w); // 4
		System.out.println("here w " + w);
		// ++w vs w + 1 vs w = w + 1
		// increment vs decrement
		// pre vs post
		System.out.println("****************************");
		int j = 10;
		System.out.println("J at start is " + j);
		System.out.println("J is pre increment: " + ++j); // pre increment
		System.out.println("J is : post increment: " + j++); // post increment
		System.out.println("J at the end is " + j);

		int t = 18; // 18 + 18 + 18
		System.out.println(t++ + --t + t); // <<<<<<<<

		int g = 5;
		++g;
		g++;

		System.out.println(g);

	}

}
