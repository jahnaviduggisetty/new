package week1tasks;

public class PalArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {101,202,202,313,151};
		numPal(a);
		
	}
	
	
	public static void numPal(int a[]) {
		for(int i =0;i<a.length;i++) {
			if(isPal(a[i])){
				System.out.print(a[i]+" ");
				
			}
		}
	}
	
	
	public static Boolean isPal(int n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder(s);
		if (!sb.toString().equals(sb.reverse().toString())) { 
			return false;
		}
		else {
			return true;
		}
		
	}
	}

