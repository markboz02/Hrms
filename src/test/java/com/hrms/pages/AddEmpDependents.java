package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class AddEmpDependents extends CommonMethods {

	@FindBy (id = "menu_pim_viewEmployeeList")
	public WebElement empList;
	
	@FindBy (xpath = "//*[@id=\"resultTable\"]/tbody/tr[9]/td[3]/a")
	public WebElement empInfo;
	
	@FindBy (xpath = "//ul[@id=\"sidenav\"]/li[4]/a")
	public WebElement empDep;
	
	public AddEmpDependents() {
		PageFactory.initElements(driver, this);
	}
	
	
}
