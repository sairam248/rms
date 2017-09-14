
package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.solr.client.solrj.beans.Field;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)

public class Extra implements Serializable{
	
	@Field
	private Integer id;
	@Field
	private String name;
	@Field
	private String timePriceType;
	@Field
	private String resourcePriceType;
	@Field
	private String description;
	@Field
	private Integer id_structure;
	private Boolean availableOnline;
	
	
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
		Extra other = (Extra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimePriceType() {
		return timePriceType;
	}
	public void setTimePriceType(String timePriceType) {
		this.timePriceType = timePriceType;
	}
	public String getResourcePriceType() {
		return resourcePriceType;
	}
	public void setResourcePriceType(String resourcePriceType) {
		this.resourcePriceType = resourcePriceType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId_structure() {
		return id_structure;
	}
	public void setId_structure(Integer id_structure) {
		this.id_structure = id_structure;
	}
	public Boolean getAvailableOnline() {
		return availableOnline;
	}
	public void setAvailableOnline(Boolean availableOnline) {
		this.availableOnline = availableOnline;
	}

}
