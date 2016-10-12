/***
 * A class to read/write numerical csv files and allow easy access to data
 * @author nehakonakalla
 *
 */
public class CSVData {
	
	private double[][] data;
	
	private String[] columnNames;
	
	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames){
		
		return null;
		
	}
	
	/***
	 * Returns a new CSVData object for a file ignoring lines at the top
	 * It uses the first row as the column names. All other data is stored as doubles.
	 * 
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	
	public static CSVData readCSVFile(String filename, int numLinesToIgnore){
		
		return null;
		
	}
	
}
