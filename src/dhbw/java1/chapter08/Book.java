package dhbw.java1.chapter08;

@SuppressWarnings("unused")

public class Book {
    
    private static int numberOfBooks;   // total number of instantiated books
    private String author;              // book author
    private String title;               // book title
    private long isbn13;                // ISBN-13 of the book
    private boolean hardcover;          // is it a hardcover book?
    private boolean available;          // is the book available?
	private int shelfNumber;            // shelf number of the book


    public Book(String author, String title, long isbn13, boolean hardcover) {
    	
    	this.author = author;
    	this.title = title;
    	this.isbn13 = isbn13;
    	this.hardcover = hardcover;
    	
    	numberOfBooks++;
    }
    
    
    //Getter und Setter
    
    public String getAuthor() {
    	return this.author;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    public long getIsbn13() {
    	return this.isbn13;
    }
    
    public boolean isHardcover() {
    	return this.hardcover;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setIsbn13(long isbn13) {
    	this.isbn13 = isbn13;
    }
    
    public void setIsHardcover(boolean hardcover) {
    	this.hardcover = hardcover;
    }
    
    public void setAvailable(boolean available) {
    	this.available = available;
    }
    
    public void setShelfNumber(int shelfNumber) {
    	this.shelfNumber = shelfNumber;
    }
    
}