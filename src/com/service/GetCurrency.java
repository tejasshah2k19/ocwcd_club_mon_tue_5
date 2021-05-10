package com.service;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCurrency {

	public static float getUsd() {
		String myUrl = "https://free.currconv.com/api/v7/convert?q=USD_INR&compact=ultra&apiKey=2b4924c53e04c8f5b5b2";
		try {
			// Create a neat value object to hold the URL
			URL url = new URL(myUrl); //

			// Open a connection(?) on the URL(??) and cast the response(???)
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Now it's "open", we can set the request method, headers etc.
			connection.setRequestProperty("accept", "application/json");
			connection.connect();

			InputStream is = connection.getInputStream();
			int b = 0;
			String rate = "";
			while ((b = is.read()) != -1) {
				// System.out.print((char)b);
				rate = rate + (char) b;
			}
			System.out.println("response ==> " + rate);
			String spR[] = rate.split(":");
			rate = spR[1];
			rate = rate.substring(0, rate.length() - 1);
			System.out.println(rate);
			return Float.parseFloat(rate);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}
}
