package com.cg.ops.util;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cg.ops.dto.Credentials;
import com.cg.ops.dto.Customer;

public class DBUtil {
	static Random rand = new Random();
	public static HashMap<String, Customer> bankDBMap = new HashMap<>();
	public static HashMap<String, String> credentialDBMap = new HashMap<>();
	static {
		credentialDBMap.put("162214", "av123");
		bankDBMap.put(
				"162214",
				new Customer("162214", "Avinash Mayani", LocalDate.of(1996,
						Month.MAY, 24), "Saving", 20500.0F, 200000.0));
		credentialDBMap.put("162208", "di123");
		bankDBMap.put("162208", new Customer("162208", "Utkarsh Dwivedi",
				LocalDate.of(2018, Month.SEPTEMBER, 26), "Current", 15500.0F,
				200000.0));
		credentialDBMap.put("160645", "ab123");
		bankDBMap.put("160645", new Customer("160645", "Aman Sharma",
				LocalDate.of(2018, Month.SEPTEMBER, 14), "Saving", 15500.0F,
				200000.0));
		credentialDBMap.put("160625", "ra123");
		bankDBMap.put(
				"160625",
				new Customer("160625", "Vijay Ghosh", LocalDate.of(2017,
						Month.DECEMBER, 15), "Current", 15500.0F, 200000.0));
	}

	public static String newCustomer(String password, Customer customer) {
		credentialDBMap.put(customer.getAccNumber(), password);
		bankDBMap.put(customer.getAccNumber(), customer);
		return customer.getAccNumber();
	}

	public static HashMap<String, String> getAllCustCred() {
		return credentialDBMap;
	}

	public static HashMap<String, Customer> getAllCustomer() {
		return bankDBMap;
	}

}
