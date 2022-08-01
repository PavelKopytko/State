package by.epam.tr.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

	private String name;
	private City mainCity;
	private List<District> districts;
	private double area;

	{
		districts = new ArrayList<District>();
	}

	public Region() {

	}
	
	

	public Region(String name, City mainCity, double area) {
		super();
		this.name = name;
		this.mainCity = mainCity;
		this.area = area;
	}


	public Region(String name, City mainCity, List<District> districts, double area) {
		this.name = name;
		this.mainCity = mainCity;
		this.districts = districts;
		this.area = area;
	}

	public void add(District district) {
		districts.add(district);
//		this.area += district.getArea();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getMainCity() {
		return mainCity;
	}

	public void setMainCity(City mainCity) {
		this.mainCity = mainCity;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, districts, mainCity, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(districts, other.districts) && Objects.equals(mainCity, other.mainCity)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", mainCity=" + mainCity + ", districts=" + districts
				+ ", area=" + area + "]";
	}

}
