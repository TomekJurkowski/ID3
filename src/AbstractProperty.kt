/**
 * Created by tjurkowski on 02/10/16.
 */
abstract class AbstractProperty(propertyValue: String) {

    private val value: String = propertyValue

    init {
        if (!isLegalValue(propertyValue)) {
            throw IllegalArgumentException(value + "is an illegal Property Value for " + getName())
        }
    }

    fun getValue(): String {
        return value
    }

    abstract fun isLegalValue(value: String): Boolean

    abstract fun getName(): String
}