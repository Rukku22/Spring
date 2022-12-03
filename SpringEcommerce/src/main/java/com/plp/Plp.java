package com.plp;

public class Plp {
private int id;
private String image;
private String  name;
private int cost;
private String description;
private String email;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getusername() {
	return id;
}
 

public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Plp [id=" + id + ", image=" + image + ", name=" + name + ", cost=" + cost + ", description=" + description
			+ "email=" +email+",]";
}


}
