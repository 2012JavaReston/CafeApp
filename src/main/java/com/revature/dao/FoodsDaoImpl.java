package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Foods;

public class FoodsDaoImpl implements FoodsDao {

	private static List<Foods> foodList = new ArrayList<>();
	
	@Override
	public boolean createFood(Foods newFood) {
		boolean found = false;
		boolean result = false;
		for(Foods f : foodList) {
			if(f.getName().equals(newFood.getName())) {
				found = true;
				break;
			}
		}
		if(!found) {
			foodList.add(newFood);
			result = true;
		}
		return result;
	}

	@Override
	public Foods selectFoodByName(String n) {
		Foods result = null;
		for(Foods f : foodList) {
			if(f.getName().equals(n)) {
				result = f;
				break;
			}
		}
		return result;
	}

	@Override
	public List<Foods> selectAllFoods() {
		return foodList;
	}

	@Override
	public boolean updateFoods(Foods food) {
		boolean result = false;
		for(Foods f : foodList) {
			if(f.getName().equals(food.getName())) {
				f = food;
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public boolean removeFood(Foods food) {
		boolean result = false;
		for(Foods f : foodList) {
			if(f.getName().equals(food.getName())){
				foodList.remove(f);
				result = true;
				break;
			}
		}
		return result;
	}

}
