package com.TestNGBasics;

import org.testng.annotations.Test;

public class AnnationEnabled {
	@Test(enabled=false)
	public void addEmploye()
	{
		System.out.println("Add Employe");
	}
	@Test
	public void editEmploye()
	{
		System.out.println("Edit employe");
	}
	@Test
	public void deleteEmploye()
	{
		System.out.println("Delete Employe");
	}
}
