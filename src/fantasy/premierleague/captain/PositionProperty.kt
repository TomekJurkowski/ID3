package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class PositionProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return POSITION
    }

    override fun isLegalValue(value: String): Boolean {
        return value == GOALKEEPER || value == DEFENDER || value == MIDFIELDER || value == FORWARD
    }

    companion object {
        val POSITION = "Player's position"

        val GOALKEEPER = "Goalkeeper"
        val DEFENDER = "Defender"
        val MIDFIELDER = "Midfielder"
        val FORWARD = "Forward"
    }
}