package org.people.fu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE")
public class Image {

	@Id
	@Column(name="ID_IMAGE")
	private Long id;
	
	@Column(name="IMAGE_NAME")
	private String imageName;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Long getId() {
		return id;
	} 
	
	
}
