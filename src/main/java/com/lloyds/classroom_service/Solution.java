package com.lloyds.classroom_service;

import java.util.*;
import java. lang.*;
import java.io.*;

public class Solution
{
	public static int calculateDesktopProductIDs(char[] productID) {
		int answer = 0;

		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System. in);
		// input for productID
		int productID_size = in.nextInt();
		char productID[] = new char[productID_size]:
		for(int idx = 0; idx < productID_size; idx++) {
			productID [idx] = in.next(). charAt(8);
			int result = calculateDesktopProductIDs (productID) ;
			System.out.print(result);
		}

	}

}

