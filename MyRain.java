package rain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyRain {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr = Arrays.asList(4,5,3,6,2, 6, 4);
//		arr = Arrays.asList(4,6,3,4,6,4);
		
		int max_pos = 0; 
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > arr.get(max_pos)) {
				max_pos = i; 
			}						
		}
				
		int before_max = 0;  // 
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > arr.get(before_max) && i != max_pos) { 
				before_max = i; 
			}						
		}
		
		int water_qnt = 0;
		if ( Math.abs(max_pos - before_max) != 1){
			int min_height = Math.min(arr.get(before_max), arr.get(max_pos));			
			for (int i = 1 + (before_max < max_pos ? before_max : max_pos); 
			 	 i < (before_max > max_pos ? before_max : max_pos); i++ ) {
				 	water_qnt += min_height - arr.get(i);
			}			
			
		}
				
		System.out.println(water_qnt);
							
		System.out.println(before_max + " " + arr.get(before_max));
		System.out.println(max_pos + " " + + arr.get(max_pos) );		
	}
	
}
