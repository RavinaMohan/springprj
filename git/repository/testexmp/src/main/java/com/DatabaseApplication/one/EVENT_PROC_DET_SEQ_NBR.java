package com.DatabaseApplication.one;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EVENT_PROC_DET_SEQ_NBR {
	   @Id
	   private int EVENT_DET_SEQ_NBR;
	   private long EVENT_SEQ_NBR;
	   private int PRODUCT_COMP_INST_ID;
	   private int CHARGE_AMT;
	   private int ACCOUNT_ID;
	   private int STATUS;
	   private int START_TIME;
	   private int END_TIME;
	   private int SOURCE_TIME;
	public int getEVENT_DET_SEQ_NBR() {
		return EVENT_DET_SEQ_NBR;
	}
	public void setEVENT_DET_SEQ_NBR(int eVENT_DET_SEQ_NBR) {
		EVENT_DET_SEQ_NBR = eVENT_DET_SEQ_NBR;
	}
	public long getEVENT_SEQ_NBR() {
		return EVENT_SEQ_NBR;
	}
	public void setEVENT_SEQ_NBR(long eVENT_SEQ_NBR) {
		EVENT_SEQ_NBR = eVENT_SEQ_NBR;
	}
	public int getPRODUCT_COMP_INST_ID() {
		return PRODUCT_COMP_INST_ID;
	}
	public void setPRODUCT_COMP_INST_ID(int pRODUCT_COMP_INST_ID) {
		PRODUCT_COMP_INST_ID = pRODUCT_COMP_INST_ID;
	}
	public int getCHARGE_AMT() {
		return CHARGE_AMT;
	}
	public void setCHARGE_AMT(int cHARGE_AMT) {
		CHARGE_AMT = cHARGE_AMT;
	}
	public int getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	public void setACCOUNT_ID(int aCCOUNT_ID) {
		ACCOUNT_ID = aCCOUNT_ID;
	}
	public int getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	public int getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(int sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public int getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(int eND_TIME) {
		END_TIME = eND_TIME;
	}
	public int getSOURCE_TIME() {
		return SOURCE_TIME;
	}
	public void setSOURCE_TIME(int sOURCE_TIME) {
		SOURCE_TIME = sOURCE_TIME;
	}
	@Override
	public String toString() {
		return "EVENT_PROC_DET_SEQ_NBR [EVENT_DET_SEQ_NBR=" + EVENT_DET_SEQ_NBR + ", EVENT_SEQ_NBR=" + EVENT_SEQ_NBR
				+ ", PRODUCT_COMP_INST_ID=" + PRODUCT_COMP_INST_ID + ", CHARGE_AMT=" + CHARGE_AMT + ", ACCOUNT_ID="
				+ ACCOUNT_ID + ", STATUS=" + STATUS + ", START_TIME=" + START_TIME + ", END_TIME=" + END_TIME
				+ ", SOURCE_TIME=" + SOURCE_TIME + "]";
	}
	   

}
