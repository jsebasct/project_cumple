package org.people.fu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Bid {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ITEM_ID", nullable=false)
	protected Item item;
	
	@Id
	@Column(name="BID_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;

	@Column(name="BID_AMOUNT")
	private Long amount;
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Long getId() {
		return id;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
}
