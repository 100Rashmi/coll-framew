package com.rashmi.first;

//package com.payu.AnalyticsFramework;

//package com.payu.AnalyticsFramework;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by abhishek.singh on 6/21/16.
 */
public class TestHTTPServer {

    static final String initialPage = "<html>\n" +
            "<head>\n" +
            "<title>Page Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<h1>Welcome to my first web page.</h1>\n" +
            "<p> Thank you for landing here...</p>\n" +
            "\n" +
            "</body>\n" +
            "</html>";
    
    
    public static void startService(int port) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        System.out.println("Server listening on "+port);
        server.createContext("/mypage", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = initialPage;
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static void main(String[] args) throws Exception {

        //startService(8000);
        //System.out.println("You can open this link: http://localhost:8000/mypage");
    	
    	for (int i=0;i<1;i++) {
    		
    		System.out.println("Hello World "+i);
    	
    	}
    	
        
       
    	
    	String[] students = {"ram","shyam","mohan","sita"};
    	int l = students.length;
    	System.out.println(l);
    	
    	for (int i=0;i<l;i++){
    		System.out.print( students[i]  );
    		if (i < l-1){
    			System.out.println(",");	
    		}
    		
    	}
    	
    	
    	 String[] stu = new String[6];
         for (int i=0;i<6;i++){
             stu[i] = "Student:"+i;
         }
          
         //ArrayList f = new ArrayList();  
         //<> Generics : Java 1.6 onwards.
         ArrayList<String> f = new ArrayList<>();
         f.add("Ram");
         f.add("Seeta");
         f.get(0);
         f.get(1);

         System.out.println( f.get(0) );
         
         
         for (String s : students){      
             System.out.println(s);   // no need to do students[i] and all.. .
      }
      
      for (String s : f){
          System.out.println(s); 
      }
      
      
      ArrayList<Integer> g = new ArrayList<>();
      g.add(1);
      g.add(2);
      g.add(4);
      
      
      for(Integer p : g){    
    	  System.out.println( p );
          
      }
      
      abc(g);
      HashMap<String,Integer> hm = new HashMap<>();
      hm.get("dash");
      //int a;// = hm.get("dash");
      
      hm.get("dash");
      hm.put("ram",35);
      hm.put("sita",30);
      hm.put("lax",25);
      hm.put("dash",80);
      Integer a = hm.get("dash");
      System.out.println(a);
      Set<String> ks = hm.keySet();
      
      Set<Entry<String, Integer>> es = hm.entrySet();
      
      es = hm.entrySet();
      
      for ( Entry<String, Integer> e : es){
    	  e.getValue();
      }
    	
    }
    
    
    public static void abc(ArrayList<Integer> al){
        
        for (Integer p : al){
            
            System.out.println( p );
            
        }

}
    

}





//    /Users/abhishek.singh/IdeaProjects/workspaceMac/Analytics2/analyticsframework_new

//  /Users/abhishek.singh/IdeaProjects/workspaceMac/Analytics2/analyticsframework_new