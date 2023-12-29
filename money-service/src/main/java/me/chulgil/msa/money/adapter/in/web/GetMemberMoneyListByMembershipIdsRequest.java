package me.chulgil.msa.money.adapter.in.web;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetMemberMoneyListByMembershipIdsRequest {
    private List<String> membershipIds;
}