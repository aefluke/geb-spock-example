package specs
import geb.spock.GebSpec
import pages.*


class HomePageSpec extends GebSpec{
	
	def "Make a search"(){
		
		given:
		println("Test initialized!")
		def searchString = "deneme"
		
		when:		
		to HomePage
		at HomePage
		
		and:
		searchField.value(searchString)
		
		then:
		searchField.value() == searchString
		
		when:
		logo.click()
		searchButton.click()
		
		then:
		searchField.value() == "deneme"
	}

}
