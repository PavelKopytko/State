package by.epam.tr.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

	private String name;
	private City capital;
	private List<Region> regions;
	private double area;

	{
		regions = new ArrayList<Region>();
	}

	public State() {

	}

	public State(String name, City capital, double area) {
		super();
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	public State(String name, City capital, List<Region> regions, double area) {
		super();
		this.name = name;
		this.capital = capital;
		this.regions = regions;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void add(Region region) {
		regions.add(region);
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, capital, name, regions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(capital, other.capital) && Objects.equals(name, other.name)
				&& Objects.equals(regions, other.regions);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", capital=" + capital + ", regions=" + regions
				+ ", area=" + area + "]";
	}

}
