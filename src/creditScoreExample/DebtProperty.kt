package creditScoreExample

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class DebtProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return DEBT
    }

    override fun isLegalValue(value: String): Boolean {
        return value == HIGH || value == LOW
    }

    companion object {
        val DEBT = "Debt"

        val HIGH = "high"
        val LOW = "low"
    }
}