// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Health Attestation State.
 */
public class BaseDeviceHealthAttestationState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Last Update Date Time.
     * 
     */
    @SerializedName("lastUpdateDateTime")
    @Expose
    public String lastUpdateDateTime;

    /**
     * The Content Namespace Url.
     * 
     */
    @SerializedName("contentNamespaceUrl")
    @Expose
    public String contentNamespaceUrl;

    /**
     * The Device Health Attestation Status.
     * 
     */
    @SerializedName("deviceHealthAttestationStatus")
    @Expose
    public String deviceHealthAttestationStatus;

    /**
     * The Content Version.
     * 
     */
    @SerializedName("contentVersion")
    @Expose
    public String contentVersion;

    /**
     * The Issued Date Time.
     * 
     */
    @SerializedName("issuedDateTime")
    @Expose
    public java.util.Calendar issuedDateTime;

    /**
     * The Attestation Identity Key.
     * 
     */
    @SerializedName("attestationIdentityKey")
    @Expose
    public String attestationIdentityKey;

    /**
     * The Reset Count.
     * 
     */
    @SerializedName("resetCount")
    @Expose
    public Long resetCount;

    /**
     * The Restart Count.
     * 
     */
    @SerializedName("restartCount")
    @Expose
    public Long restartCount;

    /**
     * The Data Excution Policy.
     * 
     */
    @SerializedName("dataExcutionPolicy")
    @Expose
    public String dataExcutionPolicy;

    /**
     * The Bit Locker Status.
     * 
     */
    @SerializedName("bitLockerStatus")
    @Expose
    public String bitLockerStatus;

    /**
     * The Boot Manager Version.
     * 
     */
    @SerializedName("bootManagerVersion")
    @Expose
    public String bootManagerVersion;

    /**
     * The Code Integrity Check Version.
     * 
     */
    @SerializedName("codeIntegrityCheckVersion")
    @Expose
    public String codeIntegrityCheckVersion;

    /**
     * The Secure Boot.
     * 
     */
    @SerializedName("secureBoot")
    @Expose
    public String secureBoot;

    /**
     * The Boot Debugging.
     * 
     */
    @SerializedName("bootDebugging")
    @Expose
    public String bootDebugging;

    /**
     * The Operating System Kernel Debugging.
     * 
     */
    @SerializedName("operatingSystemKernelDebugging")
    @Expose
    public String operatingSystemKernelDebugging;

    /**
     * The Code Integrity.
     * 
     */
    @SerializedName("codeIntegrity")
    @Expose
    public String codeIntegrity;

    /**
     * The Test Signing.
     * 
     */
    @SerializedName("testSigning")
    @Expose
    public String testSigning;

    /**
     * The Safe Mode.
     * 
     */
    @SerializedName("safeMode")
    @Expose
    public String safeMode;

    /**
     * The Windows PE.
     * 
     */
    @SerializedName("windowsPE")
    @Expose
    public String windowsPE;

    /**
     * The Early Launch Anti Malware Driver Protection.
     * 
     */
    @SerializedName("earlyLaunchAntiMalwareDriverProtection")
    @Expose
    public String earlyLaunchAntiMalwareDriverProtection;

    /**
     * The Virtual Secure Mode.
     * 
     */
    @SerializedName("virtualSecureMode")
    @Expose
    public String virtualSecureMode;

    /**
     * The Pcr Hash Algorithm.
     * 
     */
    @SerializedName("pcrHashAlgorithm")
    @Expose
    public String pcrHashAlgorithm;

    /**
     * The Boot App Security Version.
     * 
     */
    @SerializedName("bootAppSecurityVersion")
    @Expose
    public String bootAppSecurityVersion;

    /**
     * The Boot Manager Security Version.
     * 
     */
    @SerializedName("bootManagerSecurityVersion")
    @Expose
    public String bootManagerSecurityVersion;

    /**
     * The Tpm Version.
     * 
     */
    @SerializedName("tpmVersion")
    @Expose
    public String tpmVersion;

    /**
     * The Pcr0.
     * 
     */
    @SerializedName("pcr0")
    @Expose
    public String pcr0;

    /**
     * The Secure Boot Configuration Policy Finger Print.
     * 
     */
    @SerializedName("secureBootConfigurationPolicyFingerPrint")
    @Expose
    public String secureBootConfigurationPolicyFingerPrint;

    /**
     * The Code Integrity Policy.
     * 
     */
    @SerializedName("codeIntegrityPolicy")
    @Expose
    public String codeIntegrityPolicy;

    /**
     * The Boot Revision List Info.
     * 
     */
    @SerializedName("bootRevisionListInfo")
    @Expose
    public String bootRevisionListInfo;

    /**
     * The Operating System Rev List Info.
     * 
     */
    @SerializedName("operatingSystemRevListInfo")
    @Expose
    public String operatingSystemRevListInfo;

    /**
     * The Health Status Mismatch Info.
     * 
     */
    @SerializedName("healthStatusMismatchInfo")
    @Expose
    public String healthStatusMismatchInfo;

    /**
     * The Health Attestation Supported Status.
     * 
     */
    @SerializedName("healthAttestationSupportedStatus")
    @Expose
    public String healthAttestationSupportedStatus;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
