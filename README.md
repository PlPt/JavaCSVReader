# JavaCSVReader
A simple CSV Reader in Java

Reads a normal CSV File into an Object structure.

Supports edititng and saving back changed CSV Data.
You can check in your wn Objects as well. (Look in sample File CSVData.java)


Easy to use:

    CSVFile csv = new CSVFile(pathToyourFile);
		CSVItem item = csv.getItemAt(1);//Read Second element
		CSVData data = (CSVData)item.typeAs(CSVData.class); // Parse in your Data Class
		System.out.print(data.getCity()); //Test Output
		data.setParentId(12); // Renew ID
		csv.saveFile(); // save changed CSV
