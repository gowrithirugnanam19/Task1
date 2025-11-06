package com.poly;

import java.util.ArrayList;

public class Food {
	    private String foodname;
	    private int foodamt;
	    public Food() {
	        
	    }
	    public Food(String foodname,int foodamt) {
	        this.foodname = foodname;
	        this.foodamt = foodamt;
	    }
		public String getFoodname() {
			return foodname;
		}
		public void setFoodname(String foodname) {
			this.foodname = foodname;
		}
		public int getFoodamt() {
			return foodamt;
		}
		public void setFoodamt(int foodamt) {
			this.foodamt = foodamt;
		}
		@Override
		public String toString() {
			return "Food [foodname=" + foodname + ", foodamt=" + foodamt + "]";
		}
		public static void main(String[] args) {
			Food f1=new Food();
			f1.setFoodname("Briyani");
			f1.setFoodamt(150);
			    
			Food f2=new Food();
			f2.setFoodname("Friedrice");
			f2.setFoodamt(100);
		    
			Food f3=new Food();
			f3.setFoodname("Masala Dosa");
			f3.setFoodamt(50);
		    
		    ArrayList<Food> fl=new ArrayList<Food>();
		    fl.add(f1);
		    fl.add(f2);
		    fl.add(f3);
		    System.out.println(fl);
		    System.out.println();
		    for(Food f:fl) {
		    	System.out.println(f);
		    }
			}

}
