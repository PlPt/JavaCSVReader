
import java.util.ArrayList;


public class CSVItem {
	
	private ArrayList<String> valueList = new ArrayList<String>();
	public CSVItem(String csvLine)
	{
		if(csvLine.contains(";"))
		{
			String[] array = csvLine.split(";");
			for(String item : array)
			{
				valueList.add(item.trim());
			}
		}
		else
		{
			throw new IllegalStateException("CSVLine String does not contain ',' as Seperator");
		}
	}
	
	public ArrayList<String> getValueList()
	{
		return valueList;
	}
	
	public String getValueAt(int idx)
	{
		return valueList.get(idx);
	}
	
	public void addValueAt(int idx,String value)
	{
		valueList.add(idx, value);
	}
	
	public void setValue(int idx,String value)
	{
		valueList.set(idx, value);
	}
	
	public void addValue(String value)
	{
		valueList.add(value);
	}
	
	
	public int getItemCount()
	{
		return valueList.size();
	}
	
	public String buildCSVString()
	{
		String csvLine = "";
		for(String item : valueList)
		{
			csvLine += ";"+item;
		}
		
		
		return csvLine.substring(1);
	}
	
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
