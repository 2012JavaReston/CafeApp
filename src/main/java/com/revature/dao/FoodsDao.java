package com.revature.dao;

import java.util.List;

import com.revature.models.Foods;

public interface FoodsDao {
	
	//CREATE
	public boolean createFoods(Foods f);
	
	//READ
	public Foods selectFoodsByName(String n);
	public List<Foods> selectAllFoods();
	
	//UPDATE
	public boolean updateFoods(Foods f);
	
	//DELETE
	public boolean deleteFoods(Foods f);

}
