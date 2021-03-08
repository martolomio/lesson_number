package homework1;

public class task1 {

	public static void main(String[] args) {
		
		int a = 34;
		int a2 = 6;
		int a3 = 21;
		byte b = 4;
		float f = 2.5f;
		boolean name = true;
		
		
		
		System.out.println("Max = " + Math.max( a2, a3));
		System.out.println("Min = " + Math.min( a2, a3));
		
		
		int[] mas = new int[] {22, 5, 79, 11, 6 ,9, 4, 23, 8, 15, 32};
		
		
		int max = mas[0], min = mas[0];

      
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > max) 
                max = mas[i];

            if(mas[i] < min) 
                min = mas[i];
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);     
	}
	//first github
	
	
}
 