package books;

public class Book implements Comparable{
	private String title;
	private String author;
	private int year;
	
	// required methods
	public Book(String title, String author, int year){

	}

	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getYear(){
		return year;
	}
	
	@Override
	public String toString(){
		String blurb = getTitle() + " by " + getAuthor() + "("+ getYear() + ")";
		return blurb;
	}
	 
	public static List<Book> getList(String file){
		
	}



@Override
public int compareTo(Object o) {
	/* TODO Comparable implements the natural order but in class Book it should sort by 	
	title. Class book is immutable. It has getters but no setters. */
	return 0;
}


}