package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
		int num=9;
		int firstnum=0;
		int secondnum=1;
		int nextnum=0;
	    System.out.println(firstnum);
	    System.out.println(secondnum);
		for(int i=1;i<=num;i++)
		{
			nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			System.out.println(nextnum);
		}
	}
}
