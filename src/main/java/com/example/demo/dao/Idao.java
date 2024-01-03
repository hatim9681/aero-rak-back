package com.example.demo.dao;

import java.util.List;

public interface Idao<T> {
	T save(T o);
	T findById(int id);
	void delete(T o);
	void update(T o);
	List<T> findAll();

}