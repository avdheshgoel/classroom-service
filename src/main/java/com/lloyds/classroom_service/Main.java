package com.lloyds.classroom_service;

import java.util.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;
class Main {
	public static List<Post> fetchPosts() {
		// todo
	}
	public static List<Map<String, Integer>> formatPosts(List<Post> posts) {
		// todo
	}
	public static void main(String[] angs) {
		// Fetch posts from API
		List<Post> posts = fetchPosts();
		// Format the posts list and print the result
		List<Map<String, Integer>> formattedPosts = formatPosts(posts);
		System.out.println(formattedPosts);
	}
}







