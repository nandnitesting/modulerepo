package com.TestNGBasics;

import org.testng.annotations.Test;

public class AnnationPrioritize {
	@Test(priority=1)
	public void addEmploye()
	{
		System.out.println("Add Employe");
	}
	@Test(priority=2)
	public void editEmploye()
	{
		System.out.println("Edit employe");
	}
	@Test(priority=3)
	public void deleteEmploye()
	{
		System.out.println("Delete Employe");
	}
}
