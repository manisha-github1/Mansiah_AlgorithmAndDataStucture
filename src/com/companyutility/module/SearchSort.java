package com.companyutility.module;

public class SearchSort {
	
	
	void merge(double nums[], int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    double Left_part_arra[] = new double[n1];
	    double Right_part_arra[] = new double[n2];

	    for (int i = 0; i < n1; ++i)
	        Left_part_arra[i] = nums[left + i];
	    for (int j = 0; j < n2; ++j)
	        Right_part_arra[j] = nums[mid + 1 + j];

	    int i = 0, j = 0;

	    int k = left;
	    while (i < n1 && j < n2) {
	        if (Left_part_arra[i] <= Right_part_arra[j]) {
	            nums[k] = Left_part_arra[i];
	            i++;
	        } else {
	            nums[k] = Right_part_arra[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        nums[k] = Left_part_arra[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        nums[k] = Right_part_arra[j];
	        j++;
	        k++;
	    }
	    
	}

	void reverseMerge(double nums[], int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    double Left_part_arra[] = new double[n1];
	    double Right_part_arra[] = new double[n2];

	    for (int i = 0; i < n1; ++i)
	        Left_part_arra[i] = nums[left + i];
	    for (int j = 0; j < n2; ++j)
	        Right_part_arra[j] = nums[mid + 1 + j];

	    int i = 0, j = 0;

	    int k = left;
	    while (i < n1 && j < n2) {
	        if (Left_part_arra[i] >= Right_part_arra[j]) {
	            nums[k] = Left_part_arra[i];
	            i++;
	        } else {
	            nums[k] = Right_part_arra[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        nums[k] = Left_part_arra[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        nums[k] = Right_part_arra[j];
	        j++;
	        k++;
	    }
	}
	public void sort(double nums[], int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;
	        sort(nums, left, mid);
	        sort(nums, mid + 1, right);
	        merge(nums, left, mid, right);    
	    }
	}
	 public  void reverseSort(double nums[], int left, int right) {
		    if (left < right) {
		        int mid = (left + right) / 2;
		        reverseSort(nums, left, mid);
		        reverseSort(nums, mid + 1, right);
		        reverseMerge(nums, left, mid, right);
		    }
	}
	
	 public void totalCountRose(boolean rise[], int size) {
		 int totalCount = 0;
		 for(int i=0; i<size ; i++) {
			 if (rise[i] == true )
			 {totalCount = totalCount + 1 ;
			 } 	
		 }
		 if (totalCount > 0) {
		 System.out.println( "Total no of companies whose stock price rose today : " + totalCount);	
		 }
		 else {
			 System.out.println( "Total no of companies whose stock price rose today : " + totalCount);	
		 }
	 }
	 
	 public void totalCountDeclined(boolean rise[], int size) {
		 int totalCount = 0;
		 for(int i=0; i<size ; i++) {
			 if (rise[i] == false )
			 { totalCount = totalCount + 1 ;
			 } 
		 }
		 if (totalCount >0) {
		 System.out.println( "Total no of companies whose stock price declined today : " + totalCount);	
		 }
		 else {System.out.println( "Total no of companies whose stock price declined today : " + totalCount);	
		 }
	 }
	 
	public void searchStockPrice(double arr[], double val ,int size) {
		int totalcnt = 0;
		for (int i=0 ; i<size ; i++) {
			if ( arr[i]== val) {
				totalcnt = totalcnt + 1 ;
			}
		}
		if (totalcnt > 0) {
			 System.out.println("Stock of value "+ val +" is present. Total count : " +totalcnt + " .");
		}
		else { System.out.println("Stock of value " + val +" is not found. Total count : " +totalcnt+ " .");}
	} 

}
