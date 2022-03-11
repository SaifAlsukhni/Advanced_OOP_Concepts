public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    /* TODO
    This constructor should take the contents of a CSV file and initialize the member variables of the Database class.
    */
    public Database(String contents) {
        String[] csv = contents.split("\n"); //split each line as a set of data
        this.colNames = csv[0].split(","); //split column names from the first line in the csv by a comma

        this.numRows = csv.length - 1; //not counting the first line
        data = new String[this.numRows][this.colNames.length]; //2D array of string objects

        //loop to split each row at the comma as a set of data
        for (int i = 1; i < csv.length; i++)
            data[i - 1] = csv[i].split(",");
    }

    /* TODO
    This method should return the data contained on row "row" and the column matching  @columname */
    public String getValue(String columnName,int row){
        String value = "";
        for (int i = 0; i < this.colNames.length; i++) {
            if (colNames[i].equals(columnName))
                value = data[row][i];
        }
        return value;
    }
}


