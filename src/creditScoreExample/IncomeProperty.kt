package creditScoreExample

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class IncomeProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return INCOME
    }

    override fun isLegalValue(value: String): Boolean {
        return value == LOW_INCOME || value == MEDIUM_INCOME || value == HIGH_INCOME
    }

    companion object {
        val INCOME = "Income"

        val LOW_INCOME = "$0 to $15K"
        val MEDIUM_INCOME = "$15K to $35K"
        val HIGH_INCOME = "over $35K"
    }
}