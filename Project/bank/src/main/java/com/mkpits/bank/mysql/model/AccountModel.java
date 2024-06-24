package com.mkpits.bank.mysql.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class AccountModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer accountId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "account_type")
    private String accountType;
    @Column(name = "balance")
    private double balance;
    @Column(name = "rate_of_interest")
    private String rateOfIntrest;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


}
