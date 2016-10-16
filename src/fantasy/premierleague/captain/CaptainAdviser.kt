package fantasy.premierleague.captain

import id3.ExampleSet
import id3.InformationTheoreticDecisionTreeNode

/**
 * Created by tjurkowski on 16/10/2016.
 */
fun main(args: Array<String>) {
    val exampleSet = ExampleSet()
    try {
        // TODO: add examples to exampleSet

        println()
        System.out.println("example count = " + exampleSet.getSize())

        for (i in 0..exampleSet.getSize() - 1) {
            val e = exampleSet.getExample(i)
            println("Example " + i + ": " + e.toString())
        }

        println()
        System.out.println(exampleSet.getCategories())

        println()
        System.out.println(exampleSet.getPropertyNames())
        val tree = InformationTheoreticDecisionTreeNode(exampleSet)

        tree.induceTree(exampleSet, exampleSet.getPropertyNames())
        tree.printTree(0)

        // TODO: test the tree with couple of uncategorized examples

    } catch (e: Exception) {
        println("Exception" + e)
    }
}
