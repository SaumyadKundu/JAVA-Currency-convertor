import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

   
    private static final Map<String, Double> exchangeRates = new HashMap<>();
    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("AED", 3.6725);
        exchangeRates.put("AFN", 71.0212);
        exchangeRates.put("ALL", 92.6436);
        exchangeRates.put("AMD", 387.9728);
        exchangeRates.put("ANG", 1.7900);
        exchangeRates.put("AOA", 878.0962);
        exchangeRates.put("ARS", 921.7500);
        exchangeRates.put("AUD", 1.4745);
        exchangeRates.put("AWG", 1.7900);
        exchangeRates.put("AZN", 1.7003);
        exchangeRates.put("BAM", 1.7951);
        exchangeRates.put("BBD", 2.0000);
        exchangeRates.put("BDT", 117.5290);
        exchangeRates.put("BGN", 1.7952);
        exchangeRates.put("BHD", 0.3760);
        exchangeRates.put("BIF", 2876.8463);
        exchangeRates.put("BMD", 1.0000);
        exchangeRates.put("BND", 1.3419);
        exchangeRates.put("BOB", 6.9258);
        exchangeRates.put("BRL", 5.4376);
        exchangeRates.put("BSD", 1.0000);
        exchangeRates.put("BTN", 83.5386);
        exchangeRates.put("BWP", 13.5070);
        exchangeRates.put("BYN", 3.2600);
        exchangeRates.put("BZD", 2.0000);
        exchangeRates.put("CAD", 1.3624);
        exchangeRates.put("CDF", 2833.7387);
        exchangeRates.put("CHF", 0.8947);
        exchangeRates.put("CLP", 913.7551);
        exchangeRates.put("CNY", 7.2677);
        exchangeRates.put("COP", 3986.9048);
        exchangeRates.put("CRC", 527.9180);
        exchangeRates.put("CUP", 24.0000);
        exchangeRates.put("CVE", 101.2061);
        exchangeRates.put("CZK", 23.2668);
        exchangeRates.put("DJF", 177.7210);
        exchangeRates.put("DKK", 6.8468);
        exchangeRates.put("DOP", 59.0596);
        exchangeRates.put("DZD", 134.3317);
        exchangeRates.put("EGP", 47.9990);
        exchangeRates.put("ERN", 15.0000);
        exchangeRates.put("ETB", 57.8841);
        exchangeRates.put("EUR", 0.9178);
        exchangeRates.put("FJD", 2.2521);
        exchangeRates.put("FKP", 0.7710);
        exchangeRates.put("FOK", 6.8468);
        exchangeRates.put("GBP", 0.7710);
        exchangeRates.put("GEL", 2.7260);
        exchangeRates.put("GGP", 0.7710);
        exchangeRates.put("GHS", 15.4918);
        exchangeRates.put("GIP", 0.7710);
        exchangeRates.put("GMD", 64.2926);
        exchangeRates.put("GNF", 8641.8559);
        exchangeRates.put("GTQ", 7.7608);
        exchangeRates.put("GYD", 209.2907);
        exchangeRates.put("HKD", 7.8076);
        exchangeRates.put("HNL", 24.7703);
        exchangeRates.put("HRK", 6.9155);
        exchangeRates.put("HTG", 131.7884);
        exchangeRates.put("HUF", 360.0765);
        exchangeRates.put("IDR", 16133.4564);
        exchangeRates.put("ILS", 3.6150);
        exchangeRates.put("IMP", 0.7710);
        exchangeRates.put("INR", 83.5386);
        exchangeRates.put("IQD", 1309.2224);
        exchangeRates.put("IRR", 42062.7679);
        exchangeRates.put("ISK", 137.0694);
        exchangeRates.put("JEP", 0.7710);
        exchangeRates.put("JMD", 156.7712);
        exchangeRates.put("JOD", 0.7090);
        exchangeRates.put("JPY", 158.1964);
        exchangeRates.put("KES", 129.0605);
        exchangeRates.put("KGS", 86.1408);
        exchangeRates.put("KHR", 4126.5567);
        exchangeRates.put("KID", 1.4745);
        exchangeRates.put("KMF", 451.5499);
        exchangeRates.put("KRW", 1373.9867);
        exchangeRates.put("KWD", 0.3057);
        exchangeRates.put("KYD", 0.8333);
        exchangeRates.put("KZT", 474.0628);
        exchangeRates.put("LAK", 21989.3670);
        exchangeRates.put("LBP", 89500.0000);
        exchangeRates.put("LKR", 302.5044);
        exchangeRates.put("LRD", 194.7918);
        exchangeRates.put("LSL", 17.9679);
        exchangeRates.put("LYD", 4.8557);
        exchangeRates.put("MAD", 9.8191);
        exchangeRates.put("MDL", 17.7626);
        exchangeRates.put("MGA", 4497.8824);
        exchangeRates.put("MKD", 56.5275);
        exchangeRates.put("MMK", 2098.5349);
        exchangeRates.put("MNT", 3429.6972);
        exchangeRates.put("MOP", 8.0418);
        exchangeRates.put("MRU", 39.6790);
        exchangeRates.put("MUR", 46.5559);
        exchangeRates.put("MVR", 15.4358);
        exchangeRates.put("MWK", 1745.7246);
        exchangeRates.put("MXN", 17.6707);
        exchangeRates.put("MYR", 4.6779);
        exchangeRates.put("MZN", 63.9131);
        exchangeRates.put("NAD", 17.9679);
        exchangeRates.put("NGN", 1581.5476);
        exchangeRates.put("NIO", 36.8115);
        exchangeRates.put("NOK", 10.7235);
        exchangeRates.put("NPR", 133.6618);
        exchangeRates.put("NZD", 1.6350);
        exchangeRates.put("OMR", 0.3845);
        exchangeRates.put("PAB", 1.0000);
        exchangeRates.put("PEN", 3.7857);
        exchangeRates.put("PGK", 3.8773);
        exchangeRates.put("PHP", 58.3801);
        exchangeRates.put("PKR", 279.0063);
        exchangeRates.put("PLN", 3.9078);
        exchangeRates.put("PYG", 7503.9761);
        exchangeRates.put("QAR", 3.6400);
        exchangeRates.put("RON", 4.5660);
        exchangeRates.put("RSD", 107.4698);
        exchangeRates.put("RUB", 87.6088);
        exchangeRates.put("RWF", 1323.4512);
        exchangeRates.put("SAR", 3.7500);
        exchangeRates.put("SBD", 8.2620);
        exchangeRates.put("SCR", 13.7103);
        exchangeRates.put("SDG", 509.6180);
        exchangeRates.put("SEK", 10.5314);
        exchangeRates.put("SGD", 1.3419);
        exchangeRates.put("SHP", 0.7710);
        exchangeRates.put("SLE", 23.5047);
        exchangeRates.put("SLL", 23504.7229);
        exchangeRates.put("SOS", 572.0766);
        exchangeRates.put("SRD", 30.1272);
        exchangeRates.put("SSP", 2068.3281);
        exchangeRates.put("STN", 22.4872);
        exchangeRates.put("SYP", 12889.9635);
        exchangeRates.put("SZL", 17.9679);
        exchangeRates.put("THB", 36.1698);
        exchangeRates.put("TJS", 10.6882);
        exchangeRates.put("TMT", 3.5003);
        exchangeRates.put("TND", 3.1245);
        exchangeRates.put("TOP", 2.3328);
        exchangeRates.put("TRY", 33.0361);
        exchangeRates.put("TTD", 6.7556);
        exchangeRates.put("TVD", 1.4745);
        exchangeRates.put("TWD", 32.4732);
        exchangeRates.put("TZS", 2648.9133);
        exchangeRates.put("UAH", 41.0393);
        exchangeRates.put("UGX", 3700.1655);
        exchangeRates.put("UYU", 40.0104);
        exchangeRates.put("UZS", 12671.2488);
        exchangeRates.put("VES", 36.5243);
        exchangeRates.put("VND", 25434.3608);
        exchangeRates.put("VUV", 119.6189);
        exchangeRates.put("WST", 2.7193);
        exchangeRates.put("XAF", 602.0665);
        exchangeRates.put("XCD", 2.7000);
        exchangeRates.put("XDR", 0.7549);
        exchangeRates.put("XOF", 602.0665);
        exchangeRates.put("XPF", 109.5282);
        exchangeRates.put("YER", 250.3245);
        exchangeRates.put("ZAR", 17.9679);
        exchangeRates.put("ZMW", 25.4325);
        exchangeRates.put("ZWL", 13.7634);
        
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

           
            System.out.print("Enter the currency to convert from (e.g., USD): ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Enter the currency to convert to (e.g., EUR): ");
            String toCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();

            double convertedAmount = convertCurrency(fromCurrency, toCurrency, amount);
            System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double convertCurrency(String fromCurrency, String toCurrency, double amount) {
        
        double exchangeRateFrom = exchangeRates.get(fromCurrency);
        double exchangeRateTo = exchangeRates.get(toCurrency);

        
        double amountInBaseCurrency = amount / exchangeRateFrom;
        double convertedAmount = amountInBaseCurrency * exchangeRateTo;

        return convertedAmount;
    }
}
