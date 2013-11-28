/*
Notice:
This program is written in Java programming language.
I could not get to fulfill the programming language requirement since I have no knowledge on the given languages in the assignment.
Apart from that, all the program's working concept requirements are met.
*/

import java.util.Scanner;

public class Mission1 {

	static Scanner a = new Scanner(System.in);
	static int countLine1 = 0;
	static int countLine2 = 0;
	static int printAns = 0;
	
	public static void main(String[] args){
		int amountLine1 = Integer.parseInt(a.nextLine());
		if(amountLine1>=1 && amountLine1<=100){
			int[] array = new int[amountLine1];
			L1(amountLine1, array);
		}
	}

	public static void L1(int amt1, int[] arr){
		if(amt1>countLine1){
			String Line1 = a.nextLine();
			if(Line1.length()!=0 && Integer.parseInt(Line1)<=100){
				int amountLine2 = Integer.parseInt(Line1);	
				String Line2 = a.nextLine();
				int res = 0;
				arr[countLine1] = L2(Line2, amountLine2, res);
				countLine2 = 0;
				countLine1++;
				L1(amt1, arr);
			}
		}else{
			print(amt1, arr);
		}
	}
	
	public static int L2(String line, int amt2, int result){
		if(countLine2<amt2 && amt2-countLine2>1){
			int index = line.indexOf(" ");
			int x = Integer.parseInt(line.substring(0, index));		
			if(x>=0){
				result += x*x;
			}	
			countLine2++;
			return L2(line.substring(index+1), amt2, result);
		}else if(countLine2<amt2 && amt2-countLine2==1){			
			int x = Integer.parseInt(line);
			if(x>=0){
				result += x*x;
			}	
			countLine2++;
			return result;
		}
		return 0;
	}
	
	public static void print(int numberOfAns, int[] ans){
		if(numberOfAns>printAns){
			System.out.println(ans[printAns]);
			printAns++;
			print(numberOfAns, ans);
		}
	}
}
