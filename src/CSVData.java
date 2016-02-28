
/**
 * 
 * Sample class for embed your own Objects in CSV structure
 *
 */
public class CSVData 
{
	// define CSV Indexes
	final int idxId = 0; // Field ID is the first CSV field
	final int idxCity = 1; // Field City is the Second CSV field
	final int idxParentId = 2; //Field ParentId is the third CSV field
	
	CSVItem item; // Every implementation of own CSV objects must have an Instance of the connected CSVItem!
	
	/**
	 * Default Constructor of a deault CSV processing class
	 * @param csvLine Connected CSV Line
	 */
	public CSVData(CSVItem csvLine) {
		item = csvLine;
	
	}
	
	/**
	 * Empty constructor for the generic stuff
	 */
	public CSVData()
	{
	}
	
	/**
	 * Returns the ID of CSV Item
	 * @return
	 */
	public int getId()
	{
		String idVal = item.getValueAt(idxId); // REad ID Field
		return Integer.parseInt(idVal); // parse into int
	}
	
	/**
	 * Returns the City
	 * @return
	 */
	public String getCity()
	{
		return item.getValueAt(idxCity); // Read city field
	}

	
	/**
	 * Returns the parentID
	 * @return
	 */
	public int getParentId()
	{
		String pId = item.getValueAt(idxParentId);
		return Integer.parseInt(pId);
	}
	
	
	/**
	 * Sets the parentId ( this value can be found later in the new CSV)
	 * @param id
	 */
	public void setParentId(int id)
	{
		item.setValue(idxParentId, String.valueOf(id)); // set Value
	}
	
	


}
