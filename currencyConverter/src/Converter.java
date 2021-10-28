import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Converter {

	public static void main(String[] args) throws IOException {
		
//		make you choose the currency with number
		HashMap<Integer, String> currencyCode = new HashMap<Integer, String>();

		
		currencyCode.put(1, "USD");
		currencyCode.put(2, "CAD");
		currencyCode.put(3, "EUR");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Currency Converter");
		
		System.out.println("Convert FROM");
		System.out.println("1: USD\t2:CAD\t3: EUR");
		String from = currencyCode.get(scanner.nextInt());
		
		System.out.println("Convert TO");
		System.out.println("1: USD\t2: CAD\t3: EUR");
		String to = currencyCode.get(scanner.nextInt());
		
		System.out.println("Amount");
		double amount = scanner.nextFloat();
		
		sendRequest(from, to, amount);
	}
	
	public static void sendRequest(String from, String to, double amount) throws IOException {
		
		URL url = new URL("https://free.currconv.com/api/v7/convert?q=" + from + "_" + to + "&compact=ultra&apiKey=b453fee223d5a7dbf708");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		int responseOriginal = connection.getResponseCode(); 
		
		if (responseOriginal == HttpURLConnection.HTTP_OK) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer response = new StringBuffer();
			
			String input;
			while((input = reader.readLine()) != null) {
				response.append(input);
			} reader.close();
			
			JSONObject object = new JSONObject(response.toString());
			System.out.println(object);
//			JSONObject o = object.getJSONObject(from + "_" + to);
			
			JSONArray rate = object.getJSONArray("USD_CAD");
			for(int i = 0; i < rate.length(); i++) {
				System.out.println(rate.getString(i));
			}
//			System.out.println(rate);
//			System.out.println(amount + from + "=" + amount / rate + to);
			
			System.out.println(response);
			
		} else {
			System.out.println("Something went wrong!");
		}
	}
}