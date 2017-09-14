
package model;

import java.io.Serializable;

public class ExtraItem implements Serializable{
	
	private Integer id;
	private Extra extra;
	private Integer quantity = 0;
	private Integer maxQuantity = 0;
	private Double unitaryPrice = 0.0;
	private Integer id_booking;
	private Integer id_extra;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExtraItem other = (ExtraItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Double getSubtotal() {
		return this.unitaryPrice * this.quantity;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Extra getExtra() {
		return extra;
	}
	public void setExtra(Extra extra) {
		this.extra = extra;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitaryPrice() {
		return unitaryPrice;
	}
	public void setUnitaryPrice(Double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	public Integer getMaxQuantity() {
		return maxQuantity;
	}
	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	public Integer getId_booking() {
		return id_booking;
	}
	public void setId_booking(Integer id_booking) {
		this.id_booking = id_booking;
	}
	public Integer getId_extra() {
		return id_extra;
	}
	public void setId_extra(Integer id_extra) {
		this.id_extra = id_extra;
	}
	
}
