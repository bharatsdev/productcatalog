/**
 * 
 */
package com.sapient.shopping.resources;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.sapient.shopping.service.IProductCatalogService;

/**
 * @author b.singh
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ProductCatalogController.class)
class ProductCatalogControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IProductCatalogService iProductCatalogService;

	/**
	 * Test method for
	 * {@link com.sapient.shopping.resources.ProductCatalogController#doSearchProduct(java.lang.Integer)}.
	 */
	@Test
	void testDoSearchProduct() {
	}

	/**
	 * Test method for
	 * {@link com.sapient.shopping.resources.ProductCatalogController#updateProductCatalog(java.lang.Integer, java.lang.Integer)}.
	 */
	@Test
	void testUpdateProductCatalog() {
		// fail("Not yet implemented");
	}

}
