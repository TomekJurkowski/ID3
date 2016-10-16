package fantasy.premierleague.captain

import id3.AbstractProperty

/**
 * Created by tjurkowski on 16/10/2016.
 */
class GameVenueProperty(propertyValue: String) : AbstractProperty(propertyValue) {

    override fun getName(): String {
        return GAME_VENUE
    }

    override fun isLegalValue(value: String): Boolean {
        return value == HOME_GAME || value == AWAY_GAME
    }

    companion object {
        val GAME_VENUE = "Game venue"

        val HOME_GAME = "Home"
        val AWAY_GAME = "Away"
    }
}