package com.list.test;

import static com.list.test.ProductFixtures.door;
import static com.list.test.ProductFixtures.floorPanel;
import static com.list.test.ProductFixtures.window;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.list.Shipment;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShipmentTest {
	private Shipment shipment = new Shipment();

	@Test
	public void shouldAddItems() throws Exception {
		shipment.add(door);
		shipment.add(window);
		System.err.println(shipment);
		assertThat(shipment, contains(door, window));
	}

	@Test
	public void shouldIdentifyVanRequirements() throws Exception {
		shipment.add(door);
		shipment.add(window);
		shipment.add(floorPanel);

		shipment.prepare();

		assertThat(shipment.getLightVanProducts(), contains(window));
		assertThat(shipment.getHeavyVanProducts(), contains(floorPanel, door));
	}

	@Test
	public void shouldNotReplaceMissingItems() throws Exception {
		shipment.add(window);

		shipment.replace(door, floorPanel);

		assertThat(shipment, contains(window));
	}

	@Test
	public void shouldReplaceItems() throws Exception {
		shipment.add(door);
		shipment.add(window);

		shipment.replace(door, floorPanel);

		assertThat(shipment, contains(floorPanel, window));
	}
}
