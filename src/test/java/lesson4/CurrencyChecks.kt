package lesson4

fun isCurrencyAvailableToSpend(currencyAmount: CurrencyAmount) {
    currencyAmount.availableToSpend?.let {
        println("You've got $it${currencyAmount.symbol} ${currencyAmount.name} available to spend")
    } ?: println("The remaining amount of ${currencyAmount.name} is unknown")
}

fun replaceTheFieldIfNull(currencyAmount: CurrencyAmount): CurrencyAmount {
    return currencyAmount.copy(
        name = currencyAmount.name ?: run {
            println("Название валюты не указано. Используем значение по умолчанию")
            "Unknown"
        },
        symbol = currencyAmount.symbol ?: run {
            println("Символ валюты не указан. Используем значение по умолчанию")
            '?'
        },
        availableToSpend = currencyAmount.availableToSpend ?: run {
            println("Доступное количество валюты не указано. Используем значение по умолчанию")
            0
        }
    )
}