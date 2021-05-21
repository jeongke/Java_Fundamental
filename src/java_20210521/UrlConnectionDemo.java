package java_20210521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=087&aid=0000844817");
		URLConnection urlCon = url.openConnection();
		
		String cacheControl = urlCon.getHeaderField("cache-control");
		String contentType = urlCon.getHeaderField("content-Type");
		String date = urlCon.getHeaderField("date");
		
		System.out.println("cache-control : " + cacheControl);
		System.out.println("content-type : " + contentType);
		System.out.println("date : " + date);
		
		InputStream in = urlCon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in,"euc-kr");//페이지 소스 보기 : <meta charset="euc-kr">
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine()) !=null) {
			System.out.println(readLine);
		}
		
	
	}
}
