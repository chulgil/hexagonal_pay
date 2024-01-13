package me.chulgil.msa.settlement.adapter.out.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class RegisteredBankAccount {
    private String registeredBankAccountId;

    private String membershipId;

    private String bankName;

    private String bankAccountNumber;
    private boolean linkedStatusIsValid;
    private String aggregateIdentifier;
}