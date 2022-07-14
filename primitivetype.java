package primitivetype;

public class primitivetype {
	public static void main(String[] args) {
		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		System.out.println("Min byte value " + minByteValue);
		System.out.println("Max byte value " + maxByteValue);
		byte x = 127;
		System.out.println(x);
		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		System.out.println("Min short: " + minShortValue);
		System.out.println("Max short: " + Short.MAX_VALUE);
		short y = 32767;
		System.out.println("Min int: " + Integer.MIN_VALUE);
		System.out.println("Max int: " + Integer.MAX_VALUE);
		System.out.println("Min long: " + Long.MIN_VALUE);
		System.out.println("Max long: " + Long.MAX_VALUE);
	}

}
