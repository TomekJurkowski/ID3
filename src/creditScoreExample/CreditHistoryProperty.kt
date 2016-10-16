package creditScoreExample

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class CreditHistoryProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return CREDIT_HISTORY
    }

    override fun isLegalValue(value: String): Boolean {
        return value == GOOD || value == BAD || value == UNKNOWN
    }

    companion object {
        val CREDIT_HISTORY = "Credit History"

        val GOOD = "good"
        val BAD = "bad"
        val UNKNOWN = "unknown"
    }
}