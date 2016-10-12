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
	
	/***
	 * Re
	 * @param filename
	 * @return
	 */
	
	public static double[][] convertTo2DArray(String filename){
		
		return null;
		
	}
	
	public static void saveToFile(String filename){
		
		
	}
	
	public static double[] getRow(int rowIndex){
		
		return null;
		
	}
	
	public static double[] getCol(int colIndex){
		
		return null;
		
	}
	
	public static double[] getCol(String colName){
		
		return null;
		
	}
	
	public static double[][] getRows(int[] indices){
		
		return null;
		
	}
	
	public static double[][] getRows(int startIndex, int endIndex){
		
		return null;
		
	}
	
	public static double[][] getCols(int[] indices){
		
		return null;
		
	}
	
	public static double[][] getCols(int startIndex, int endIndex){
		
		return null;
		
	}
	
	public static double[][] getCols(String[] colNames){
		
		return null;
		
	}
	
	public static void setEntry(int rowIndex, int colIndex, double newValue){	
		
		
	}
	
	public static void setRow(int rowindex, double[] newValues){	
		
		
	}
	
	public static void setCol(int colIndex, double[] newValues){	
		
		
	}
	
	public static void setCol(String colName, double[] newValues){	
		
		
	}
	
	public static String[] getColumnNames(){
		
		return null;
		
	}
	
	
}
