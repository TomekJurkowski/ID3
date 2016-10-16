package fantasy.premierleague.captain

import id3.AbstractExample
import id3.AbstractProperty
import java.util.*

/**
 * Created by tjurkowski on 16/10/2016.
 */
class CaptainExample : AbstractExample {

    constructor(category: String, vararg propertyList: AbstractProperty) : super(category, *propertyList) {
    }

    constructor(vararg propertyList: AbstractProperty) : super(*propertyList) {
    }

    override fun getPropertyNames(): MutableSet<String> {
        val names = HashSet<String>()
        names.add(GameVenueProperty.GAME_VENUE)
        names.add(HealthProperty.HEALTH)
        names.add(PositionProperty.POSITION)
        names.add(RecentPointsProperty.RECENT_POINTS)
        names.add(RecentTimeOnTheFieldProperty.RECENT_TIME_ON_THE_FIELD)
        names.add(TeamFormProperty.TEAM_FORM)
        names.add(OpponentsFormProperty.OPPONENTS_FORM)

        return names
    }

    override fun isLegalCategory(cat: String?): Boolean {
        return cat == null || cat == GOOD_CAPTAIN_CANDIDATE || cat == MEDIOCRE_CAPTAIN_CANDIDATE || cat == BAD_CAPTAIN_CANDIDATE
    }

    companion object {
        val GOOD_CAPTAIN_CANDIDATE = "good captain candidate"
        val MEDIOCRE_CAPTAIN_CANDIDATE = "mediocre captain candidate"
        val BAD_CAPTAIN_CANDIDATE = "bad captain candidate"
    }
}