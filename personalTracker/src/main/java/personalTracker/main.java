package personalTracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVWriter;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <String> list = new ArrayList<String>();
		String path = "data.csv";
		exportData(path);
		Scanner scan = new Scanner(new FileReader(path));
		scan.useDelimiter(",");
		while (scan.hasNextLine()) {
			list.add(scan.nextLine());
		}
		
		scan.close();
		System.out.println(list.get(3));
		System.out.println("testing this");
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

			// adding header to csv
			String[] header = { "Name", "Class", "Marks" };
			writer.writeNext(header);

			// add data to csv
			String[] data1 = { "Damian", "1", "99" };
			writer.writeNext(data1);
			String[] data2 = { "Marlen", "1", "100" };
			writer.writeNext(data2);
			String[] data3 = { "Jason", "1", "101"};
			writer.writeNext(data3);
			// closing writer connection
			writer.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


}
