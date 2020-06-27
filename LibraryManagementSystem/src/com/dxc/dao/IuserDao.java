package com.dxc.dao;

import java.util.List;


import com.dxc.pojos.Book;

public interface IuserDao {

	boolean passwordCheck(String name, String password);
	public void closeConnection();
	public List<Book> getBookList();
	public List<Book> getBookListOfParticularAuthor(String authorName);
	void issueBook(int uId, int bId, int day,double balance);
	double getBalance(int userId);
	int getUserId(String name);
	void returnBook(int uId, int bId);
	List<Book> getIssuedBook(int uId);

}
