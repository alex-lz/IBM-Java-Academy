package demo;

public class BitOparators {
	
	public static void main(String[] args) {
		
		int a = 7; // 111
		int b = 6; // 110
		int c = 1; // 001
		
		int x = a & b; // 111 & 110 --> 110
		int y = b ^ c; // 110 ^ 001 --> 111
		int z = ~c;    // 001 --> 1111...11110
		
		System.out.println("x => " + x);
		System.out.println("y => " + y);
		System.out.println("z => " + z);
		
		int d = x << 2;  // 110 << 2 --> 11000
		int e = y >> 1;  // 111 >> 1 --> 00011
		int f = z >> 1;  // 11111...110 --> 111111.1111
		int g = z >>> 1; // 11111...110 --> 011111.1111
		
		System.out.println("d => " + d);
		System.out.println("e => " + e);
		System.out.println("f => " + f);
		System.out.println("g => " + g);
			
	}

}
