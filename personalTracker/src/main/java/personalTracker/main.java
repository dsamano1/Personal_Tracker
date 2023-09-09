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

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <String> dList = new ArrayList<String>();
		String path = "data.csv";
		exportData(path);
		Scanner scan = new Scanner(new FileReader(path));
		scan.useDelimiter(",");
		while (scan.hasNextLine()) {
			dList.add(scan.nextLine());
		}
		scan.close();
		System.out.println(dList.get(0));
		String x = dList.get(0);
		System.out.println(x);
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
	        data.add(new String[] { "Name", "Date", "Calories","Carbs","Protein", "Fats"});
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
