package id3

import java.util.*

/**
 * Created by tjurkowski on 09/10/2016.
 */
class ExampleSet {

    private val examples = Vector<AbstractExample>()
    private val categories = HashSet<String>()
    private var propertyNames: Set<String>? = null

    fun addExample(abstractExample: AbstractExample) {
        if (abstractExample.getCategory() == null) {
            throw IllegalArgumentException("Illegal example: all examples in an id3.ExampleSet must have a categorization.")
        }

        if (examples.isEmpty() || abstractExample.javaClass.kotlin == examples.firstElement().javaClass.kotlin) {
            examples.add(abstractExample)
            categories.add(abstractExample.getCategory()!!)
            if (propertyNames == null) {
                propertyNames = HashSet(abstractExample.getPropertyNames())
            }
        } else {
            throw IllegalArgumentException("Illegal example: all examples in an id3.ExampleSet must be of same type.")
        }
    }

    fun getSize(): Int {
        return examples.size
    }

    fun isEmpty(): Boolean {
        return examples.isEmpty()
    }

    fun getExample(index: Int): AbstractExample {
        return examples[index]
    }

    fun getCategories(): Set<String> {
        return HashSet(categories)
    }

    fun getPropertyNames(): Set<String> {
        return HashSet(propertyNames)
    }

    fun getExampleCountByCategory(category: String): Int {
        return examples.filter { it.getCategory().equals(category) }.count()
    }

    private fun getValues(propertyName: String): Set<String> {
        return examples.map { it.getProperty(propertyName).getValue() }.toSet()
    }

    private fun getExamplesByProperty(propertyName: String, value: String): ExampleSet {
        val exampleSet = ExampleSet()

        for (abstractExample in examples) {
            if (abstractExample.getProperty(propertyName).getValue() == value) {
                exampleSet.addExample(abstractExample)
            }
        }

        return exampleSet
    }

    fun partition(propertyName: String): HashMap<String, ExampleSet> {
        val partition = HashMap<String, ExampleSet>()

        val values = getValues(propertyName)

        for (value in values) {
            val examples = getExamplesByProperty(propertyName, value)
            partition.put(value, examples)
        }

        return partition
    }

}