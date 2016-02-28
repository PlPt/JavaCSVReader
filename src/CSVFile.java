import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Object for a CSVFile
 *
 */
public class CSVFile {

  private	ArrayList<CSVItem> itemList = new ArrayList<CSVItem>();
	String filePath = "";
	
	/**
	 * Constructor, reads and parses CSV
	 * @param path Path to CSV File
	 */
	public CSVFile(String path)
	{
		this.filePath = path;
		 File fl = new File(path);
		    FileInputStream fin;
			try {
						fin = new FileInputStream(fl);
					  BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
				   
					    String line = null;
					    while ((line = reader.readLine()) != null) 
					    {
					    	if(line.contains(";"))
					    	{
							     CSVItem item = new CSVItem(line);
							     itemList.add(item);
					    	}
					    }
					    reader.close();
					    
					    }
					catch (Exception e) 
					    {
							// TODO Auto-generated catch block
							e.printStackTrace();
					    }
		
	}
	
	/**
	 * Returns a CSV Item at specific position
	 * @param idx Item position
	 * @return CSVItem at given position
	 */
	public CSVItem getItemAt(int idx)
	{
		return itemList.get(idx);
	}
	
	/**
	 * Removes Item at position
	 * @param idx Position to remove
	 */
	public void removeItem(int idx)
	{
		itemList.remove(idx);
		
	}
	
	/**
	 * Remove CSVItem
	 * @param item Item to remove
	 */
	public void removeItem(CSVItem item)
	{
		itemList.remove(item);
	}
	
	/**
	 * Add a CSVItem to File
	 * @param item Item to add
	 */
	public void addItem(CSVItem item)
	{
		itemList.add(item);
	}
	
	/**
	 * Saves CSV File with all changes made in Objects
	 */
	public void saveFile()
	{
		StringBuilder sb = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		
		for(CSVItem cItem : itemList)
		{
			sb.append(cItem.buildCSVString()).append(newLine);
			
		}
		String fileString = sb.toString();
		
		 File newTextFile = new File(filePath);

         FileWriter fw;
		try {
			fw = new FileWriter(newTextFile);
			  fw.write(fileString);
		         fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       

	}
	

	
	

}
