
package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.solr.client.solrj.beans.Field;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Facility implements Serializable{
	
	@Field
	private Integer id;	
	@Field
	private String name;
	@Field
	private String description;
	@Field
	private Image image;	
	@Field
	private Integer  id_structure;
	
	
	private Integer id_room;
	private Integer id_roomType;
	private Integer id_uploadedFacility;
	
	
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
	
	public Integer getId_structure() {
		return id_structure;
	}
	public void setId_structure(Integer id_structure) {
		this.id_structure = id_structure;
	}
	public Integer getId_room() {
		return id_room;
	}
	public void setId_room(Integer id_room) {
		this.id_room = id_room;
	}
	public Integer getId_roomType() {
		return id_roomType;
	}
	public void setId_roomType(Integer id_roomType) {
		this.id_roomType = id_roomType;
	}
	public Integer getId_uploadedFacility() {
		return id_uploadedFacility;
	}
	public void setId_uploadedFacility(Integer id_uploadedFacility) {
		this.id_uploadedFacility = id_uploadedFacility;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
