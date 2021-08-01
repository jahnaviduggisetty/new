package week1tasks;

public class PrimeArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=0;
		int[] a = {1,7,8,5,4,9,54};
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i<a.length;i++) 
		{
			for(int j=0;j<=a.length;j++)
			{
				

			if (a[i]%j==0) {
		count+=1;
		if(count==1)
				sb.append(a[i]+" ");
			}
		}
		}
		String s[] = sb.toString().split(" ");
		int [] b = new int[s.length];
		for(int i = 0;i<s.length;i++) {
			b[i] = Integer.parseInt(s[i]);
			System.out.print(b[i]+ " ");
		}
		}
}
