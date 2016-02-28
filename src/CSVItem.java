
import java.util.ArrayList;

/**
 * Object for a CSV Item
 *
 */
public class CSVItem {
	
	private ArrayList<String> valueList = new ArrayList<String>();
	final String CSVSeparator = ";";
	
	/**
	 * Initializes a CSV Item
	 * @param csvLine String of CSV Line
	 */
	public CSVItem(String csvLine)
	{
		if(csvLine.contains(CSVSeparator))
		{
			String[] array = csvLine.split(CSVSeparator);
			for(String item : array)
			{
				valueList.add(item.trim());
			}
		}
		else
		{
			throw new IllegalStateException("CSVLine String does not contain '" +CSVSeparator +"' as Seperator");
		}
	}
	
	/**
	 * Return the Value ArrayList
	 * @return List of Values
	 */
	public ArrayList<String> getValueList()
	{
		return valueList;
	}
	
	
	/**
	 * Returns Value at given position
	 * @param idx Position of the Value 
	 * @return Value at pos
	 */
	public String getValueAt(int idx)
	{
		return valueList.get(idx);
	}
	
	/**
	 * Add a Value to a specific position
	 * @param idx Position to add
	 * @param value Value to add
	 */
	public void addValueAt(int idx,String value)
	{
		valueList.add(idx, value);
	}
	
	/**
	 * Sets a Value at position
	 * @param idx Index to set
	 * @param value Value to set
	 */
	public void setValue(int idx,String value)
	{
		valueList.set(idx, value);
	}
	
	/**
	 * Add a value to Item
	 * @param value Value to add
	 */
	public void addValue(String value)
	{
		valueList.add(value);
	}
	
	/**
	 * Returns the numbe of Items
	 * @return number of Items
	 */
	public int getItemCount()
	{
		return valueList.size();
	}
	
	/**
	 * Build CSVString for saviing as File
	 * @return Item as CSV line string
	 */
	public String buildCSVString()
	{
		String csvLine = "";
		for(String item : valueList)
		{
			csvLine += CSVSeparator+item;
		}
		
		
		return csvLine.substring(1);
	}
	
	
	/**
	 * Generic Method to embed your own Objects to process CSV
	 * @param t Class to Cast
	 * @return Class Object of new Type
	 */
	public Object typeAs(Class<?> t)
	{
		try {
			return t.getDeclaredConstructor(CSVItem.class).newInstance(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
	
	

}
