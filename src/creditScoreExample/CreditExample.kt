package creditScoreExample

import id3.AbstractExample
import id3.AbstractProperty
import java.util.*

/**
 * Created by tjurkowski on 16/10/2016.
 */
class CreditExample : AbstractExample {

    constructor(category: String, vararg propertyList: AbstractProperty) : super(category, *propertyList) {
    }

    constructor(vararg propertyList: AbstractProperty) : super(*propertyList) {
    }

    override fun getPropertyNames(): MutableSet<String> {
        val names = HashSet<String>()
        names.add(CollateralProperty.COLLATERAL)
        names.add(CreditHistoryProperty.CREDIT_HISTORY)
        names.add(DebtProperty.DEBT)
        names.add(IncomeProperty.INCOME)

        return names
    }

    override fun isLegalCategory(cat: String?): Boolean {
        return cat == null || cat == HIGH || cat == MODERATE || cat == LOW
    }

    companion object {
        val HIGH = "high"
        val MODERATE = "moderate"
        val LOW = "low"
    }
}

