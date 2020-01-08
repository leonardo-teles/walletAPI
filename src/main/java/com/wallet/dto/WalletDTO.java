package com.wallet.dto;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class WalletDTO {

	private Long id;
	
	@Length(min = 3)
	@NotNull
	private String name;
	
	@NotNull
	private BigDecimal value;
}
