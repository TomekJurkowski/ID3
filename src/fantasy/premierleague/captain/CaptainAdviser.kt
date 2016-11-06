package fantasy.premierleague.captain

import id3.ExampleSet
import id3.InformationTheoreticDecisionTreeNode

/**
 * Created by tjurkowski on 16/10/2016.
 */
fun main(args: Array<String>) {
    val exampleSet = ExampleSet()
    try {
        var example = CaptainExample("Artur Boruc",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.GOALKEEPER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ZERO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Daley Blind",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.TWO_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ONE_POINT))
        exampleSet.addExample(example)

        example = CaptainExample("Laurent Koscielny",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.THREE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Kyle Walker",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.THREE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Philippe Coutinho",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Etienne Capoue",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Michail Antonio",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SIX_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.NINE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Leroy Fer",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_135_AND_180),
                TeamFormProperty(TeamFormProperty.ONE_POINT),
                OpponentsFormProperty(OpponentsFormProperty.TWO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Alexis Sánchez",
                CaptainExample.GOOD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.THREE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Romelu Lukaku",
                CaptainExample.GOOD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_25_AND_32),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.FOUR_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.NINE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Jermain Defoe",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.ZERO_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Tom Heaton",
                CaptainExample.GOOD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.GOALKEEPER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.FOUR_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ZERO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Salomón Rondón",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.ONE_POINT),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Adam Smith",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ZERO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Gareth McAuley",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.ONE_POINT),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Thibaut Courtois",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.GOALKEEPER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("César Azpilicueta",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Diego Costa",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Eden Hazard",
                CaptainExample.GOOD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_25_AND_32),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Roberto Firmino",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Sergio Agüero",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_180_AND_225),
                TeamFormProperty(TeamFormProperty.FIVE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Sam Vokes",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.FOUR_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ZERO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Lukasz Fabianski",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.GOALKEEPER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.ONE_POINT),
                OpponentsFormProperty(OpponentsFormProperty.TWO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Petr Cech",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.GOALKEEPER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_7_AND_12),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.THREE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Steve Cook",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ZERO_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Marcos Alonso",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Joe Allen",
                CaptainExample.GOOD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_25_AND_32),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SIX_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("James Milner",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.MINOR_INJURY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_135_AND_180),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Nacer Chadli",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.ONE_POINT),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Mesut Özil",
                CaptainExample.MEDIOCRE_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_13_AND_18),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.THREE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Xherdan Shaqiri",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_19_AND_24),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_180_AND_225),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SIX_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Paul Pogba",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.TWO_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.ONE_POINT))
        exampleSet.addExample(example)

        example = CaptainExample("Erik Lamela",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.HOME_GAME),
                HealthProperty(HealthProperty.SERIOUS_INJURY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_135_AND_180),
                TeamFormProperty(TeamFormProperty.THREE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Santiago Cazorla",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.INJURY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_45_AND_90),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.THREE_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Mamadou Sakho",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.INJURY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Joseph Gomez",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.INJURY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Danny Ings",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.SERIOUS_INJURY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Divock Origi",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Daniel Sturridge",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.FORWARD),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        example = CaptainExample("Oluwaseyi Ojo",
                CaptainExample.BAD_CAPTAIN_CANDIDATE,
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.SERIOUS_INJURY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        exampleSet.addExample(example)

        println()
        println("example count = ${exampleSet.getSize()}")

        for (i in 0..exampleSet.getSize() - 1) {
            val e = exampleSet.getExample(i)
            println("Example $i:\t$e")
        }

        println()
        println("Categories: ${exampleSet.getCategories()}")

        println()
        println("Properties: ${exampleSet.getPropertyNames()}")

        val tree = InformationTheoreticDecisionTreeNode(exampleSet)

        tree.induceTree(exampleSet, exampleSet.getPropertyNames())

        println()
        println("Generated tree:")
        println()
        tree.printTree(0)

        example = CaptainExample("Eden Hazard",
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.HEALTHY),
                PositionProperty(PositionProperty.MIDFIELDER),
                RecentPointsProperty(RecentPointsProperty.BETWEEN_25_AND_32),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.BETWEEN_225_AND_270),
                TeamFormProperty(TeamFormProperty.NINE_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.FOUR_POINTS))
        var cat = tree.categorize(example)

        println()
        println("${example.playerName} is a $cat")

        example = CaptainExample("Mamadou Sakho",
                GameVenueProperty(GameVenueProperty.AWAY_GAME),
                HealthProperty(HealthProperty.INJURY),
                PositionProperty(PositionProperty.DEFENDER),
                RecentPointsProperty(RecentPointsProperty.LESS_THAN_7),
                RecentTimeOnTheFieldProperty(RecentTimeOnTheFieldProperty.LESS_THAN_45),
                TeamFormProperty(TeamFormProperty.SEVEN_POINTS),
                OpponentsFormProperty(OpponentsFormProperty.SEVEN_POINTS))
        cat = tree.categorize(example)

        println()
        println("${example.playerName} is a $cat")
    } catch (e: Exception) {
        println("Exception" + e)
    }
}
