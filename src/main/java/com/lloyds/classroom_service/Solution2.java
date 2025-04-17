package com.lloyds.classroom_service;

import java.io.*;
import java.net.http.*;
import java.net.URI;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

class Result {

	public static String bestInGenre(String genre) {
		String apiUrl = "https://jsonmock.hackerrank.com/api/tvseries";
		String bestShow = "";
		double highestRating = -1;
		int page = 1;

		HttpClient client = HttpClient.newHttpClient();

		try {
			while (true) {
				// Construct URL with pagination
				URI uri = URI.create(apiUrl + "?page=" + page);

				// Send HTTP GET request
				HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

				// Parse JSON response using JSONParser
				JSONParser parser = new JSONParser();
				JSONObject jsonResponse = (JSONObject) parser.parse(response.body());
				JSONArray data = (JSONArray) jsonResponse.get("data");
				long totalPages = (long) jsonResponse.get("total_pages");

				// Process each TV series in the current page
				for (Object obj : data) {
					JSONObject series = (JSONObject) obj;
					String seriesGenre = (String) series.get("genre");
					double imdbRating = ((Number) series.get("imdb_rating")).doubleValue();
					String name = (String) series.get("name");

					// Check if the genre matches
					if (seriesGenre.toLowerCase().contains(genre.toLowerCase())) {
						if (imdbRating > highestRating ||
								(imdbRating == highestRating && name.compareTo(bestShow) < 0)) {
							bestShow = name;
							highestRating = imdbRating;
						}
					}
				}

				// Break if we've processed all pages
				if (page >= totalPages) break;
				page++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bestShow;
	}
}

public class Solution2 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

			String genre = bufferedReader.readLine();
			String result = Result.bestInGenre(genre);
			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}
	}
}