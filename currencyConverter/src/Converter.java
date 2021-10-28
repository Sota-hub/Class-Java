import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.json.JSONObject;

public class Converter {

	public static void main(String[] args) throws IOException {
		
//		Make you choose the currency by number
		HashMap<Integer, String> currencyCode = new HashMap<Integer, String>();

//		Create the list
		currencyCode.put(1, "USD");
		currencyCode.put(2, "CAD");
		currencyCode.put(3, "EUR");
		currencyCode.put(4, "JPY");
		
//		Get user inputs
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Currency Converter\n");
		
//		Choose which country's currency convert from
		System.out.println("Convert FROM");
		System.out.println("1: USD\t2:CAD\t3: EUR\t4: JPY");
		String from = currencyCode.get(scanner.nextInt());
		
//		Choose which country's currency convert to
		System.out.println("Convert TO");
		System.out.println("1: USD\t2: CAD\t3: EUR\t4: JPY");
		String to = currencyCode.get(scanner.nextInt());
		
//		Choose how much money you convert
		System.out.println("Amount");
		double amount = scanner.nextFloat();
		
//		Execute sendRequest
		sendRequest(from, to, amount);
	}
	
	public static void sendRequest(String from, String to, double amount) throws IOException {
		
//		
		URL url = new URL("https://free.currconv.com/api/v7/convert?q=" + from + "_" + to + "&compact=ultra&apiKey=b453fee223d5a7dbf708");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int responseOriginal = connection.getResponseCode(); 
		
		if (responseOriginal == HttpURLConnection.HTTP_OK) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer response = new StringBuffer();
			
			String input;
			while((input = reader.readLine()) != null) {
				response.append(input);
			} reader.close();
			
			JSONObject object = new JSONObject(response.toString());
			Double rate = object.getDouble(from + "_" + to);
			
			System.out.println(amount + from + " = " + amount * rate + to);
			
		} else {
			System.out.println("Something went wrong!");
		}
	}
}