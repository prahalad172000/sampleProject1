package lab2;

public class Sort1 {
	
	public static void bubbleSort(int a[],int n)
	{
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		bubbleSort(a,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {64,34,25,11,22,10,90};
		bubbleSort(a,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
