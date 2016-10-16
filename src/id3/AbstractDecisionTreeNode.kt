package id3

import id3.AbstractExample
import id3.ExampleSet
import java.util.*

/**
 * Created by tjurkowski on 09/10/2016.
 */
abstract class AbstractDecisionTreeNode {

    private var category: String? = null
    private var decisionPropertyName: String? = null
    private val children = HashMap<String, AbstractDecisionTreeNode>()

    constructor(examples: ExampleSet) {
        induceTree(examples, examples.getPropertyNames())
    }

    protected constructor(examples: ExampleSet, selectionProperties: Set<String>) {
        induceTree(examples, selectionProperties)
    }

    fun isLeaf(): Boolean {
        return children.isEmpty()
    }

    fun getCategory(): String {
        return category!!
    }

    fun getDecisionProperty(): String {
        return decisionPropertyName!!
    }

    fun getChild(propertyValue: String): AbstractDecisionTreeNode? {
        return children[propertyValue]
    }

    fun addChild(propertyValue: String, child: AbstractDecisionTreeNode) {
        children.put(propertyValue, child)
    }

    fun induceTree(examples: ExampleSet, selectionProperties: Set<String>) {
        // Case 1: All instances the same category, this node is a leaf.
        if (examples.getCategories().size == 1) {
            category = examples.getCategories().iterator().next()
            return
        }

        // Case 2: Empty example set. Create leaf with no classification.
        if (examples.isEmpty()) {
            return
        }

        // Case 3: Empty property set. Could not classify.
        if (selectionProperties.isEmpty()) {
            return
        }

        // Case 4: Choose test (property that produces the best possible partition) ...
        var bestPropertyName = selectionProperties.first()
        var bestPartition = examples.partition(bestPropertyName)
        var bestPartitionEvaluation = evaluatePartitionQuality(bestPartition, examples)

        for (property in selectionProperties) {
            val partition = examples.partition(property)
            val partitionInfoGain = evaluatePartitionQuality(partition, examples)
            if (partitionInfoGain > bestPartitionEvaluation) {
                bestPartitionEvaluation = partitionInfoGain
                bestPartition = partition
                bestPropertyName = property
            }
        }
        decisionPropertyName = bestPropertyName

        // ... and build subtrees using that test.
        val newSelectionPropertySet = HashSet(selectionProperties)
        newSelectionPropertySet.remove(decisionPropertyName)

        for((propertyValue, partitionExamples) in bestPartition) {
            children.put(propertyValue, createChildNode(partitionExamples, newSelectionPropertySet))
        }
    }

    fun categorize(ex: AbstractExample): String? {
        if (children.isEmpty()) {
            return category
        }

        if (decisionPropertyName == null) {
            return category
        }

        val prop = ex.getProperty(decisionPropertyName!!)
        val child = children[prop.getValue()]

        return child?.categorize(ex)
    }

    fun printTree(level: Int) {
        val sb = StringBuilder()

        for (i in 0..level - 1) {
            sb.append("    ")
        }
        val indent = sb.toString()

        if (isLeaf()) {
            println(indent + "Leaf Node. Category = " + category)
            return
        }

        println(indent + "Property = " + decisionPropertyName)
        for((propertyValue, child) in children) {
            println(indent + decisionPropertyName + " = " + propertyValue)
            child.printTree(level + 1)
        }
    }

    internal abstract fun evaluatePartitionQuality(partition: HashMap<String, ExampleSet>, examples: ExampleSet): Double

    internal abstract fun createChildNode(examples: ExampleSet, selectionProperties: Set<String>): AbstractDecisionTreeNode
}