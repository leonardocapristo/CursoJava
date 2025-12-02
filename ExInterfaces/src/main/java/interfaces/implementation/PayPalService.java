package interfaces.implementation;

import interfaces.OnlinePaymentService;

public class PayPalService implements OnlinePaymentService {
    @Override
    public double paymentFee() {
        return 0;
    }

    @Override
    public double interest() {
        return 0;
    }
}
