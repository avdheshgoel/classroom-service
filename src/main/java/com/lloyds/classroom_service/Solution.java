package com.lloyds.classroom_service;

import java.util.*;
import java. lang.*;

public class Solution {

		public static int countOfElement(int[] listInputl, int[] listInput2) {
			int answer = 0;
			// Write your code here
			return answer;
		}

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int listInput1_size = in.nextInt();
			int listInput1[] = new int[listInput1_size];
			for(int idx = 0; idx < listInput1_size; idx++) {
				listInput1[idx] = in.nextInt();
			}
			// input for listInput2
			int listInput2_size = in.nextInt();
			int listInput2[] = new int [listInput2_size];
			for(int idx = 0; idx < listInput2_size; idx++) {
				listInput2[idx] = in.nextInt();
			}
			int result = countOfElement(listInput1, listInput2);
			System.out.print(result);

		}
}










		{

