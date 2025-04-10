package com.lloyds.classroom_service;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

public static String bestInGenre(String genre) {

}

public class Solution2 {
	public static void main (String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System. in)) ;
		BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter (System. getenv ("OUTPUT_PATH"))) ;
		String genre = bufferedReader.readLine();
		String result = Result.bestInGenre(genre) ;
		bufferedWriter.write(result);
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close() ;
	}




}
