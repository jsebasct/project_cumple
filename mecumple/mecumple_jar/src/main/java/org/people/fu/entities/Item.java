package org.people.fu.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ITEM_ID")
	protected Long id;
	
	private String name;
	
//	@ElementCollection
//	@CollectionTable(name="IMAGE")//, joinColumns=@JoinColumn(name="ITEM_ID")
//	//@Column(name="FILENAME")
//	private List<Image> images = new LinkedList<Image>();
//	
//	public List<Image> getImages() {
//		return images;
//	}
//
//	public void setImages(List<Image> images) {
//		this.images = images;
//	}

	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
