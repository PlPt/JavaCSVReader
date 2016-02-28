
public class CSVData 
{

	final int idxId = 0;
	final int idxCity = 1;
	final int idxParentId = 2;
	CSVItem item;
	
	public CSVData(CSVItem csvLine) {
		item = csvLine;
	
	}
	public CSVData()
	{
		
	}
	
	public int getId()
	{
		String idVal = item.getValueAt(idxId);
		return Integer.parseInt(idVal);
	}
	
	public String getCity()
	{
		return item.getValueAt(idxCity);
	}

	public int getParentId()
	{
		String pId = item.getValueAt(idxParentId);
		return Integer.parseInt(pId);
	}
	
	
	public void setParentId(int id)
	{
		item.setValue(idxParentId, String.valueOf(id));
	}
	
	


}
