import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AvailityBackendApplication {

	public static void main(String[] args) throws IOException {

		String fileName = "src/main/java/givenFile.csv";

		//Initialize a list and a file reader
		List<CSVFileFields> myList = getCsvFileFields(fileName);

		// Print the name from the list....
		for(CSVFileFields myObject : myList) {
			try {
				File myObj = new File("src/main/java/" + myObject.getInsuranceCompany().toString() + ".csv");
				if (myObj.createNewFile()) {
					System.out.println("File created: " + myObj.getName());
					FileWriter myWriter = new FileWriter("src/main/java/" + myObject.getInsuranceCompany().toString() + ".csv", true);
					myWriter.write(myObject.toString() + "\n");
					System.out.println("Successfully wrote to the file.");
					myWriter.close();
				} else {
					System.out.println("File already exists.");
					FileWriter myWriter = new FileWriter("src/main/java/" + myObject.getInsuranceCompany().toString()+ ".csv", true);
					myWriter.write(myObject.toString() + "\n");
					myWriter.close();
				}
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}

		}
	}

	private static List<CSVFileFields> getCsvFileFields(String fileName) throws FileNotFoundException {
		List myList = new CsvToBeanBuilder(new FileReader(fileName))
				.withType(CSVFileFields.class)
				.build()
				.parse();
		//createList(myList);
		return myList;
	}
}
