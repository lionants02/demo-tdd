import com.example.demo.DevideOperationException
import com.example.demo.DivideOperation
import junit.framework.Assert
import org.junit.Test

class DivideNumberTest {
    val operation = DivideOperation()

    @Test(expected = DevideOperationException::class)
    fun should_throw_exception_with_divided_by_zero() {
        operation.calculate(2.0, 0.0)
    }

    @Test
    fun four_divide_2_should_be_2() {
        val actualResult = operation.calculate(4.0, 2.0)
        Assert.assertEquals(2.0, actualResult, 0.000)
    }
}
