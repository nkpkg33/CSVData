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
	 * Returns a double array converted from the csv file
	 * @param filename the file to convert
	 * @return the converted double array
	 */
	
	public static double[][] convertTo2DArray(String filename){
		
		return null;
		
	}
	
	/***
	 * Saves changes to the CSVData
	 * @param filename the file with the new changes
	 */
	
	public static void saveToFile(String filename){
		
		
	}
	
	/***
	 * Returns a double array which is a row of the data
	 * @param rowIndex the index of the returned row 
	 * @return the row of index rowIndex
	 */
	
	public static double[] getRow(int rowIndex){
		
		return null;
		
	}
	
	/***
	 * Returns a double array which is a column of the data
	 * @param colIndex the index of the returned column
	 * @return the column of index colIndex
	 */
	
	public static double[] getCol(int colIndex){
		
		return null;
		
	}
	
	/***
	 * Returns a double array which is a column of the data
	 * @param colName the name of the returned column
	 * @return the column of name colName
	 */
	
	public static double[] getCol(String colName){
		
		return null;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple rows of data
	 * @param indices the indices of the returned rows
	 * @return the array containing rows of input indices
	 */
	
	public static double[][] getRows(int[] indices){
		
		return null;
		
	}

	/***
	 * Returns a double[][] array which contains multiple rows of data
	 * @param startIndex the index of the first row returned
	 * @param endIndex the index of the last row returned
	 * @return the array of the range startIndex, endIndex
	 */
	
	public static double[][] getRows(int startIndex, int endIndex){
		
		return null;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param indices the indices of the returned columns
	 * @return the array containing the columns of input indices
	 */
	
	public static double[][] getCols(int[] indices){
		
		return null;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param startIndex the index of the first column returned
	 * @param endIndex the index of the last column returned
	 * @returnthe array of the range startIndex, endIndex
	 */
	
	public static double[][] getCols(int startIndex, int endIndex){
		
		return null;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param colNames the names of the returned columns
	 * @return the array containing the columns of input names
	 */
	
	public static double[][] getCols(String[] colNames){
		
		return null;
		
	}
	
	/***
	 * Updates an entry in the data
	 * @param rowIndex the row index of the entry
	 * @param colIndex the column index of the entry
	 * @param newValue the value to update the entry
	 */
	
	public static void setEntry(int rowIndex, int colIndex, double newValue){	
		
		
	}
	
	/***
	 * Updates a row in the data
	 * @param rowindex the index of the updated row
	 * @param newValues the values to update the row
	 */
	
	public static void setRow(int rowindex, double[] newValues){	
		
		
	}
	
	/***
	 * Updates a column in the data
	 * @param colIndex the index of the updated column
	 * @param newValues the values to update the column
	 */
	
	public static void setCol(int colIndex, double[] newValues){	
		
		
	}
	
	/***
	 * Updates a column in the data
	 * @param colName the name of the updated column
	 * @param newValues the values to update the column
	 */
	
	public static void setCol(String colName, double[] newValues){	
		
		
	}
	
	/***
	 * Returns a String array of the column names
	 * @return the column names
	 */
	
	public static String[] getColumnNames(){
		
		return null;
		
	}
	
	
}
