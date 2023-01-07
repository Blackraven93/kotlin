package cookbook

import org.jetbrains.annotations.NotNull
import java.text.NumberFormat

fun main() {
    val product = Product()
    product.log()
}

class Product {
    fun addProduct(name: String, price: Double = 0.0, desc: String? = null) =
        "Adding product with $name ${desc ?: "None"}, and " +
                NumberFormat.getCurrencyInstance().format(price)
    fun log() {
        println(Product().addProduct("Raven", 5.5))
    }

//    @Test
//    internal fun `check all overloads`() {
//        assertAll("Overloads called from Kotlin",
//            { println(addProduct("Name", 5.0, "Desc")) },
//            { println(addProduct("Name", 5.0)) },
//            { println(addProduct("Name")) },
//        )
//    }
}

