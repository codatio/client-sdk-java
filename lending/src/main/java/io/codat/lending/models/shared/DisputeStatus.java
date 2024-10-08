/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.codat.lending.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * DisputeStatus - Current status of the dispute
 */
public enum DisputeStatus {
    WON("Won"),
    LOST("Lost"),
    ACCEPTED("Accepted"),
    PROCESSING("Processing"),
    CHARGE_REFUNDED("ChargeRefunded"),
    EVIDENCE_REQUIRED("EvidenceRequired"),
    INQUIRY_EVIDENCE_REQUIRED("InquiryEvidenceRequired"),
    INQUIRY_PROCESSING("InquiryProcessing"),
    INQUIRY_CLOSED("InquiryClosed"),
    WAITING_THIRD_PARTY("WaitingThirdParty"),
    UNKNOWN("Unknown");

    @JsonValue
    private final String value;

    private DisputeStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
