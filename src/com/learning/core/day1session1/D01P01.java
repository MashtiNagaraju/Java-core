package com.learning.core.day1session1;

public class D01P01 {

	private String book_title;
	private double book_price;

	public String getBook_title() {
		return book_title;
	}
	
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	public D01P01(String book_title, double book_price) {
		super();
		this.book_title = book_title;
		this.book_price = book_price;
	}
	public class BookService {

		public static D01P01 createBook(String title, double price) {
			return new D01P01(title, price);
			
		}

		public static void showBook(D01P01 book) {
			System.out.print("Book Title:"+ book.getBook_title());
			System.out.print(" and Price:"+ book.getBook_price());
		}

		public static void main(String[] args) {
			String title = "Java programming";
			double price = 350.00;

			D01P01 book = createBook(title, price);

			showBook(book);
		}
	}


}
