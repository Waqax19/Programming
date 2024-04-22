package Genre;

public enum Genre {
	
    ACTION("A", "Movies with shots, explosions, etc.")
    ,ADVENTURE("ADV","Thousands of things happen"),
    COMEDY("C","Lot of laughs"),
    DRAMA("D", "Plenty of sadness"),
    FANTASY("F","Imaginary friends"),
    HORROR("H", "Screams"),
    MUSICAL("M", "La, la, la"),
    ROMANCE("R","Love, love and much love"),
   
    SCIFI("SF","Aliens, time travels and so on"),
    THRILLER("T", "Crimes, clues, policemen..."),
    
 
    WESTERN("W","Bang!!! Movies wanted");
	
	int current = 0;
	private String description;
	private String abbreviation;
	
	private Genre(String abbreviation,String description ) {
		this.description = description;
		this.abbreviation = abbreviation;
	}
	

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}
	
	public static Genre getGenre(String abbreviation) {
		for (Genre myVar : Genre.values()) {
			  if (myVar.abbreviation.equals(abbreviation)) {
				  return myVar;
			  }
			}
		return null;

	}
	
	public static String getAbbreviationByIndex(int index) {
		
		Genre values[] = Genre.values();
		if (index < 0) {
			index = 0;
			
		}
		
		if (index >= values.length) {
			index = values.length - 1;
			
		}
		
		return values[index].abbreviation;
	}
	
	public Genre next() {
		Genre values[] = Genre.values();
		if (current == values.length) {
			current = 0;
		}
		return values[current++];
	}

}
