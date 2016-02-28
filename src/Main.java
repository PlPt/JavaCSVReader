
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		CSVFile csv = new CSVFile("D:\\temp\\test.csv");
		CSVItem item = csv.getItemAt(1);
		CSVData data = (CSVData)item.typeAs(CSVData.class);
		System.out.print(data.getCity());
		data.setParentId(12);
		csv.saveFile();

	}

}
