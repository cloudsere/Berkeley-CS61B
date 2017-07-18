public class HelloNumber {
    public static void main(String[] args) {
    	int x;
        x = 0;
        int sum;
        while( x < 10){
        	sum = 0;
        	for(int i = 0; i <= x; i = i+1){
        		sum = sum + i;
        	}
        	System.out.print(sum + " ");
        	x = x + 1;
        }
    }
}