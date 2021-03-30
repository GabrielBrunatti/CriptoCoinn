package br.com.criptocoin;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class coinGecko {
	
	String apiretorno;	
	String result;

	public String ulala() throws IOException {
		
		URL url = new URL("https://api.coingecko.com/api/v3/coins/bitcoin/market_chart/range?vs_currency=usd&from=1615774198&to=1616108998");
		InputStream is = url.openStream();
		try {
		  /* Now read the retrieved document from the stream. */

			Scanner s = new Scanner(is).useDelimiter("\\A");
			result = s.hasNext() ? s.next() : "";
			
		  System.out.print(result);
		} finally {
		  is.close();
		}
		
		
		return result ;
	}
	
public String ulala2() throws IOException {
		
		URL url = new URL("https://api.coingecko.com/api/v3/coins/bitcoin");
		InputStream is = url.openStream();
		try {
		  /* Now read the retrieved document from the stream. */

			Scanner s = new Scanner(is).useDelimiter("\\A");
			result = s.hasNext() ? s.next() : "";
			
		  System.out.print(result);
		} finally {
		  is.close();
		}
		
		
		return result ;
	}
	
}
