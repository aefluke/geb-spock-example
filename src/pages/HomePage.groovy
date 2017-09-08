package pages
import geb.Page

class HomePage extends Page{

	//static url	
	static url = "/"
	
	//At checker
	static at = {
		$("#hplogo").isDisplayed()
	}
	static content = {
		
		searchField(wait:true){$("#lst-ib")}
		searchButton(wait:true){$("input",name: "btnK")}
		logo(wait:true){$("#hplogo")}
	}
	
	def "enter search key"(searchString){
		searchField.value(searchString)
		assert searchField.value() == searchString
		
	}
	def "click search"(){
		logo.click()
		searchButton.click()
	}
}
