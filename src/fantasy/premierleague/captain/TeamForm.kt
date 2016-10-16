package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class TeamForm(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return TEAM_FORM
    }

    override fun isLegalValue(value: String): Boolean {
        return value == ZERO_POINTS || value == ONE_POINT || value == TWO_POINTS || value == THREE_POINTS
                || value == FOUR_POINTS || value == FIVE_POINTS || value == SIX_POINTS || value == SEVEN_POINTS
                || value == NINE_POINTS
    }

    companion object {
        val TEAM_FORM = "Team's form (points from last 3 games)"

        val ZERO_POINTS = "0 pts"
        val ONE_POINT = "1 pt"
        val TWO_POINTS = "2 pt"
        val THREE_POINTS = "3 pt"
        val FOUR_POINTS = "4 pt"
        val FIVE_POINTS = "5 pt"
        val SIX_POINTS = "6 pt"
        val SEVEN_POINTS = "7 pt"
        val NINE_POINTS = "9 pt"
    }
}