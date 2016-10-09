import java.util.*

/**
 * Created by tjurkowski on 09/10/2016.
 */
abstract class AbstractExample {

    private var category: String? = null
    private val properties = HashMap<String, AbstractProperty>()

    constructor(category : String?, vararg propertyList: AbstractProperty) {
        if (!isLegalCategory(category)) {
            throw IllegalArgumentException(category + "is an illegal category for the example")
        }

        this.category = category
        addProperties(*propertyList)
    }

    constructor(vararg propertyList: AbstractProperty) {
        addProperties(*propertyList)
    }

    private fun addProperties(vararg propertyList: AbstractProperty) {
        val requiredProps = getPropertyNames()

        for (prop in propertyList) {
            if (!requiredProps.contains(prop.getName())) {
                throw IllegalArgumentException(prop.getName() + "is an illegal Property for example.")
            }

            properties.put(prop.getName(), prop)
            requiredProps.remove(prop.getName())
        }

        if (!requiredProps.isEmpty()) {
            val p = requiredProps.toTypedArray()
            val sb = StringBuilder()

            for (aP in p) {
                sb.append(aP).append(" ")
            }
            throw IllegalArgumentException("Missing Properties in example: " + sb.toString())
        }
    }

    fun getProperty(name: String): AbstractProperty {
        return properties[name]!!
    }

    fun getCategory(): String? {
        return category
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append(category)

        val props = properties.values

        for (p in props) {
            sb.append(", ").append(p.getName()).append("=").append(p.getValue())
        }

        return sb.toString()
    }

    abstract fun getPropertyNames(): MutableSet<String>

    abstract fun isLegalCategory(cat: String?): Boolean
}