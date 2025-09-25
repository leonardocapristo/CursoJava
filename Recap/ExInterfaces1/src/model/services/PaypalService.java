package model.services;

public class PaypalService implements OnlinePaymentService {


	
	
	
    public PaypalService() {
	}


	@Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;  // Taxa de 2% sobre o valor
    }


    @Override
    public Double interest(Double amount, Integer months) {
        return amount * 0.01 * months;  // Juros de 1% por mês
    }
}
