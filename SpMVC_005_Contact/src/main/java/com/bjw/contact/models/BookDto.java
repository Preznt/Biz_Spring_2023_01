package com.bjw.contact.models;

/**
 * BookDTO
 * 
 * DTO(Data Transfer Object)
 * 		데이터를 담아서 이곳 저곳으로 옮기는 바구니 역할을 하는 객체
 * VO(Value Object)
 * 		데이터를 담는 객체
 * @author KS500516
 *
 */

public class BookDto {
	private String isbn;	//varchar(13)
	private String title;	//varchar(125)
	private String link;	//varchar(255)
	private String image;	//varchar(255)
	private String author;	//varchar(125)
	private int discount;	//int
	private String publisher;	//varchar(125)
	private String description;	//text
	private String pubdate;	//varchar(20)
	private int price;	//int
	
	
	
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookDto(String isbn, String title, String link, String image, String author, int discount, String publisher,
			String description, String pubdate, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.link = link;
		this.image = image;
		this.author = author;
		this.discount = discount;
		this.publisher = publisher;
		this.description = description;
		this.pubdate = pubdate;
		this.price = price;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", link=" + link + ", image=" + image + ", author=" + author
				+ ", discount=" + discount + ", publisher=" + publisher + ", description=" + description + ", pubdate="
				+ pubdate + ", price=" + price + "]";
	}
	
}
