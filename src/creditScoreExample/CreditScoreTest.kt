package creditScoreExample

import id3.ExampleSet
import id3.InformationTheoreticDecisionTreeNode

/**
 * Created by tjurkowski on 16/10/2016.
 */
fun main(args: Array<String>) {
    val exampleSet = ExampleSet()
    try {
        // Example 1
        var example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.BAD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.LOW_INCOME))
                exampleSet.addExample(example)

        // Example 2
        example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.UNKNOWN),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.MEDIUM_INCOME))
                exampleSet.addExample(example)

        // Example 3
        example = CreditExample(
                CreditExample.MODERATE,
                CreditHistoryProperty(CreditHistoryProperty.UNKNOWN),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.MEDIUM_INCOME))
                exampleSet.addExample(example)

        // Example 4
        example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.UNKNOWN),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.LOW_INCOME))
                exampleSet.addExample(example)

        // Example 5
        example = CreditExample(
                CreditExample.LOW,
                CreditHistoryProperty(CreditHistoryProperty.UNKNOWN),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 6
        example = CreditExample(
                CreditExample.LOW,
                CreditHistoryProperty(CreditHistoryProperty.UNKNOWN),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.ADEQUATE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 7
        example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.BAD),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.LOW_INCOME))
                exampleSet.addExample(example)

        // Example 8
        example = CreditExample(
                CreditExample.MODERATE,
                CreditHistoryProperty(CreditHistoryProperty.BAD),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.ADEQUATE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 9
        example = CreditExample(
                CreditExample.LOW,
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 10
        example = CreditExample(
                CreditExample.LOW,
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.ADEQUATE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 11
        example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.LOW_INCOME))
                exampleSet.addExample(example)

        // Example 12
        example = CreditExample(
                CreditExample.MODERATE,
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.MEDIUM_INCOME))
                exampleSet.addExample(example)

        // Example 13
        example = CreditExample(
                CreditExample.LOW,
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.HIGH_INCOME))
                exampleSet.addExample(example)

        // Example 14
        example = CreditExample(
                CreditExample.HIGH,
                CreditHistoryProperty(CreditHistoryProperty.BAD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.NONE),
                IncomeProperty(IncomeProperty.MEDIUM_INCOME))
                exampleSet.addExample(example)

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

        example = CreditExample(
                CreditHistoryProperty(CreditHistoryProperty.BAD),
                DebtProperty(DebtProperty.HIGH),
                CollateralProperty(CollateralProperty.ADEQUATE),
                IncomeProperty(IncomeProperty.MEDIUM_INCOME))

        var cat = tree.categorize(example)

        println()
        println(cat)

        example = CreditExample(
                CreditHistoryProperty(CreditHistoryProperty.GOOD),
                DebtProperty(DebtProperty.LOW),
                CollateralProperty(CollateralProperty.ADEQUATE),
                IncomeProperty(IncomeProperty.LOW_INCOME))

        cat = tree.categorize(example)

        println()
        println(cat)
    } catch (e: Exception) {
            println("Exception" + e)
    }
}
