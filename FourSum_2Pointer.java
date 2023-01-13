package two_Pointer_Programs;
import java.util.*;
public class FourSum_2Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter n value: ");
int n = sc.nextInt();
System.out.println("Enter target value: ");
int x = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter array Elements: ");
	for(int i = 0; i < n; i++)
		arr[i] = sc.nextInt();
	findFourSum_2Pointer(arr, n, x);
}
public static void findFourSum_2Pointer(int[] a, int n, int x)
{
	int l, r;
	Arrays.sort(a);
	for(int i =0 ;i < n-3; i++)
	{
		for(int  j = i+1; j < n-2; j++)
		{
			l = j+1;
			r = n-1;
			while(l<r)
			{
				if(a[i]+a[j]+a[l]+a[r] == x)
				{
					System.out.println(a[i]+" "+a[j]+" "+a[l]+" "+a[r]);
						l++;
						r--;
					}
					else if(a[i]+a[j]+a[l]+a[r] < x) 
						l++;
					else r--;
				}
			}
		}
	}

}
