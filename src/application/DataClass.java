package application;

import java.util.List;
import java.util.ArrayList;

public class DataClass {

	private List<Person> importList;
	private List<Person> exportList;
	

	public DataClass() {

		importList = new ArrayList<Person>(); 
		importList.add(new Person("Sami", "BenAli","sami@exemple.com")); 
		importList.add(new Person("Alia", "BenSalah", "alia@exemple.com")); 
		importList.add(new Person("Ali", "BenSalah", "ali@exemple.com")); 
		exportList = new ArrayList<Person>();
	}
	
	public List<Person> getImportList() {
		return importList;
	}


	public List<Person> getExportList() {
		return exportList;
	}

	public void setExportList(List<Person> exportlist) {
		this.exportList.addAll(exportlist);
		for (Person p : this.exportList)
			System.out.println(p);
	}

}