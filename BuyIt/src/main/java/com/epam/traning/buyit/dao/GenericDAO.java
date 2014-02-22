package com.epam.traning.buyit.dao;

public interface GenericDAO<T> {

	void createElement(T elem);

	T getElementById(int id);

	void updateElement(T elem);

	void deleteElementById(int id);

}