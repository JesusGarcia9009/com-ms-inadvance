package com.ms.inadvance.client.dto;




import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coborrower{
    public String id;
    public String legacyId;
    public int ageAtApplicationYearsCount;
    public String applicantType;
    public String applicationTakenMethodType;
    public boolean authorizedCreditReportIndicator;
    public String authorizedCreditReportDate;
    public boolean bankruptcyIndicator;
    public boolean bankruptcyIndicatorChapterSeven;
    public boolean bankruptcyIndicatorChapterEleven;
    public boolean bankruptcyIndicatorChapterTwelve;
    public boolean bankruptcyIndicatorChapterThirteen;
    public double baseIncome;
    public double baseMonthlyIncomeAmount;
    public String birthDate;
    public String borrowerType;
    public String borrowerTypeInSummary;
    public String creditReportAuthorizationMethod;
    public boolean currentEmploymentDoesNotApply;
    public boolean declarationsJIndicator;
    public boolean declarationsKIndicator;
    public int dependentCount;
    public String dependentsAgesDescription;
    public String emailAddressText;
    public ArrayList<Employment> employment;
    public boolean equifaxCreditScoreForDisclosure;
    public int equifaxCreditScoreRanksPercent;
    public String equifaxDatePulled;
    public String equifaxFactorCode1;
    public String equifaxFactorCode2;
    public String equifaxFactorCode3;
    public String equifaxFactorCode4;
    public String equifaxKeyFactor1;
    public String equifaxKeyFactor2;
    public String equifaxKeyFactor3;
    public String equifaxKeyFactor4;
    public boolean equifaxKeyFactor5;
    public boolean equifaxMaterialTermsCreditByScore;
    public String equifaxScore;
    public String experianCreditScore;
    public boolean experianCreditScoreForDisclosure;
    public int experianCreditScoreRanksPercent;
    public String experianDatePulled;
    public String experianFactorCode1;
    public String experianFactorCode2;
    public String experianFactorCode3;
    public String experianFactorCode4;
    public String experianKeyFactor1;
    public String experianKeyFactor2;
    public String experianKeyFactor3;
    public String experianKeyFactor4;
    public boolean experianKeyFactor5;
    public boolean experianMaterialTermsCreditByScore;
    public String firstName;
    public String firstNameWithMiddleName;
    public String fullName;
    public String fullNameWithSuffix;
    public String fannieFirstName;
    public String hmda2CreditScoringModel;
    public String hmdaAge;
    public String hmdaCreditScoreForDecisionMaking;
    public String hmdaCreditScoringModel;
    public boolean hmdaCubanIndicator;
    public String hmdaEthnicityReportedField1;
    public String hmdaEthnicityReportedField2;
    public String hmdaEthnicityReportedFields;
    public String hmdaEthnicityType;
    public String hmdaGenderType;
    public String hmdaRaceReportedField1;
    public String hmdaRaceReportedFields;
    public boolean hmdaWhiteIndicator;
    public boolean hmdaGendertypeFemaleIndicator;
    public boolean hmdaGendertypeNotApplicableIndicator;
    public boolean hmdaEthnicityHispanicLatinoIndicator;
    public boolean hmdaEthnicityNotApplicableIndicator;
    public boolean hmdaEthnicityInfoNotProvided;
    public boolean hmdaSexInfoNotProvided;
    public String homePhoneNumber;
    public boolean intentToOccupyIndicator;
    public boolean isBorrower;
    public String isEthnicityBasedOnVisual;
    public String isRaceBasedOnVisual;
    public String isSexBasedOnVisual;
    public String languagePreference;
    public String lastName;
    public String lastNameWithSuffix;
    public boolean liabilitiesDoesNotApply;
    public MailingAddress mailingAddress;
    public boolean mailingAddressSameAsPresentIndicator;
    public String maritalStatusType;
    public int middleCreditScore;
    public String middleFicoScore;
    public String mobilePhone;
    public boolean noCoApplicantEthnicityIndicator;
    public boolean noCoApplicantSexIndicator;
    public boolean outstandingJudgementsIndicator;
    public boolean ownershipConfirmationIndicator;
    public boolean partyToLawsuitIndicatorUrla;
    public boolean presentlyDelinquentIndicatorUrla;
    public boolean previousEmploymentDoesNotApply;
    public boolean priorPropertyDeedInLieuConveyedIndicator;
    public boolean priorPropertyForeclosureCompletedIndicator;
    public boolean priorPropertyShortSaleCompletedIndicator;
    public boolean propertyProposedCleanEnergyLienIndicator;
    public ArrayList<Residence> residences;
    public boolean selfDeclaredMilitaryServiceIndicator;
    public boolean specialBorrowerSellerRelationshipIndicator;
    public boolean ssa89MortgageServiceIndicator;
    public boolean ssa89CreditCheckIndicator;
    public String taxIdentificationIdentifier;
    public double totalAssets;
    public double totalMonthlyIncomeAmount;
    public double totalMonthlyIncomeMinusNetRentalAmount;
    public String transactionPurposeDescription;
    public boolean transUnionCreditScoreForDisclosure;
    public int transUnionCreditScoreRanksPercent;
    public String transUnionDatePulled;
    public String transUnionFactorCode1;
    public String transUnionFactorCode2;
    public String transUnionFactorCode3;
    public String transUnionFactorCode4;
    public String transUnionKeyFactor1;
    public String transUnionKeyFactor2;
    public String transUnionKeyFactor3;
    public String transUnionKeyFactor4;
    public boolean transUnionKeyFactor5;
    public boolean transUnionMaterialTermsCreditByScore;
    public String transUnionScore;
    public boolean undisclosedBorrowedFundsIndicator;
    public boolean undisclosedCreditApplicationIndicator;
    public boolean undisclosedComakerOfNoteIndicator;
    public boolean undisclosedMortgageApplicationIndicator;
    public String urla2020CitizenshipResidencyType;
    public int validDaysForConsentCount;
    public double vaNetTakeHomePayAmount;
    public double vaTotalNetIncomeAmount;
    public String workPhoneNumber;
}
