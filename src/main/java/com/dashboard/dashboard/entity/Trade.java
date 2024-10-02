package com.dashboard.dashboard.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tr_trades")
public class Trade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traderId;

    private String firstName;

    private String lastName;

    @Column(unique=true, nullable = false)
    private String emailAddress;

    private String dayName;

    private String resultTrade;

    private String directionTrade;

    private String assetTrade;

    private Double amountTrade;

    private Float lotTrade;

    private Double balanceTrade;

}
