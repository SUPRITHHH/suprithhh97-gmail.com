package com.tyss.assessment2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.assessment2.dto.Order_Info;
import com.tyss.assessment2.dto.Products;
import com.tyss.assessment2.dto.Response;
import com.tyss.assessment2.service.ProductService;




@RestController
@RequestMapping("stockmanagement")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductManagement {

	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/addproduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addProduct(@RequestBody Products product) {
		Response response = new Response();
		if (service.addProduct(product)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("Data added to the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;

	}// end of addasest
	
	@PutMapping(path = "/modifyproduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response modifyAssest(@RequestBody Products product) {

		Response response = new Response();
		if (service.modifyProducts(product)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("Data modified in the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to modify the data");
		}

		return response;

	}// end of modify
	
	@GetMapping(path = "/getproduct",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getProductByName(@RequestParam("name") String name) {
		Response response = new Response();
		List<Products>  bean = service.getProductByName(name);
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription(" Data found in the database");
			response.setProducts(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("unable to find data");
		}

		return response;

	}
	
	
	@GetMapping(path = "/getproductcategory",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getProductByCategory(@RequestParam("category") String category) {
		Response response = new Response();
		List<Products> bean = service.getProductByCategory(category);
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription(" Data found in the database");
			response.setProducts(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("unable to find data");
		}

		return response;

	}
	
	@GetMapping(path = "/getproductcompany",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getProductByCompany(@RequestParam("company") String company) {
		Response response = new Response();
		List<Products> bean = service.getProductByCompany(company);
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription(" Data found in the database");
			response.setProducts(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;

	}
	
	@PostMapping(path = "/addtocart", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addCart(@RequestBody Order_Info product) {
		Response response = new Response();
		if (service.addProductToCart(product)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription("Data added to the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;

	}
	
	
	@GetMapping(path = "/getorderlist",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response getOrderedList() {
		Response response = new Response();
		List<Order_Info> bean = service.getOrderList();
		if (bean!=null) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDescription(" Data found in the database");
			response.setOrder1(bean);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" failed to add data to the database");
		}

		return response;

	}
		
}
