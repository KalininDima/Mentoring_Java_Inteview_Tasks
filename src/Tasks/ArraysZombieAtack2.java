package Tasks;

import java.util.Arrays;

public class ArraysZombieAtack2 {
public static void main(String[] args) {
	
	/*
	 An array inhabitants represents cities and their respective populations. For example, the following
	  arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.

Write a program to loop though each city population and make it lose half of its population if it
 is adjacent(right or left) to a city with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.

Hint: 
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 0]

Code:
System.out.println(Arrays.toString(inhabitants)));
	 */
	
	//int [] inhabitants = new int [] {6,0,4,3,2,7,0};
	//int [] inhabitants = new int [] {0,20,0,20,20,10,0,10};
	//int [] inhabitants = new int [] {10,0,20,4,0,1,6,0};
	int [] inhabitants = new int [] {4,5,3,0,3,0,0,3};
	int Day = 0;
	int count =0;
	int i = 0;
while(inhabitants.length != count) {
		
	System.out.println("Day "+Day+" "+Arrays.toString(inhabitants));
	
	count=0;
	i=0;
	Day++;
	
	for(i=0;i<inhabitants.length;){
		
		if(inhabitants[i]==0){	
		
		if(inhabitants[0]==i&&i==0){
			inhabitants[i+1]/=2;
			
		}else if(i==inhabitants.length-1&&inhabitants[i-2]!=0){
			inhabitants[i-1]/=2;
			
		}else if(i>0&&i<=inhabitants.length-2&&inhabitants[i-1]==1&&inhabitants[i+1]==1){
			  inhabitants[i-1]/=2;
			  inhabitants[i+1]/=2;
			  i++;
			  
		}else if(i>1&&inhabitants[i-2]==0&&i<inhabitants.length-1){
			inhabitants[i+1]/=2;
			
		}else if(i>1&&inhabitants[i-2]>0&&i<inhabitants.length-1){
			  inhabitants[i-1]/=2;
			  inhabitants[i+1]/=2;
			  
		} else if(i>0&&inhabitants[i-1]>=0&&i<inhabitants.length-1){
			  inhabitants[i-1]/=2;
			  inhabitants[i+1]/=2;
		}

		}
		i++;
	}
	
	for (int j = 0;j<inhabitants.length;j++) {
		if (inhabitants[j]==0)
			count++;
	}
	
	if (count == inhabitants.length) {
		System.out.println("Day "+Day+" "+Arrays.toString(inhabitants)+"\n"+
				"---- EXTINCT ----");
	}
	
 }

}
} 


