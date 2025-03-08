package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	


	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}




	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}




	public void processContract(Contract contract, Integer months) {
		
		double amountPaymentFee = onlinePaymentService.paymentFee(contract.getTotalValue());
		double amountPerInstallment = contract.getTotalValue() / months;
		double amountInterest = onlinePaymentService.interest(amountPerInstallment, months);
		
		double amount = amountPerInstallment + amountInterest + amountPaymentFee;
		
		
		 for (int i = 1; i <= months; i++) {
	            LocalDate dueDate = contract.getDate().plusMonths(i);

	            Installment installment = new Installment(dueDate, amount);
	            
	            contract.getInstallments().add(installment);
	            
	            System.out.println(installment +""+ amount);
	            
	        }
		
		
		
		
		
		
		
	
		
		
	}

}
