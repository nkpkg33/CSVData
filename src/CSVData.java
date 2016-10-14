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
	
	public double[] getRow(int rowIndex){
		
		double[] row = new double[data[0].length];
		
		for (int i = 0; i < data[0].length; i++) row[i] = data[rowIndex][i];
		
		return row;
		
	}
	
	/***
	 * Returns a double array which is a column of the data
	 * @param colIndex the index of the returned column
	 * @return the column of index colIndex
	 */
	
	public double[] getCol(int colIndex){
		
		double[] col = new double[data.length];
		
		for (int i = 0; i < data.length; i++) col[i] = data[i][colIndex];
		
		return col;
		
	}
	
	/***
	 * Returns a double array which is a column of the data
	 * @param colName the name of the returned column
	 * @return the column of name colName
	 */
	
	public double[] getCol(String colName){
		
		int index = 0;
		
		for (int i = 0; i < columnNames.length; i++){
			
			if (data[i].equals(colName)) index = i;
			
		}
		
		return getCol(index);
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple rows of data
	 * @param indices the indices of the returned rows
	 * @return the array containing rows of input indices
	 */
	
	public double[][] getRows(int[] indices){
		
		double[][] rows = new double[indices.length][data[0].length];
		
		for (int row = 0; row < indices.length; row++){
			
			for (int col = 0; col < data[0].length; col++) rows[indices[row]][col] = data[indices[row]][col];
			
		}
		
		return rows;
		
	}

	/***
	 * Returns a double[][] array which contains multiple rows of data
	 * @param startIndex the index of the first row returned
	 * @param endIndex the index of the last row returned
	 * @return the array of the range startIndex, endIndex
	 */
	
	public double[][] getRows(int startIndex, int endIndex){
		
		double[][] rows = new double[endIndex - startIndex + 1][data[0].length];
		
		for (int row = startIndex; row < endIndex; row++){
			
			for (int col = 0; col < data[0].length; col++) rows[row][col] = data[row][col];
			
		}
		
		return rows;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param indices the indices of the returned columns
	 * @return the array containing the columns of input indices
	 */
	
	public double[][] getCols(int[] indices){
		
		double[][] cols = new double[data.length][indices.length];
		
		for (int row = 0; row < data.length; row++){
			
			for (int col = 0; col < indices.length; col++) cols[row][indices[col]] = data[row][indices[col]];
			
		}
		
		return cols;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param startIndex the index of the first column returned
	 * @param endIndex the index of the last column returned
	 * @returnthe array of the range startIndex, endIndex
	 */
	
	public double[][] getCols(int startIndex, int endIndex){
		
		double[][] cols = new double[data.length][endIndex - startIndex + 1];
		
		for (int col = startIndex; col < endIndex; col++){
			
			for (int row = 0; row < data.length; row++) cols[row][col] = data[row][col];
			
		}
		
		return cols;
		
	}
	
	/***
	 * Returns a double[][] array which contains multiple columns of data
	 * @param colNames the names of the returned columns
	 * @return the array containing the columns of input names
	 */
	
	public double[][] getCols(String[] colNames){
		
		int[] indices = new int[colNames.length];
		
		for (int i = 0; i < colNames.length; i++){
			
			for (int j = 0; j < columnNames.length; j++){
				
				if (data[i].equals(colNames[i])) indices[i] = j;
				
			}
			
		}
			
		return getCols(indices);
		
	}
	
	/***
	 * Updates an entry in the data
	 * @param rowIndex the row index of the entry
	 * @param colIndex the column index of the entry
	 * @param newValue the value to update the entry
	 */
	
	public void setEntry(int rowIndex, int colIndex, double newValue){	
		
		data[rowIndex][colIndex] = newValue;
		
		
	}
	
	/***
	 * Updates a row in the data
	 * @param rowindex the index of the updated row
	 * @param newValues the values to update the row
	 */
	
	public void setRow(int rowindex, double[] newValues){	
		
		for (int i = 0; i < data[rowindex].length; i++){
			
			data[rowindex][i] = newValues[i];
			
		}
		
	}
	
	/***
	 * Updates a column in the data
	 * @param colIndex the index of the updated column
	 * @param newValues the values to update the column
	 */
	
	public void setCol(int colIndex, double[] newValues){	
		
		for (int i = 0; i < data.length; i++){
			
			data[i][colIndex] = newValues[i];
			
		}
		
		
	}
	
	/***
	 * Updates a column in the data
	 * @param colName the name of the updated column
	 * @param newValues the values to update the column
	 */
	
	public void setCol(String colName, double[] newValues){	
		
		int index = 0;
		
		for (int j = 0; j < columnNames.length; j++){
			
			if (data[j].equals(colName)) index = j;
			
		}
		
		setCol(index, newValues);
		
	}
	
	/***
	 * Returns a String array of the column names
	 * @return the column names
	 */
	
	public String[] getColumnNames(){
		
		return columnNames;
		
	}
	
	
}
