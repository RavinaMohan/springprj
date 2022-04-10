package com.DatabaseApplication.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EVENT")
public class EventTest { 
	@Column (name = "EVENT_SEQ_NBR")
	
	@Id
	private long evntSeqNbr; 
	@Column(name="EVENT_TYPE")
	private String eventType ;
	@Column(name="ACCOUNT_ID")
	private int accountId;
	@Column(name="CURRENCY")
	private int currency;
	@Column(name="DESCR")
	private int descr;
	@Column(name="START_TIME")
	private int startTime;
	@Column(name="END_TIME")
	private int endTime;
	@Column(name="AMT_INC_TAX")
	private int amtIncTax;
	@Column(name="AMT_EXCL_TAX")
	private int amtExclTax;
	@Column(name="TAX_AMT")
	private int taxAmt;
	@Column(name="DISCOUNT_AMT")
	private int discountAmt;
	@Column(name="CHARGES_WITH_ROUND")
	private int chargesWithRound;
	@Column(name="CHARGE_AMT")
	private int chargeAmt; 
	public String toString(){
		return eventType;
		
	}
	
	
	
	
	
	
}
