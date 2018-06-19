import com.example.demo.AddOperation
import org.junit.Test
import org.junit.Assert.*

class AddNumberTest {
    @Test
    fun one_add_one_should_return2() {
        val addOperation = AddOperation()
        val actualResult = addOperation.calculate(1, 1)
        assertEquals(2.0, actualResult, 0.000)
    }


    @Test
    fun two_add_two_should_return4() {
        val addOperation = AddOperation()
        val actualResult = addOperation.calculate(2, 2)
        assertEquals(4.0, actualResult, 0.000)
    }
}
