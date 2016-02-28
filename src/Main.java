
class Main {

	/**
	 * Sample implementation
	 * @param args
	 */
	public static void main(String[] args) {
	
		CSVFile csv = new CSVFile("D:\\temp\\test.csv"); // Read CSV
		CSVItem item = csv.getItemAt(1); // Get Second Item ( CSV Line)
		CSVData data = (CSVData)item.typeAs(CSVData.class); // Cast CSV line to Data Object
		System.out.print(data.getCity()); // Print city name
		data.setParentId(12); // Renew parent ID
		csv.saveFile(); // Save CSV

	}

}
