package com.lloyds.classroom_service;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

static class Result {
}

public static List<String> getMessageStatus(List<Integer> timestamps, List<String> messages, int k) {
	Map<String, Integer> lastSeenTime = new HashMap<>();
	List<String> statuses = new ArrayList<>();

	for (int i = 0; i < messages.size(); i++) {
		String message = messages.get(i);
		int timestamp = timestamps.get(i);

		// Check if the message was seen before and if the timestamp difference is less than k
		if (lastSeenTime.containsKey(message) && timestamp - lastSeenTime.get(message) < k) {
			statuses.add("false");
		} else {
			statuses.add("true");
			lastSeenTime.put(message, timestamp); // Update the last seen timestamp
		}
	}

	return statuses;
}

	public class Solution {
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System. in)) ;
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System. getenv("OUTPUT_PATH"))) ;
			int timestampsCount = Integer.parseInt(bufferedReader.readLine(). trim());

			List<Integer> timestamps = IntStream. range(0, timestampsCount).mapToObj (i -> {
				try {
					return bufferedReader.readLine().replaceAll("\\s+$", "");
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}).map(String::trim)
					.map(Integer:: parseInt)
					.collect (toList());
			int messagesCount = Integer. parseInt(bufferedReader. readLine(). trim()) ;
			List<String> messages = IntStream. range (0, messagesCount).mapToObj (i -> {
				try {
					return bufferedReader.readLine();
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}).collect(toList());

			int k = Integer.parseInt(bufferedReader.readLine().trim()) ;
			List<String> result = Result.getMessageStatus(timestamps, messages, k) ;
			bufferedWriter.write( result.stream().collect (joining("\n")) + "\n");

			bufferedReader.close();
			bufferedWriter.close();
		}
	}
