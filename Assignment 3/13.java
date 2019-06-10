/*Create a class name Book that contains data fields for the title and number of
pages. Include get and set methods for these fields. Next, create a subclass
named Textbook, which contains an additional field that holds a grade level for
the Textbook and additional methods to get and set grade level field. Write an
application that demonstrates using objects of each class.*/
class book {
	String title;
	int pages;
	void get(String title, int pages) {
		this.title=title;
		this.pages=pages;
	}
	void set() {
		System.out.println("Book Title: "+title);
		System.out.println("Number of Pages: "+pages);
	}
}
class textbook {
	String grade;
	void get(String grade) {
		this.grade=grade;
	}
	void set() {
		System.out.println("Grade of book: "+grade);
	}
}
class demo {
	public static void main(String[] args) {
		book b1=new book();
		b1.get("The Brief History of Time",256);
		b1.set();
		textbook t1=new textbook();
		t1.get("A");
		t1.set();
	}
}