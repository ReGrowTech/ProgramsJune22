package demo;

public class EvenNumber {

	public static void main(String[] args) {
		int ar[] = {11,10,40,50,1,6,3,2,9,200,100};

		int max=ar[0];
		int min=ar[0];
		int count = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2 == 0)
			{
				System.out.println("Even Number are: " + ar[i]);
				count++;
			if(count==1)
			{
				min=ar[i];
				max=ar[i];
			}
			if(ar[i]>max)
			{
				max=ar[i];
			}

			if(ar[i]<max)
			{
				min=ar[i];
			}
		}
	}
	System.out.println("The smallest Even Number in the array: " + min);
	System.out.println("The smallest Even Number in the array: " + max);
}
}
	
	

