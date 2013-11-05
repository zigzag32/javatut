
public enum t44b {
	bucky("nice","22"),
	kelsy("cutie", "10"),
	julia("bigmistake", "12"),
	nicole("Itallian", "13"),
	candy("dry","14"),
	erin("I wish", "16");
	
	
	private final String desc;
	private final String year;
	
	t44b(String description, String birthday){
		desc = description;
		year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear(){
		return year;
	}
}
