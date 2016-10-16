package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class HealthProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return HEALTH
    }

    override fun isLegalValue(value: String): Boolean {
        return value == SERIOUS_INJURY || value == INJURY || value == MINOR_INJURY
                || value == SLIGHT_HEALTH_PROBLEMS || value == HEALTHY
    }

    companion object {
        val HEALTH = "Health"

        val SERIOUS_INJURY = "0"
        val INJURY = "25"
        val MINOR_INJURY = "50"
        val SLIGHT_HEALTH_PROBLEMS = "75"
        val HEALTHY = "100"
    }
}