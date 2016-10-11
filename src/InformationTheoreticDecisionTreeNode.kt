import java.util.*

/**
 * Created by tjurkowski on 11/10/2016.
 */
class InformationTheoreticDecisionTreeNode : AbstractDecisionTreeNode {

    constructor(examples: ExampleSet) : super(examples) {
    }

    constructor(examples: ExampleSet, selectionProperties: Set<String>) : super(examples, selectionProperties) {
    }

    override fun evaluatePartitionQuality(partition: HashMap<String, ExampleSet>, examples: ExampleSet): Double {
        val examplesInfo = computeInformation(examples)
        val totalSize = examples.getSize()

        var expectedInfo = 0.0

        for ((value, example) in partition) {
            expectedInfo += computeInformation(example) * example.getSize() / totalSize
        }

        return examplesInfo - expectedInfo
    }

    private fun  computeInformation(examples: ExampleSet): Double {
        val categories = examples.getCategories()
        var info = 0.0
        val totalCount = examples.getSize().toDouble()

        for (category in categories) {
            val categoryCount = examples.getExampleCountByCategory(category)

            info += -(categoryCount / totalCount) * log2(categoryCount / totalCount)
        }

        return info
    }

    private fun log2(n: Double): Double {
        return Math.log10(n) / Math.log10(2.0)
    }

    override fun createChildNode(examples: ExampleSet, selectionProperties: Set<String>): AbstractDecisionTreeNode {
        return InformationTheoreticDecisionTreeNode(examples, selectionProperties)
    }
}