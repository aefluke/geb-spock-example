package specs
import geb.spock.GebSpec
import pages.*


class HomePageSpec extends GebSpec{
	
	def "Make a search"(){
		
		given:
		println("Test initialized!")
		
		when:""		
		to HomePage
		"enter search key"("deneme")
		
		and:
		"click search"()
		
		then:
		assert searchField.value() == "deneme"
	}

}
