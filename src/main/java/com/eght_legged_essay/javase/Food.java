package com.eght_legged_essay.javase;

import java.util.ArrayList;
import java.util.List;

class Food{
	String name = "Food";
}
class Fruit extends Food{
	String name = "Fruit";
}
class Apple extends Fruit {
	String name = "Apple";
}
class ExtendsTest{
	// 定义时指定T为Fruit
	List<? extends Fruit> list;

	public void set(){
		// 实例化时类只能是T本身或它的子类
		list= new ArrayList<Fruit>(); // 可以
		list= new ArrayList<Apple>(); // 可以
		// list= new ArrayList<Food>();  //报错
	}
}