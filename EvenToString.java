public class EvenToString {
	public static void main (String[] args) {
		 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
		 percentEven(intArrray);
	}
	public static void percentEven(int [] ints) {
		//Tells you what percent of variables in the string are even
		int len = ints.length;
		int counter = 0;
		for (int i = 0; i < len; i++) {
			int temp = ints[i];
			if (temp % 2 == 0) {
				counter++;
			}
		} 
		double percent = (double)counter / len;
		double fin = percent * 100;
		System.out.println(fin);
	}

}