package by.epam.tr.state;

public class StateView {

	public void printCapital(State state) {
		System.out.println();
		System.out.println(state.getCapital().getName() + " - столица государства " + state.getName());
	}

	public void printNumberOfRegions(State state) {
		System.out.println();
		System.out.println(state.getName() + " включает " + state.getRegions().size() + " областей");
	}

	public void printRegionsCity(State state) {
		System.out.println("\nОбластные центры:");
		for (Region region : state.getRegions()) {
			System.out.println(region.getName() + " область - г." + region.getMainCity().getName());
		}
	}

}
