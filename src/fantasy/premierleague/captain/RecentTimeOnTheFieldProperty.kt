package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class RecentTimeOnTheFieldProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return RECENT_TIME_ON_THE_FIELD
    }

    override fun isLegalValue(value: String): Boolean {
        return value == ZERO || value == LESS_THAN_45 || value == BETWEEN_45_AND_90 || value == BETWEEN_91_AND_135
                || value == BETWEEN_151_AND_210 || value == BETWEEN_225_AND_270 || value == OVER_270
    }

    companion object {
        val RECENT_TIME_ON_THE_FIELD = "Player's time on the field in the last 3 games"

        val ZERO = "0 minutes"
        val LESS_THAN_45 = "(0, 45] minutes"
        val BETWEEN_45_AND_90 = "(45, 90] minutes"
        val BETWEEN_91_AND_135 = "(90, 135] minutes"
        val BETWEEN_151_AND_210 = "135, 180] minutes"
        val BETWEEN_225_AND_270 = "(225, 270] minutes"
        val OVER_270 = "over 270 minutes"
    }
}