import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int arr[]=new int[n];
		int result=marsexploration(arr,n);
		System.out.println(result);
	}

public static int marsexploration(int arr[],int n)
{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!='s' && arr[i]!='o')
				{
			count++;
				}
		}
		return count;
		
	}

}
