package me.chulgil.msa.payment.application.service;


import me.chulgil.msa.common.UseCase;
import me.chulgil.msa.payment.application.port.in.RechargeMoneyCommand;
import me.chulgil.msa.payment.application.port.in.RechargeMoneyUseCase;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
public class RechargeMoney implements RechargeMoneyUseCase {

	@Override
	public void rechargeMoney(RechargeMoneyCommand command) {

	}
}




