package com.practice;

public class DataKey implements Cloneable {
	private String name;
	private int id;
	
	   public Object clone() throws
       CloneNotSupportedException 
{ 
return super.clone(); 
} 
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataKey other = (DataKey) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		this.id = i;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name=string;
	}

}
