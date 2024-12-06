//package quidex.currencyconverter.app.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import quidex.currencyconverter.app.api.APIClient;
//
//
//
//    @Service
//    public class CurrencyConversionServiceImpl implements CurrencyConverterService {
//
//        @Autowired
//        private ApiClient apiClient; // Assuming ApiClient is another service that calls an external API for exchange rates
//
//        @Override
//        public ConvertedAmountDTO convert(double amount, String fromCurrencyCode, String toCurrencyCode) {
//            // Call external API or use predefined rates to get exchange rate
//            double exchangeRate = apiClient.getExchangeRate(fromCurrencyCode, toCurrencyCode);
//
//            // Perform the conversion
//            double convertedAmount = amount * exchangeRate;
//
//            // Return the result as a DTO
//            return new ConvertedAmountDTO(fromCurrencyCode, toCurrencyCode, convertedAmount);
//        }
//
//        @Override
//        public double convertService(String from, String to, double amount) {
//            return 0;
//        }
//    }
//
//
//
//}






//    private APIClient apiClient;
//
//    public CurrencyConverterServiceImpl() {
//        apiClient = new APIClient();
//    }
//
//    @Override
//    public double convertService(String fromCurrency, String toCurrency, double amount) {
//        double rate = apiClient.getExchangeRate(fromCurrency, toCurrency);
//        return amount * rate;
//
//    }