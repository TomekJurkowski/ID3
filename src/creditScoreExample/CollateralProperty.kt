package creditScoreExample

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class CollateralProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return COLLATERAL
    }

    override fun isLegalValue(value: String): Boolean {
        return value == NONE || value == ADEQUATE
    }

    companion object {
        val COLLATERAL = "Collateral"

        val NONE = "none"
        val ADEQUATE = "adequate"
    }
}

