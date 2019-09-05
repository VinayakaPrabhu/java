package com.set.test;

import static com.set.test.ProductFixtures.bobs;
import static com.set.test.ProductFixtures.door;
import static com.set.test.ProductFixtures.floorPanel;
import static com.set.test.ProductFixtures.kates;
import static com.set.test.ProductFixtures.window;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.set.ProductCatalogue;
import com.set.TreeProductCatalogue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductCatalogueTest {
	@Test
	public void shouldFindHeavyVanProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
	}

	@Test
	public void shouldFindLightVanProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
	}

	@Test
	public void shouldOnlyHoldUniqueProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
	}

	@Test
	public void treeShouldOnlyHoldUniqueProducts() throws Exception {
		TreeProductCatalogue catalogue = new TreeProductCatalogue();

		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);

		assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
	}
}
