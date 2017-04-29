package com.kaipan.mems.domain;
// Generated 2017-4-27 21:51:34 by Hibernate Tools 4.0.1.Final

/**
 * Expensemedicine generated by hbm2java
 */
public class Expensemedicine implements java.io.Serializable {

	private ExpensemedicineId id;
	private Expense expense;
	private Medicine medicine;
	private String medicName;
	private Float medicUnitPrice;
	private Integer medicQuantity;
	private Boolean isDelete;

	public Expensemedicine() {
	}

	public Expensemedicine(ExpensemedicineId id, Expense expense, Medicine medicine) {
		this.id = id;
		this.expense = expense;
		this.medicine = medicine;
	}

	public Expensemedicine(ExpensemedicineId id, Expense expense, Medicine medicine, String medicName,
			Float medicUnitPrice, Integer medicQuantity,Boolean isDelete) {
		this.id = id;
		this.expense = expense;
		this.medicine = medicine;
		this.medicName = medicName;
		this.medicUnitPrice = medicUnitPrice;
		this.medicQuantity = medicQuantity;
		this.isDelete=isDelete;
	}

	public ExpensemedicineId getId() {
		return this.id;
	}

	public void setId(ExpensemedicineId id) {
		this.id = id;
	}

	public Expense getExpense() {
		return this.expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public Medicine getMedicine() {
		return this.medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public String getMedicName() {
		return this.medicName;
	}

	public void setMedicName(String medicName) {
		this.medicName = medicName;
	}

	public Float getMedicUnitPrice() {
		return this.medicUnitPrice;
	}

	public void setMedicUnitPrice(Float medicUnitPrice) {
		this.medicUnitPrice = medicUnitPrice;
	}

	public Integer getMedicQuantity() {
		return this.medicQuantity;
	}

	public void setMedicQuantity(Integer medicQuantity) {
		this.medicQuantity = medicQuantity;
	}
	
	public Boolean getIsDelete() {
		return isDelete;
	}
	
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
