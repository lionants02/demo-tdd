import com.example.demo.AddController
import com.example.demo.AddOperation
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.*

class AddControllerUnitTest {

    @Mock
    private var addOperation: AddOperation? = null
    private var controller: AddController? = null


    @Before
    fun initial() {
        MockitoAnnotations.initMocks(this)
        controller = AddController()
        controller!!.setAddOperation(addOperation)

        BDDMockito.given(addOperation!!.calculate(1, 1)).willReturn(2.0)

    }


    @Test
    fun test() {

        val controller = AddController()
        controller.setAddOperation(addOperation)
        val actualResult = controller.add(1, 1)
        Assert.assertEquals("2.0", actualResult)
    }
}