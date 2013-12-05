package example.api;

import org.mongodb.morphia.annotations.Entity;

import com.sun.corba.se.spi.ior.ObjectId;

@Entity
public class Conference {

	private ObjectId id;
	private String name;

	public Conference() {
	}
	
	public Conference(String name) {
		super();
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
