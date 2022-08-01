package by.epam.tr.state;

import java.util.Objects;

public class District {

	private String name;
	private City city;
	private double area;

	public District() {

	}

	public District(String name, City city, double area) {
		super();
		this.name = name;
		this.city = city;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, city, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area) && Objects.equals(city, other.city)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", city=" + city + ", area=" + area + "]";
	}

}
