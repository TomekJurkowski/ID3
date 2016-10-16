package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class RecentPointsProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return RECENT_POINTS
    }

    override fun isLegalValue(value: String): Boolean {
        return value == LESS_THAN_7 || value == BETWEEN_7_AND_12 || value == BETWEEN_13_AND_18
                || value == BETWEEN_19_AND_24 || value == BETWEEN_25_AND_32 || value == BETWEEN_33_AND_40
                || value == MORE_THAN_40
    }

    companion object {
        val RECENT_POINTS = "Player's points from the last 3 games"

        val LESS_THAN_7 = "Less than 7 points"
        val BETWEEN_7_AND_12 = "Between 7 and 12 points"
        val BETWEEN_13_AND_18 = "Between 13 and 18 points"
        val BETWEEN_19_AND_24 = "Between 19 and 24 points"
        val BETWEEN_25_AND_32 = "Between 25 and 32 points"
        val BETWEEN_33_AND_40 = "Between 33 and 40 points"
        val MORE_THAN_40 = "More than 40 points"

    }
}