package source;

public class BookCollection {
	private Book[] books;
	private int numberOfBooks;
	private int MAX_SIZE = 10000;

	public BookCollection() {
		this.books = new Book[this.MAX_SIZE];
		this.numberOfBooks = 0;
	}

	public boolean addBook(Book book) {
		books[numberOfBooks] = book;
		numberOfBooks++;
		return true;
		// TODO : Needs to be filled up
	}

	public boolean removeBook(int index) {
		if (index < numberOfBooks) {
			for (int i = index; i < numberOfBooks - 1; i++) {
				books[i] = books[i + 1];
			}
			numberOfBooks--;
		} else {
			System.out.println("Invalid index...");
		}

		return true;

	}

	public Book getBook(String book) {
		Book b = new Book();
		for (int i = 0; i < this.numberOfBooks; i++) {
			if (book == books[i].getIsbn()) {
				b = books[i];
				removeBook(i);
				return b;
				
			} else if (book == books[i].getName()) {
				b = books[i];
				removeBook(i);
				return b;
			}
		}
		return null;
	}

	public Book[] getBookCollection() {
		return books;
		// TODO : needs to be implemented;
	}

	public void resetBooks() {
		for (int i = 0; i < numberOfBooks; i++) {
			books[i] = null;
		}
		numberOfBooks = 0;
		// System.out.println("Successfully reset your book list");
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
		// TODO: needs to be implemented
	}

	public void sortByIsbn() {

		for (int i = 0; i < numberOfBooks; i++) {
			for (int j = 0; j < numberOfBooks - 1 - i; j++) {
				if (this.books[j].getIsbn().compareTo(this.books[j + 1].getIsbn()) > 0) {
					Book temp = this.books[j];
					this.books[j] = this.books[j + 1];
					this.books[j + 1] = temp;

				}
			}
		}

	}

	public void sortByYearOfPublish() {

		for (int i = 0; i < numberOfBooks; i++) {
			for (int j = 0; j < numberOfBooks - 1 - i; j++) {
				if ((this.books[j].getYearOfPublish()) > (this.books[j + 1].getYearOfPublish())) {
					Book temp = this.books[j];
					this.books[j] = this.books[j + 1];
					this.books[j + 1] = temp;

				}
			}
		}

	}

	public void sortByPrice() {
		for (int i = 0; i < numberOfBooks; i++) {
			for (int j = 0; j < numberOfBooks - 1 - i; j++) {
				if (books[j].getPrice() > books[j + 1].getPrice()) {
					Book temp = this.books[j];
					this.books[j] = this.books[j + 1];
					this.books[j + 1] = temp;

				}
			}
		}
	}

	@Override
	public String toString() {
		if (numberOfBooks == 0) {
			return "Book list is empty";
		}
		String str = "\n";
		for (int i = 0; i < numberOfBooks; i++) {
			str = str.concat("\n\n\n" + books[i].toString());

		}

		return str;
	}

	public void printBooksCollection() {
		System.out.println("\n");
		for (int i = 0; i < this.numberOfBooks; i++) {
			System.out.println(i + 1 + ". " + books[i].getName());
		}
	}

}