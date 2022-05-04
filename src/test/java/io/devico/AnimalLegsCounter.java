package io.devico;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AnimalLegsCounter {
	private static final long CHICKENS_LEGS = 2;
	private static final long PIGS_LEGS = 4;
	private static final long COWS_LEGS = 4;
 public static void main(String[] args) {
	JSONParser parser = new JSONParser();
	
	
	try 
	{
		Object obj = parser.parse(new FileReader("animals.json"));
		JSONObject jsonObject = (JSONObject)obj;
		long pigs = (long)jsonObject.get("pigs");
		long chickens = (long)jsonObject.get("chickens");
		long cows = (long)jsonObject.get("cows");
		System.out.println(pigs*PIGS_LEGS+cows*COWS_LEGS+chickens*CHICKENS_LEGS + " is total number of animal legs");
	}
	catch (FileNotFoundException e )
	{e.printStackTrace();}
	catch (IOException e )
	{e.printStackTrace();}
	catch (ParseException e )
	{e.printStackTrace();}
	catch (Exception e )
	{e.printStackTrace();}
}
}
