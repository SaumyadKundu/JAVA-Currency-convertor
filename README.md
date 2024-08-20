# Currency Converter

This Java program converts an amount of money from one currency to another using predefined exchange rates.

## Features

- Converts between various currencies using predefined exchange rates.
- Handles user input for the currencies and amount to convert.
- Displays the result of the conversion.

## Code Explanation

### Imports

- `Scanner` is used to take user input.
- `HashMap` and `Map` are used to store and manage exchange rates.

### Exchange Rates Setup

- `exchangeRates` is a static `HashMap` that contains predefined exchange rates for various currencies with respect to USD.

### Main Method

- Prompts the user to enter the source and target currencies and the amount to convert.
- Calls `convertCurrency` to perform the conversion.
- Displays the converted amount.

### Convert Currency Method

- Retrieves the exchange rates for the source and target currencies.
- Converts the amount from the source currency to the base currency (USD).
- Converts the amount from the base currency (USD) to the target currency.
- Returns the converted amount.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
