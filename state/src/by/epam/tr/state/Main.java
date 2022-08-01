package by.epam.tr.state;

/* Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры*/

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<District> d1 = new ArrayList<District>();
		d1.add(new District("Барановичский", new City("Барановичи"), 2170));
		d1.add(new District("Пинский", new City("Пинск"), 3252));
		d1.add(new District("Ивацевичский", new City("Ивацевичи"), 2998));

		List<District> d2 = new ArrayList<District>();
		d2.add(new District("Поставский", new City("Поставы"), 2096));
		d2.add(new District("Миорский", new City("Миоры"), 1786));
		d2.add(new District("Оршанский", new City("Орша"), 1667));

		List<District> d5 = new ArrayList<District>();
		d2.add(new District("Солигорский", new City("Солигорск"), 2498));
		d2.add(new District("Слуцкий", new City("Слуцк"), 1821));
		d2.add(new District("Борисовский", new City("Борисов"), 3046));

		City minskCity = new City("Минск");

		Region brest = new Region("Бресткая", new City("Брест"), d1, 32790);
		Region vitebsk = new Region("Витебская", new City("Витебск"), d2, 40051);
		Region gomel = new Region("Гомельская", new City("Гомель"), new ArrayList<District>(), 40372);
		Region grodno = new Region("Гродненская", new City("Гродно"), new ArrayList<District>(), 25127);
		Region minsk = new Region("Минская", minskCity, d5, 39854);
		Region mogilev = new Region("Могилевская", new City("Могилев"), new ArrayList<District>(), 29068);

		List<Region> regions = new ArrayList<Region>();
		regions.add(gomel);
		regions.add(grodno);
		regions.add(mogilev);

		State belarus = new State("Республика Беларусь", minskCity, regions, 207600);
		belarus.add(brest);
		belarus.add(vitebsk);
		belarus.add(minsk);

		StateView view = new StateView();

		StateLogic logic = new StateLogic();

		logic.sort(belarus);

		view.printCapital(belarus);

		view.printNumberOfRegions(belarus);

		view.printRegionsCity(belarus);

	}

}
