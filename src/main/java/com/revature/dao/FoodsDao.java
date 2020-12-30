package com.revature.dao;

import java.util.List;

import com.revature.models.Foods;

public interface FoodsDao {
	
	//CREATE
	public boolean createFood(Foods f);
	
	//READ
	public Foods selectFoodByName(String n);
	
	public List<Foods> selectAllFoods();
	
	//UPDATE
	public boolean updateFoods(Foods f);
	
	//DELETE
	public boolean removeFood(Foods f);

}
