import com.example.demo.AddOperation
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner


//@RunWith(SpringRunner::class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddControllerMockTest {

    //@MockBean
    private var addOperation: AddOperation? = null


    //@Autowired
    private var rest: TestRestTemplate? = null

    @Test
    fun _1_add_1_should_be_2() {
        //BDDMockito.given(addOperation!!.calculate(1, 1)).willReturn(2.0)

        //val result = rest!!.getForObject("/add/1/1", String::class.java)
        //println("Result = $result")
        //Assert.assertEquals("2.0", result)

    }
}