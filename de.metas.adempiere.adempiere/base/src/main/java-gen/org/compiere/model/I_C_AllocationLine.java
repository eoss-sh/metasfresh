/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;


/** Generated Interface for C_AllocationLine
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public interface I_C_AllocationLine 
{

    /** TableName=C_AllocationLine */
    public static final String Table_Name = "C_AllocationLine";

    /** AD_Table_ID=390 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);

//    org.compiere.util.KeyNamePair Model = new org.compiere.util.KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org
     */
//    java.math.BigDecimal accessLevel = java.math.BigDecimal.valueOf(1);

    /** Load Meta Data */

	/**
	 * Get Mandant.
	 * Client/Tenant for this installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Client_ID();

	public org.compiere.model.I_AD_Client getAD_Client();

    /** Column definition for AD_Client_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_Client> COLUMN_AD_Client_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_Client>(I_C_AllocationLine.class, "AD_Client_ID", org.compiere.model.I_AD_Client.class);
    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Sektion.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Org_ID();

	public org.compiere.model.I_AD_Org getAD_Org();

	public void setAD_Org(org.compiere.model.I_AD_Org AD_Org);

    /** Column definition for AD_Org_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_Org> COLUMN_AD_Org_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_Org>(I_C_AllocationLine.class, "AD_Org_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Betrag.
	 * Amount in a defined currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAmount (java.math.BigDecimal Amount);

	/**
	 * Get Betrag.
	 * Amount in a defined currency
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.math.BigDecimal getAmount();

    /** Column definition for Amount */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_Amount = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "Amount", null);
    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/**
	 * Set Zuordnung.
	 * Payment allocation
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setC_AllocationHdr_ID (int C_AllocationHdr_ID);

	/**
	 * Get Zuordnung.
	 * Payment allocation
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getC_AllocationHdr_ID();

	public org.compiere.model.I_C_AllocationHdr getC_AllocationHdr();

	public void setC_AllocationHdr(org.compiere.model.I_C_AllocationHdr C_AllocationHdr);

    /** Column definition for C_AllocationHdr_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_AllocationHdr> COLUMN_C_AllocationHdr_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_AllocationHdr>(I_C_AllocationLine.class, "C_AllocationHdr_ID", org.compiere.model.I_C_AllocationHdr.class);
    /** Column name C_AllocationHdr_ID */
    public static final String COLUMNNAME_C_AllocationHdr_ID = "C_AllocationHdr_ID";

	/**
	 * Set Zuordnungs-Position.
	 * Allocation Line
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setC_AllocationLine_ID (int C_AllocationLine_ID);

	/**
	 * Get Zuordnungs-Position.
	 * Allocation Line
	 *
	 * <br>Type: ID
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getC_AllocationLine_ID();

    /** Column definition for C_AllocationLine_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_C_AllocationLine_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "C_AllocationLine_ID", null);
    /** Column name C_AllocationLine_ID */
    public static final String COLUMNNAME_C_AllocationLine_ID = "C_AllocationLine_ID";

	/**
	 * Set Geschäftspartner.
	 * Identifies a Business Partner
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/**
	 * Get Geschäftspartner.
	 * Identifies a Business Partner
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner();

	public void setC_BPartner(org.compiere.model.I_C_BPartner C_BPartner);

    /** Column definition for C_BPartner_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_BPartner> COLUMN_C_BPartner_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_BPartner>(I_C_AllocationLine.class, "C_BPartner_ID", org.compiere.model.I_C_BPartner.class);
    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/**
	 * Set Cash Journal Line.
	 * Cash Journal Line
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_CashLine_ID (int C_CashLine_ID);

	/**
	 * Get Cash Journal Line.
	 * Cash Journal Line
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_CashLine_ID();

	public org.compiere.model.I_C_CashLine getC_CashLine();

	public void setC_CashLine(org.compiere.model.I_C_CashLine C_CashLine);

    /** Column definition for C_CashLine_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_CashLine> COLUMN_C_CashLine_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_CashLine>(I_C_AllocationLine.class, "C_CashLine_ID", org.compiere.model.I_C_CashLine.class);
    /** Column name C_CashLine_ID */
    public static final String COLUMNNAME_C_CashLine_ID = "C_CashLine_ID";

	/**
	 * Set Rechnung.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/**
	 * Get Rechnung.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice();

	public void setC_Invoice(org.compiere.model.I_C_Invoice C_Invoice);

    /** Column definition for C_Invoice_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Invoice> COLUMN_C_Invoice_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Invoice>(I_C_AllocationLine.class, "C_Invoice_ID", org.compiere.model.I_C_Invoice.class);
    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/**
	 * Set Auftrag.
	 * Order
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_Order_ID (int C_Order_ID);

	/**
	 * Get Auftrag.
	 * Order
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_Order_ID();

	public org.compiere.model.I_C_Order getC_Order();

	public void setC_Order(org.compiere.model.I_C_Order C_Order);

    /** Column definition for C_Order_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Order> COLUMN_C_Order_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Order>(I_C_AllocationLine.class, "C_Order_ID", org.compiere.model.I_C_Order.class);
    /** Column name C_Order_ID */
    public static final String COLUMNNAME_C_Order_ID = "C_Order_ID";

	/**
	 * Set Counter_AllocationLine_ID.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setCounter_AllocationLine_ID (int Counter_AllocationLine_ID);

	/**
	 * Get Counter_AllocationLine_ID.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getCounter_AllocationLine_ID();

    /** Column definition for Counter_AllocationLine_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_Counter_AllocationLine_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "Counter_AllocationLine_ID", null);
    /** Column name Counter_AllocationLine_ID */
    public static final String COLUMNNAME_Counter_AllocationLine_ID = "Counter_AllocationLine_ID";

	/**
	 * Set Zahlung.
	 * Payment identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_Payment_ID (int C_Payment_ID);

	/**
	 * Get Zahlung.
	 * Payment identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_Payment_ID();

	public org.compiere.model.I_C_Payment getC_Payment();

	public void setC_Payment(org.compiere.model.I_C_Payment C_Payment);

    /** Column definition for C_Payment_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Payment> COLUMN_C_Payment_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_Payment>(I_C_AllocationLine.class, "C_Payment_ID", org.compiere.model.I_C_Payment.class);
    /** Column name C_Payment_ID */
    public static final String COLUMNNAME_C_Payment_ID = "C_Payment_ID";

	/**
	 * Get Erstellt.
	 * Date this record was created
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getCreated();

    /** Column definition for Created */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "Created", null);
    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/**
	 * Get Erstellt durch.
	 * User who created this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCreatedBy();

    /** Column definition for CreatedBy */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_User> COLUMN_CreatedBy = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_User>(I_C_AllocationLine.class, "CreatedBy", org.compiere.model.I_AD_User.class);
    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set Vorgangsdatum.
	 * Transaction Date
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setDateTrx (java.sql.Timestamp DateTrx);

	/**
	 * Get Vorgangsdatum.
	 * Transaction Date
	 *
	 * <br>Type: Date
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getDateTrx();

    /** Column definition for DateTrx */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_DateTrx = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "DateTrx", null);
    /** Column name DateTrx */
    public static final String COLUMNNAME_DateTrx = "DateTrx";

	/**
	 * Set Discount Amount.
	 * Calculated amount of discount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setDiscountAmt (java.math.BigDecimal DiscountAmt);

	/**
	 * Get Discount Amount.
	 * Calculated amount of discount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.math.BigDecimal getDiscountAmt();

    /** Column definition for DiscountAmt */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_DiscountAmt = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "DiscountAmt", null);
    /** Column name DiscountAmt */
    public static final String COLUMNNAME_DiscountAmt = "DiscountAmt";

	/**
	 * Set Aktiv.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setIsActive (boolean IsActive);

	/**
	 * Get Aktiv.
	 * The record is active in the system
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public boolean isActive();

    /** Column definition for IsActive */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "IsActive", null);
    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Set Manuell.
	 * This is a manual process
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setIsManual (boolean IsManual);

	/**
	 * Get Manuell.
	 * This is a manual process
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public boolean isManual();

    /** Column definition for IsManual */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_IsManual = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "IsManual", null);
    /** Column name IsManual */
    public static final String COLUMNNAME_IsManual = "IsManual";

	/**
	 * Set Over/Under Payment.
	 * Over-Payment (unallocated) or Under-Payment (partial payment) Amount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setOverUnderAmt (java.math.BigDecimal OverUnderAmt);

	/**
	 * Get Over/Under Payment.
	 * Over-Payment (unallocated) or Under-Payment (partial payment) Amount
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.math.BigDecimal getOverUnderAmt();

    /** Column definition for OverUnderAmt */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_OverUnderAmt = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "OverUnderAmt", null);
    /** Column name OverUnderAmt */
    public static final String COLUMNNAME_OverUnderAmt = "OverUnderAmt";

	/**
	 * Set Payment Write-off Amount.
	 * Amount to write-off
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setPaymentWriteOffAmt (java.math.BigDecimal PaymentWriteOffAmt);

	/**
	 * Get Payment Write-off Amount.
	 * Amount to write-off
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.math.BigDecimal getPaymentWriteOffAmt();

    /** Column definition for PaymentWriteOffAmt */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_PaymentWriteOffAmt = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "PaymentWriteOffAmt", null);
    /** Column name PaymentWriteOffAmt */
    public static final String COLUMNNAME_PaymentWriteOffAmt = "PaymentWriteOffAmt";

	/**
	 * Set Storno-Zeile.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setReversalLine_ID (int ReversalLine_ID);

	/**
	 * Get Storno-Zeile.
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getReversalLine_ID();

	public org.compiere.model.I_C_AllocationLine getReversalLine();

	public void setReversalLine(org.compiere.model.I_C_AllocationLine ReversalLine);

    /** Column definition for ReversalLine_ID */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_AllocationLine> COLUMN_ReversalLine_ID = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_C_AllocationLine>(I_C_AllocationLine.class, "ReversalLine_ID", org.compiere.model.I_C_AllocationLine.class);
    /** Column name ReversalLine_ID */
    public static final String COLUMNNAME_ReversalLine_ID = "ReversalLine_ID";

	/**
	 * Get Aktualisiert.
	 * Date this record was updated
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "Updated", null);
    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Aktualisiert durch.
	 * User who updated this records
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getUpdatedBy();

    /** Column definition for UpdatedBy */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_User> COLUMN_UpdatedBy = new org.adempiere.model.ModelColumn<I_C_AllocationLine, org.compiere.model.I_AD_User>(I_C_AllocationLine.class, "UpdatedBy", org.compiere.model.I_AD_User.class);
    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/**
	 * Set Write-off Amount.
	 * Amount to write-off
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setWriteOffAmt (java.math.BigDecimal WriteOffAmt);

	/**
	 * Get Write-off Amount.
	 * Amount to write-off
	 *
	 * <br>Type: Amount
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.math.BigDecimal getWriteOffAmt();

    /** Column definition for WriteOffAmt */
    public static final org.adempiere.model.ModelColumn<I_C_AllocationLine, Object> COLUMN_WriteOffAmt = new org.adempiere.model.ModelColumn<I_C_AllocationLine, Object>(I_C_AllocationLine.class, "WriteOffAmt", null);
    /** Column name WriteOffAmt */
    public static final String COLUMNNAME_WriteOffAmt = "WriteOffAmt";
}
