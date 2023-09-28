package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "productos")
public class Productos {
	@Id
	private int Id;
	private String NameProduct;
	private String Description;
	private double Precio;
	
	public Productos() {
	}

	public Productos(int id, String nameProduct, String description, double precio) {
		Id = id;
		NameProduct = nameProduct;
		Description = description;
		Precio = precio;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNameProduct() {
		return NameProduct;
	}

	public void setNameProduct(String nameProduct) {
		NameProduct = nameProduct;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	
}
