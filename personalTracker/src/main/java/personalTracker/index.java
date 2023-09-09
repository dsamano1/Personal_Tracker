package personalTracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class index {
	public static String path = "data.csv";
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <String> dList = new ArrayList<String>();
		ArrayList <info> iList = new ArrayList<info>();
		exportData(path);
		iList = getInfoList(getList(dList));
		System.out.println(iList.get(0).getDate());
		
	}
	
	public static ArrayList<String> getList(ArrayList<String> list) throws FileNotFoundException{
		Scanner scan = new Scanner(new FileReader(path));
		scan.useDelimiter(",");
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		scan.close();
		return list;
	}
	
	public static ArrayList<info> getInfoList(ArrayList<String> list) {
		ArrayList<info> iList = new ArrayList<info>();
		for (int i = 1; i < list.size(); i++) {
			String iLine = list.get(i);
			String name = iLine.substring(0, iLine.indexOf(","));
			iLine = iLine.replace(name + ",", "");
			String date = iLine.substring(0, iLine.indexOf(","));
			iLine = iLine.replace(date + ",", "");
			String cal = iLine.substring(0, iLine.indexOf(","));
			iLine = iLine.replace(cal + ",", "");
			String carb = iLine.substring(0, iLine.indexOf(","));
			iLine = iLine.replace(carb + ",", "");
			String protein = iLine.substring(0, iLine.indexOf(","));
			iLine = iLine.replace(protein, "");
			String fat = iLine.substring(1, iLine.length());
			info nInfo = new info(name,date,cal,carb,protein,fat);
			iList.add(nInfo);
		}
		return iList;
	}
	
	public static void exportData(String filePath)
	{
		// first create file object for file placed at location
		// specified by filepath
		File file = new File(filePath);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			ArrayList<String[]> data = new ArrayList<String[]>();
	        data.add(new String[] { "Name", "Date", "Calories","Carbs(g)","Protein(g)", "Fats(g)"});
	        data.add(new String[] {"Damian", "9/8/23", "2300", "20", "80", "34"});
	        data.add(new String[] {"Marlen",  "9/8/23", "1800", "10", "60", "22"});
	        writer.writeAll(data);
			// closing writer connection
			writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


}
