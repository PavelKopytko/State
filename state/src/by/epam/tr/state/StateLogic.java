package by.epam.tr.state;

public class StateLogic {

	public void sort(State state) {
		for (int i = 0; i < state.getRegions().size(); i++) {
			Region min = state.getRegions().get(i);
			int index = i;

			for (int j = i + 1; j < state.getRegions().size(); j++) {
				if (min.getMainCity().getName()
						.compareToIgnoreCase(state.getRegions().get(j).getMainCity().getName()) > 0) {
					min = state.getRegions().get(j);
					index = j;
				}
			}

			Region temp = state.getRegions().get(i);
			state.getRegions().set(i, state.getRegions().get(index));
			state.getRegions().set(index, temp);
		}
	}

}
