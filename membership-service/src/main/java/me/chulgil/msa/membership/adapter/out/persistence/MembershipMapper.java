package me.chulgil.msa.membership.adapter.out.persistence;

import me.chulgil.msa.membership.domain.Membership;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {

    public Membership mapToDomainEntity(MembershipJpaEntity membershipJpaEntity) {
        return Membership.generateMember(
                new Membership.MembershipId(membershipJpaEntity.getMembershipId() + ""),
                new Membership.MembershipName(membershipJpaEntity.getName()),
                new Membership.MembershipEmail(membershipJpaEntity.getEmail()),
                new Membership.MembershipAddress(membershipJpaEntity.getAddress()),
                new Membership.MembershipIsValid(membershipJpaEntity.isValid()),
                new Membership.MembershipIsCorp(membershipJpaEntity.isCorp())
                                        );
    }
}
