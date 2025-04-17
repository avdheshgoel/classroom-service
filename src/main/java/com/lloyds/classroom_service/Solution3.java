package com.lloyds.classroom_service;

import java.util.*;
import java.io.*;
import java.net.*;
import com.google.gson.*;
class Main {
	public static void main(String[] args) {
		System.setProperty("http.agent", "Chrome");
		try {
			URI uri = new URI("https://coderbyte.com/api/challenges/json/age-counting");
			URL url = uri.toURL();
			try {
				URLConnection connection = url.openConnection();
				InputStream inputStream = connection.getInputStream();

				System.out.println(inputStream);
			} catch (I0Exception ioEx) {
				System.out.println(ioEx);

			}
		} catch (MalformedURLException malEx) {
			System.out.println(malEx);
		} catch (URISyntaxException e) {
			System.out.println(e.getMessage());
		}
	}
}


