package com.itsp.profile.webapp;

import org.springframework.core.annotation.Order;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ITSPProfile {

    private String P_SipProviderId = "1";

    private String P_SipProviderBaseId = "0";

    private String P_SipProviderActive = "false";

    private String P_SipProviderName = "";

    private String P_SipGwDomainName = "";

    private String P_SipProviderInterfaceSelect = "0";

    private String P_SipProviderIPVersion = "4";

    private String P_SipProviderTransportProtocol = "udp";

    private String P_SipProviderUdpMode = "0";

    private String P_SipProviderSignalProtocol = "0";

    private String P_SipProviderSecurity = "0";

    private String P_SipProviderMediaSecurity = "0";

    private String P_SipProviderSuppSecurity = "0";

    private String P_SipProviderUseRegistrar = "true";

    private String P_SipProviderRegistrarIPName = "";

    private String P_SipProviderRegistrarPort = "5060";

    private String P_SipProviderReregistrationInt = "600";

    private String P_SipProviderUseProxy = "true";

    private String P_SipProviderIPNameProxy = "";

    private String P_SipProviderPortProxy = "5060";

    private String P_SipProviderUseOutboundProxy = "false";

    private String P_SipProviderIPNameOutboundPr = "0.0.0.0";

    private String P_SipProviderPortOutboundProx = "0";

    private String P_SipProviderUseInboundProxy = "false";

    private String P_SipProviderIPNameInboundPr = "0.0.0.0";

    private String P_SipProviderPortInboundProx = "0";

    private String P_SipProviderInterfaceType = "0";

    private String P_SipDeviceId = "0";

    private String P_SipProviderPreconfigured = "true";

    private String P_SipProviderCountryCode = "*";

    private String P_SipProviderAreaCode = "";

    private String P_SipProviderPABXNo = "";

    private String P_SipProviderUseStun = "false";

    private String P_SipProviderStunServerIPName = "";

    private String P_SipProviderStunServerPort = "3478";

    private String P_SipProvProfileStunMode = "0";

    private String P_SipIntIntendedForBranding =  "*:*";

    private String P_SipIntProfileIdentifier = "0";

    private String P_SipIntProfileIntParamIssue = "0";

    private String P_SipProvProfCLIPFromNameA = "0";

    private String P_SipProvProfCLIPFromAddrS = "1";

    private String P_SipProvProfileFromURIDomain = "1";

    private String P_SipProvProfileRedirNrInFrom = "false";

    private String P_SipProvProfileOrigNrInPAI = "false";

    private String P_SipProvProfCLIPPAssIdA = "0";;

    private String P_SipProvProfCLIPPAssIdS = "1";

    private String P_SipProvProfCLIPPPrefNameA = "0";

    private String P_SipProvProfCLIPPPrefAddrS = "0";

    private String P_SipProvProfDivNameA = "0";

    private String P_SipProvProfDivAddrS = "1";

    private String P_SipProvProfHistInfoNameA = "0";

    private String P_SipProvProfHistInfoAddrS = "0";

    private String P_SipProvProfCLIRFromNameA = "3";

    private String P_SipProvProfCLIRFromAddrS = "3";

    private String P_SipProvProfCLIRPrivacy = "1";

    private String P_SipProvProfileUserEqPhone = "0";

    private String P_SipProvProfileCOLPsupported = "1";

    private String P_SipProvProfCalledPartyN = "2";

    private String P_SipProvProfCallingPartyN = "2";

    private String P_SipProvProfCallingParNTON = "0";

    private String P_SipProvProfileMapProvNumber = "false";

    private String P_SipProvProfileMappingMode = "2";

    private String P_SipProvProfOutCallingParNTON = "0";

    private String P_SipProvProfInCalledParNTON = "0";

    private String P_SipProvProfClipNoScreenSupp = "0";

    private String P_SipProvProfUseDialNumFormat = "1";

    private String P_SipProvProfOutCalledParNTON = "0";

    private String P_SipProviderE164NP = "0";

    private String P_SipProvProfRouteType = "0";

    private String P_SipProvProfOut302Allowed = "0";

    private String P_SipProvProfRouteOptimize = "0";

    private String P_SipProviderMEXSupported = "0";

    private String P_SipProvProfContactUriCont = "0";

    private String P_SipProvProfMultipleRoute = "0";

    private String P_SipProvProfileInChkRedir = "0";

    private String P_SipProvProfileContactTCPPort = "0";

    private String P_SipProvProfRegFailRetryTime = "120";

    private String P_SipProvProfRegFailRetryMode = "0";

    private String P_SipProvProfRegAfterCallFail = "0";

    private String P_SipProvProfApprovedPeerSel = "0";

    private String P_SipProvProfUseRouteURIAuth = "true";

    private String P_SipProvProfActiveHoldMode = "0";

    private String P_SipProvProfIgnore100Rel = "true";

    private String P_SipProvProfSupport100Rel = "false";

    private String P_SipProvProfileRegContactAddr = "0";

    private String P_SipProvProfileContactUriWith = "false";

    private String P_SipProvProfileRegBNCinContac = "0";

    private String P_SipProvProfileDirectPayload = "false";

    private String P_SipProvProfileMRAActiv = "true";

    private String P_SipProvChangeDirectionAttr = "0";

    private String P_SipProvProfPEarlyMediaHeader = "0";

    private String P_SipProvProfileUseViaRPort = "true";

    private String P_SipProvProfileUPDATESupporte = "true";

    private String P_SipProvProfileSessionTimer = "0";

    private String P_SipProvProfileProgressTimer = "0";

    private String P_SipProvProfileUdpKeepAlive = "1";

    private String P_SipProvProfOptKeepAliveTimer = "60";

    private String P_SipProvProfileOptionFailover = "0";

    private String P_SipProvProfAnswer2Options = "0";

    private String P_SipProvProfRespCodeIndex = "0";

    private String P_SipProvProfiSilenceSupSup = "1";

    private String P_SipProvProfileMediaSecSup = "0";

    private String P_SipProvProfileSDPFilterIndex = "0";

    private String P_SipProvProfSupport100RelUAS = "0";

    private String P_SipProvProfSwitchBack2Prim = "0";

    public ITSPProfile(String p_SipProviderId, String p_SipProviderBaseId, String p_SipProviderActive, String p_SipProviderName, String p_SipGwDomainName,
                       String p_SipProviderInterfaceSelect, String p_SipProviderIPVersion, String p_SipProviderTransportProtocol, String p_SipProviderUdpMode,
                       String p_SipProviderSignalProtocol, String p_SipProviderSecurity, String p_SipProviderMediaSecurity, String p_SipProviderSuppSecurity,
                       String p_SipProviderUseRegistrar, String p_SipProviderRegistrarIPName, String p_SipProviderRegistrarPort, String p_SipProviderReregistrationInt,
                       String p_SipProviderUseProxy, String p_SipProviderIPNameProxy, String p_SipProviderPortProxy, String p_SipProviderUseOutboundProxy,
                       String p_SipProviderIPNameOutboundPr, String p_SipProviderPortOutboundProx, String p_SipProviderUseInboundProxy, String p_SipProviderIPNameInboundPr,
                       String p_SipProviderPortInboundProx, String p_SipProviderInterfaceType, String p_SipDeviceId, String p_SipProviderPreconfigured,
                       String p_SipProviderCountryCode, String p_SipProviderAreaCode, String p_SipProviderPABXNo, String p_SipProviderUseStun, String p_SipProviderStunServerIPName,
                       String p_SipProviderStunServerPort, String p_SipProvProfileStunMode, String p_SipIntIntendedForBranding, String p_SipIntProfileIdentifier,
                       String p_SipIntProfileIntParamIssue, String p_SipProvProfCLIPFromNameA, String p_SipProvProfCLIPFromAddrS, String p_SipProvProfileFromURIDomain,
                       String p_SipProvProfileRedirNrInFrom, String p_SipProvProfileOrigNrInPAI, String p_SipProvProfCLIPPAssIdA, String p_SipProvProfCLIPPAssIdS,
                       String p_SipProvProfCLIPPPrefNameA, String p_SipProvProfCLIPPPrefAddrS, String p_SipProvProfDivNameA, String p_SipProvProfDivAddrS, String p_SipProvProfHistInfoNameA,
                       String p_SipProvProfHistInfoAddrS, String p_SipProvProfCLIRFromNameA, String p_SipProvProfCLIRFromAddrS, String p_SipProvProfCLIRPrivacy, String p_SipProvProfileUserEqPhone,
                       String p_SipProvProfileCOLPsupported, String p_SipProvProfCalledPartyN, String p_SipProvProfCallingPartyN, String p_SipProvProfCallingParNTON, String p_SipProvProfileMapProvNumber,
                       String p_SipProvProfileMappingMode, String p_SipProvProfOutCallingParNTON, String p_SipProvProfInCalledParNTON, String p_SipProvProfClipNoScreenSupp, String p_SipProvProfUseDialNumFormat,
                       String p_SipProvProfOutCalledParNTON, String p_SipProviderE164NP, String p_SipProvProfRouteType, String p_SipProvProfOut302Allowed, String p_SipProvProfRouteOptimize, String p_SipProviderMEXSupported,
                       String p_SipProvProfContactUriCont, String p_SipProvProfMultipleRoute, String p_SipProvProfileInChkRedir, String p_SipProvProfileContactTCPPort, String p_SipProvProfRegFailRetryTime,
                       String p_SipProvProfRegFailRetryMode, String p_SipProvProfRegAfterCallFail, String p_SipProvProfApprovedPeerSel, String p_SipProvProfUseRouteURIAuth, String p_SipProvProfActiveHoldMode,
                       String p_SipProvProfIgnore100Rel, String p_SipProvProfSupport100Rel, String p_SipProvProfileRegContactAddr, String p_SipProvProfileContactUriWith, String p_SipProvProfileRegBNCinContac,
                       String p_SipProvProfileDirectPayload, String p_SipProvProfileMRAActiv, String p_SipProvChangeDirectionAttr, String p_SipProvProfPEarlyMediaHeader, String p_SipProvProfileUseViaRPort, String p_SipProvProfileUPDATESupporte,
                       String p_SipProvProfileSessionTimer, String p_SipProvProfileProgressTimer, String p_SipProvProfileUdpKeepAlive, String p_SipProvProfOptKeepAliveTimer, String p_SipProvProfileOptionFailover, String p_SipProvProfAnswer2Options,
                       String p_SipProvProfRespCodeIndex, String p_SipProvProfiSilenceSupSup, String p_SipProvProfileMediaSecSup, String p_SipProvProfileSDPFilterIndex, String p_SipProvProfSupport100RelUAS, String p_SipProvProfSwitchBack2Prim)
    {
        P_SipProviderId = p_SipProviderId;
        P_SipProviderBaseId = p_SipProviderBaseId;
        P_SipProviderActive = p_SipProviderActive;
        P_SipProviderName = p_SipProviderName;
        P_SipGwDomainName = p_SipGwDomainName;
        P_SipProviderInterfaceSelect = p_SipProviderInterfaceSelect;
        P_SipProviderIPVersion = p_SipProviderIPVersion;
        P_SipProviderTransportProtocol = p_SipProviderTransportProtocol;
        P_SipProviderUdpMode = p_SipProviderUdpMode;
        P_SipProviderSignalProtocol = p_SipProviderSignalProtocol;
        P_SipProviderSecurity = p_SipProviderSecurity;
        P_SipProviderMediaSecurity = p_SipProviderMediaSecurity;
        P_SipProviderSuppSecurity = p_SipProviderSuppSecurity;
        P_SipProviderUseRegistrar = p_SipProviderUseRegistrar;
        P_SipProviderRegistrarIPName = p_SipProviderRegistrarIPName;
        P_SipProviderRegistrarPort = p_SipProviderRegistrarPort;
        P_SipProviderReregistrationInt = p_SipProviderReregistrationInt;
        P_SipProviderUseProxy = p_SipProviderUseProxy;
        P_SipProviderIPNameProxy = p_SipProviderIPNameProxy;
        P_SipProviderPortProxy = p_SipProviderPortProxy;
        P_SipProviderUseOutboundProxy = p_SipProviderUseOutboundProxy;
        P_SipProviderIPNameOutboundPr = p_SipProviderIPNameOutboundPr;
        P_SipProviderPortOutboundProx = p_SipProviderPortOutboundProx;
        P_SipProviderUseInboundProxy = p_SipProviderUseInboundProxy;
        P_SipProviderIPNameInboundPr = p_SipProviderIPNameInboundPr;
        P_SipProviderPortInboundProx = p_SipProviderPortInboundProx;
        P_SipProviderInterfaceType = p_SipProviderInterfaceType;
        P_SipDeviceId = p_SipDeviceId;
        P_SipProviderPreconfigured = p_SipProviderPreconfigured;
        P_SipProviderCountryCode = p_SipProviderCountryCode;
        P_SipProviderAreaCode = p_SipProviderAreaCode;
        P_SipProviderPABXNo = p_SipProviderPABXNo;
        P_SipProviderUseStun = p_SipProviderUseStun;
        P_SipProviderStunServerIPName = p_SipProviderStunServerIPName;
        P_SipProviderStunServerPort = p_SipProviderStunServerPort;
        P_SipProvProfileStunMode = p_SipProvProfileStunMode;
        P_SipIntIntendedForBranding = p_SipIntIntendedForBranding;
        P_SipIntProfileIdentifier = p_SipIntProfileIdentifier;
        P_SipIntProfileIntParamIssue = p_SipIntProfileIntParamIssue;
        P_SipProvProfCLIPFromNameA = p_SipProvProfCLIPFromNameA;
        P_SipProvProfCLIPFromAddrS = p_SipProvProfCLIPFromAddrS;
        P_SipProvProfileFromURIDomain = p_SipProvProfileFromURIDomain;
        P_SipProvProfileRedirNrInFrom = p_SipProvProfileRedirNrInFrom;
        P_SipProvProfileOrigNrInPAI = p_SipProvProfileOrigNrInPAI;
        P_SipProvProfCLIPPAssIdA = p_SipProvProfCLIPPAssIdA;
        P_SipProvProfCLIPPAssIdS = p_SipProvProfCLIPPAssIdS;
        P_SipProvProfCLIPPPrefNameA = p_SipProvProfCLIPPPrefNameA;
        P_SipProvProfCLIPPPrefAddrS = p_SipProvProfCLIPPPrefAddrS;
        P_SipProvProfDivNameA = p_SipProvProfDivNameA;
        P_SipProvProfDivAddrS = p_SipProvProfDivAddrS;
        P_SipProvProfHistInfoNameA = p_SipProvProfHistInfoNameA;
        P_SipProvProfHistInfoAddrS = p_SipProvProfHistInfoAddrS;
        P_SipProvProfCLIRFromNameA = p_SipProvProfCLIRFromNameA;
        P_SipProvProfCLIRFromAddrS = p_SipProvProfCLIRFromAddrS;
        P_SipProvProfCLIRPrivacy = p_SipProvProfCLIRPrivacy;
        P_SipProvProfileUserEqPhone = p_SipProvProfileUserEqPhone;
        P_SipProvProfileCOLPsupported = p_SipProvProfileCOLPsupported;
        P_SipProvProfCalledPartyN = p_SipProvProfCalledPartyN;
        P_SipProvProfCallingPartyN = p_SipProvProfCallingPartyN;
        P_SipProvProfCallingParNTON = p_SipProvProfCallingParNTON;
        P_SipProvProfileMapProvNumber = p_SipProvProfileMapProvNumber;
        P_SipProvProfileMappingMode = p_SipProvProfileMappingMode;
        P_SipProvProfOutCallingParNTON = p_SipProvProfOutCallingParNTON;
        P_SipProvProfInCalledParNTON = p_SipProvProfInCalledParNTON;
        P_SipProvProfClipNoScreenSupp = p_SipProvProfClipNoScreenSupp;
        P_SipProvProfUseDialNumFormat = p_SipProvProfUseDialNumFormat;
        P_SipProvProfOutCalledParNTON = p_SipProvProfOutCalledParNTON;
        P_SipProviderE164NP = p_SipProviderE164NP;
        P_SipProvProfRouteType = p_SipProvProfRouteType;
        P_SipProvProfOut302Allowed = p_SipProvProfOut302Allowed;
        P_SipProvProfRouteOptimize = p_SipProvProfRouteOptimize;
        P_SipProviderMEXSupported = p_SipProviderMEXSupported;
        P_SipProvProfContactUriCont = p_SipProvProfContactUriCont;
        P_SipProvProfMultipleRoute = p_SipProvProfMultipleRoute;
        P_SipProvProfileInChkRedir = p_SipProvProfileInChkRedir;
        P_SipProvProfileContactTCPPort = p_SipProvProfileContactTCPPort;
        P_SipProvProfRegFailRetryTime = p_SipProvProfRegFailRetryTime;
        P_SipProvProfRegFailRetryMode = p_SipProvProfRegFailRetryMode;
        P_SipProvProfRegAfterCallFail = p_SipProvProfRegAfterCallFail;
        P_SipProvProfApprovedPeerSel = p_SipProvProfApprovedPeerSel;
        P_SipProvProfUseRouteURIAuth = p_SipProvProfUseRouteURIAuth;
        P_SipProvProfActiveHoldMode = p_SipProvProfActiveHoldMode;
        P_SipProvProfIgnore100Rel = p_SipProvProfIgnore100Rel;
        P_SipProvProfSupport100Rel = p_SipProvProfSupport100Rel;
        P_SipProvProfileRegContactAddr = p_SipProvProfileRegContactAddr;
        P_SipProvProfileContactUriWith = p_SipProvProfileContactUriWith;
        P_SipProvProfileRegBNCinContac = p_SipProvProfileRegBNCinContac;
        P_SipProvProfileDirectPayload = p_SipProvProfileDirectPayload;
        P_SipProvProfileMRAActiv = p_SipProvProfileMRAActiv;
        P_SipProvChangeDirectionAttr = p_SipProvChangeDirectionAttr;
        P_SipProvProfPEarlyMediaHeader = p_SipProvProfPEarlyMediaHeader;
        P_SipProvProfileUseViaRPort = p_SipProvProfileUseViaRPort;
        P_SipProvProfileUPDATESupporte = p_SipProvProfileUPDATESupporte;
        P_SipProvProfileSessionTimer = p_SipProvProfileSessionTimer;
        P_SipProvProfileProgressTimer = p_SipProvProfileProgressTimer;
        P_SipProvProfileUdpKeepAlive = p_SipProvProfileUdpKeepAlive;
        P_SipProvProfOptKeepAliveTimer = p_SipProvProfOptKeepAliveTimer;
        P_SipProvProfileOptionFailover = p_SipProvProfileOptionFailover;
        P_SipProvProfAnswer2Options = p_SipProvProfAnswer2Options;
        P_SipProvProfRespCodeIndex = p_SipProvProfRespCodeIndex;
        P_SipProvProfiSilenceSupSup = p_SipProvProfiSilenceSupSup;
        P_SipProvProfileMediaSecSup = p_SipProvProfileMediaSecSup;
        P_SipProvProfileSDPFilterIndex = p_SipProvProfileSDPFilterIndex;
        P_SipProvProfSupport100RelUAS = p_SipProvProfSupport100RelUAS;
        P_SipProvProfSwitchBack2Prim = p_SipProvProfSwitchBack2Prim;
    }

    public ITSPProfile() {
    }

    public String getP_SipProviderId() {
        return P_SipProviderId;
    }

    @Order(value=1)
    public void setP_SipProviderId(String p_SipProviderId) {
        P_SipProviderId = p_SipProviderId;
    }

    public String getP_SipProviderBaseId() {
        return P_SipProviderBaseId;
    }

    @Order(value=2)
    public void setP_SipProviderBaseId(String p_SipProviderBaseId) {
        P_SipProviderBaseId = p_SipProviderBaseId;
    }

    public String getP_SipProviderActive() {
        return P_SipProviderActive;
    }

    @Order(value=3)
    public void setP_SipProviderActive(String p_SipProviderActive) {
        P_SipProviderActive = p_SipProviderActive;
    }

    public String getP_SipProviderName() {
        return P_SipProviderName;
    }

    @Order(value=4)
    public void setP_SipProviderName(String p_SipProviderName) {
        P_SipProviderName = p_SipProviderName;
    }

    public String getP_SipGwDomainName() {
        return P_SipGwDomainName;
    }

    @Order(value=5)
    public void setP_SipGwDomainName(String p_SipGwDomainName) {
        P_SipGwDomainName = p_SipGwDomainName;
    }

    public String getP_SipProviderInterfaceSelect() {
        return P_SipProviderInterfaceSelect;
    }

    @Order(value=6)
    public void setP_SipProviderInterfaceSelect(String p_SipProviderInterfaceSelect) {
        P_SipProviderInterfaceSelect = p_SipProviderInterfaceSelect;
    }

    public String getP_SipProviderIPVersion() {
        return P_SipProviderIPVersion;
    }

    @Order(value=7)
    public void setP_SipProviderIPVersion(String p_SipProviderIPVersion) {
        P_SipProviderIPVersion = p_SipProviderIPVersion;
    }

    public String getP_SipProviderTransportProtocol() {
        return P_SipProviderTransportProtocol;
    }

    @Order(value=8)
    public void setP_SipProviderTransportProtocol(String p_SipProviderTransportProtocol) {
        P_SipProviderTransportProtocol = p_SipProviderTransportProtocol;
    }

    public String getP_SipProviderUdpMode() {
        return P_SipProviderUdpMode;
    }

    @Order(value=9)
    public void setP_SipProviderUdpMode(String p_SipProviderUdpMode) {
        P_SipProviderUdpMode = p_SipProviderUdpMode;
    }

    public String getP_SipProviderSignalProtocol() {
        return P_SipProviderSignalProtocol;
    }

    @Order(value=10)
    public void setP_SipProviderSignalProtocol(String p_SipProviderSignalProtocol) {
        P_SipProviderSignalProtocol = p_SipProviderSignalProtocol;
    }

    public String getP_SipProviderSecurity() {
        return P_SipProviderSecurity;
    }

    @Order(value=11)
    public void setP_SipProviderSecurity(String p_SipProviderSecurity) {
        P_SipProviderSecurity = p_SipProviderSecurity;
    }

    public String getP_SipProviderMediaSecurity() {
        return P_SipProviderMediaSecurity;
    }

    @Order(value=12)
    public void setP_SipProviderMediaSecurity(String p_SipProviderMediaSecurity) {
        P_SipProviderMediaSecurity = p_SipProviderMediaSecurity;
    }

    public String getP_SipProviderSuppSecurity() {
        return P_SipProviderSuppSecurity;
    }

    @Order(value=13)
    public void setP_SipProviderSuppSecurity(String p_SipProviderSuppSecurity) {
        P_SipProviderSuppSecurity = p_SipProviderSuppSecurity;
    }

    public String getP_SipProviderUseRegistrar() {
        return P_SipProviderUseRegistrar;
    }

    @Order(value=14)
    public void setP_SipProviderUseRegistrar(String p_SipProviderUseRegistrar) {
        P_SipProviderUseRegistrar = p_SipProviderUseRegistrar;
    }

    public String getP_SipProviderRegistrarIPName() {
        return P_SipProviderRegistrarIPName;
    }

    @Order(value=15)
    public void setP_SipProviderRegistrarIPName(String p_SipProviderRegistrarIPName) {
        P_SipProviderRegistrarIPName = p_SipProviderRegistrarIPName;
    }

    public String getP_SipProviderRegistrarPort() {
        return P_SipProviderRegistrarPort;
    }

    @Order(value=16)
    public void setP_SipProviderRegistrarPort(String p_SipProviderRegistrarPort) {
        P_SipProviderRegistrarPort = p_SipProviderRegistrarPort;
    }

    public String getP_SipProviderReregistrationInt() {
        return P_SipProviderReregistrationInt;
    }

    @Order(value=17)
    public void setP_SipProviderReregistrationInt(String p_SipProviderReregistrationInt) {
        P_SipProviderReregistrationInt = p_SipProviderReregistrationInt;
    }

    public String getP_SipProviderUseProxy() {
        return P_SipProviderUseProxy;
    }

    @Order(value=18)
    public void setP_SipProviderUseProxy(String p_SipProviderUseProxy) {
        P_SipProviderUseProxy = p_SipProviderUseProxy;
    }

    public String getP_SipProviderIPNameProxy() {
        return P_SipProviderIPNameProxy;
    }

    @Order(value=19)
    public void setP_SipProviderIPNameProxy(String p_SipProviderIPNameProxy) {
        P_SipProviderIPNameProxy = p_SipProviderIPNameProxy;
    }

    public String getP_SipProviderPortProxy() {
        return P_SipProviderPortProxy;
    }

    @Order(value=20)
    public void setP_SipProviderPortProxy(String p_SipProviderPortProxy) {
        P_SipProviderPortProxy = p_SipProviderPortProxy;
    }

    public String getP_SipProviderUseOutboundProxy() {
        return P_SipProviderUseOutboundProxy;
    }

    @Order(value=21)
    public void setP_SipProviderUseOutboundProxy(String p_SipProviderUseOutboundProxy) {
        P_SipProviderUseOutboundProxy = p_SipProviderUseOutboundProxy;
    }

    public String getP_SipProviderIPNameOutboundPr() {
        return P_SipProviderIPNameOutboundPr;
    }

    @Order(value=22)
    public void setP_SipProviderIPNameOutboundPr(String p_SipProviderIPNameOutboundPr) {
        P_SipProviderIPNameOutboundPr = p_SipProviderIPNameOutboundPr;
    }

    public String getP_SipProviderPortOutboundProx() {
        return P_SipProviderPortOutboundProx;
    }

    @Order(value=23)
    public void setP_SipProviderPortOutboundProx(String p_SipProviderPortOutboundProx) {
        P_SipProviderPortOutboundProx = p_SipProviderPortOutboundProx;
    }

    public String getP_SipProviderUseInboundProxy() {
        return P_SipProviderUseInboundProxy;
    }

    @Order(value=24)
    public void setP_SipProviderUseInboundProxy(String p_SipProviderUseInboundProxy) {
        P_SipProviderUseInboundProxy = p_SipProviderUseInboundProxy;
    }

    public String getP_SipProviderIPNameInboundPr() {
        return P_SipProviderIPNameInboundPr;
    }

    @Order(value=25)
    public void setP_SipProviderIPNameInboundPr(String p_SipProviderIPNameInboundPr) {
        P_SipProviderIPNameInboundPr = p_SipProviderIPNameInboundPr;
    }

    public String getP_SipProviderPortInboundProx() {
        return P_SipProviderPortInboundProx;
    }

    @Order(value=26)
    public void setP_SipProviderPortInboundProx(String p_SipProviderPortInboundProx) {
        P_SipProviderPortInboundProx = p_SipProviderPortInboundProx;
    }

    public String getP_SipProviderInterfaceType() {
        return P_SipProviderInterfaceType;
    }

    @Order(value=27)
    public void setP_SipProviderInterfaceType(String p_SipProviderInterfaceType) {
        P_SipProviderInterfaceType = p_SipProviderInterfaceType;
    }

    public String getP_SipDeviceId() {
        return P_SipDeviceId;
    }

    @Order(value=28)
    public void setP_SipDeviceId(String p_SipDeviceId) {
        P_SipDeviceId = p_SipDeviceId;
    }

    public String getP_SipProviderPreconfigured() {
        return P_SipProviderPreconfigured;
    }

    @Order(value=29)
    public void setP_SipProviderPreconfigured(String p_SipProviderPreconfigured) {
        P_SipProviderPreconfigured = p_SipProviderPreconfigured;
    }

    public String getP_SipProviderCountryCode() {
        return P_SipProviderCountryCode;
    }

    @Order(value=30)
    public void setP_SipProviderCountryCode(String p_SipProviderCountryCode) {
        P_SipProviderCountryCode = p_SipProviderCountryCode;
    }

    public String getP_SipProviderAreaCode() {
        return P_SipProviderAreaCode;
    }

    @Order(value=31)
    public void setP_SipProviderAreaCode(String p_SipProviderAreaCode) {
        P_SipProviderAreaCode = p_SipProviderAreaCode;
    }

    public String getP_SipProviderPABXNo() {
        return P_SipProviderPABXNo;
    }

    @Order(value=32)
    public void setP_SipProviderPABXNo(String p_SipProviderPABXNo) {
        P_SipProviderPABXNo = p_SipProviderPABXNo;
    }

    public String getP_SipProviderUseStun() {
        return P_SipProviderUseStun;
    }

    @Order(value=33)
    public void setP_SipProviderUseStun(String p_SipProviderUseStun) {
        P_SipProviderUseStun = p_SipProviderUseStun;
    }

    public String getP_SipProviderStunServerIPName() {
        return P_SipProviderStunServerIPName;
    }

    @Order(value=34)
    public void setP_SipProviderStunServerIPName(String p_SipProviderStunServerIPName) {
        P_SipProviderStunServerIPName = p_SipProviderStunServerIPName;
    }

    public String getP_SipProviderStunServerPort() {
        return P_SipProviderStunServerPort;
    }

    @Order(value=35)
    public void setP_SipProviderStunServerPort(String p_SipProviderStunServerPort) {
        P_SipProviderStunServerPort = p_SipProviderStunServerPort;
    }

    public String getP_SipProvProfileStunMode() {
        return P_SipProvProfileStunMode;
    }

    @Order(value=36)
    public void setP_SipProvProfileStunMode(String p_SipProvProfileStunMode) {
        P_SipProvProfileStunMode = p_SipProvProfileStunMode;
    }

    public String getP_SipIntIntendedForBranding() {
        return P_SipIntIntendedForBranding;
    }

    @Order(value=37)
    public void setP_SipIntIntendedForBranding(String p_SipIntIntendedForBranding) {
        P_SipIntIntendedForBranding = p_SipIntIntendedForBranding;
    }

    public String getP_SipIntProfileIdentifier() {
        return P_SipIntProfileIdentifier;
    }

    @Order(value=38)
    public void setP_SipIntProfileIdentifier(String p_SipIntProfileIdentifier) {
        P_SipIntProfileIdentifier = p_SipIntProfileIdentifier;
    }

    public String getP_SipIntProfileIntParamIssue() {
        return P_SipIntProfileIntParamIssue;
    }

    @Order(value=39)
    public void setP_SipIntProfileIntParamIssue(String p_SipIntProfileIntParamIssue) {
        P_SipIntProfileIntParamIssue = p_SipIntProfileIntParamIssue;
    }

    public String getP_SipProvProfCLIPFromNameA() {
        return P_SipProvProfCLIPFromNameA;
    }

    @Order(value=40)
    public void setP_SipProvProfCLIPFromNameA(String p_SipProvProfCLIPFromNameA) {
        P_SipProvProfCLIPFromNameA = p_SipProvProfCLIPFromNameA;
    }

    public String getP_SipProvProfCLIPFromAddrS() {
        return P_SipProvProfCLIPFromAddrS;
    }

    @Order(value=41)
    public void setP_SipProvProfCLIPFromAddrS(String p_SipProvProfCLIPFromAddrS) {
        P_SipProvProfCLIPFromAddrS = p_SipProvProfCLIPFromAddrS;
    }

    public String getP_SipProvProfileFromURIDomain() {
        return P_SipProvProfileFromURIDomain;
    }

    @Order(value=42)
    public void setP_SipProvProfileFromURIDomain(String p_SipProvProfileFromURIDomain) {
        P_SipProvProfileFromURIDomain = p_SipProvProfileFromURIDomain;
    }

    public String getP_SipProvProfileRedirNrInFrom() {
        return P_SipProvProfileRedirNrInFrom;
    }

    @Order(value=43)
    public void setP_SipProvProfileRedirNrInFrom(String p_SipProvProfileRedirNrInFrom) {
        P_SipProvProfileRedirNrInFrom = p_SipProvProfileRedirNrInFrom;
    }

    public String getP_SipProvProfileOrigNrInPAI() {
        return P_SipProvProfileOrigNrInPAI;
    }

    @Order(value=44)
    public void setP_SipProvProfileOrigNrInPAI(String p_SipProvProfileOrigNrInPAI) {
        P_SipProvProfileOrigNrInPAI = p_SipProvProfileOrigNrInPAI;
    }

    public String getP_SipProvProfCLIPPAssIdA() {
        return P_SipProvProfCLIPPAssIdA;
    }

    @Order(value=45)
    public void setP_SipProvProfCLIPPAssIdA(String p_SipProvProfCLIPPAssIdA) {
        P_SipProvProfCLIPPAssIdA = p_SipProvProfCLIPPAssIdA;
    }

    public String getP_SipProvProfCLIPPAssIdS() {
        return P_SipProvProfCLIPPAssIdS;
    }

    @Order(value=46)
    public void setP_SipProvProfCLIPPAssIdS(String p_SipProvProfCLIPPAssIdS) {
        P_SipProvProfCLIPPAssIdS = p_SipProvProfCLIPPAssIdS;
    }

    public String getP_SipProvProfCLIPPPrefNameA() {
        return P_SipProvProfCLIPPPrefNameA;
    }

    @Order(value=47)
    public void setP_SipProvProfCLIPPPrefNameA(String p_SipProvProfCLIPPPrefNameA) {
        P_SipProvProfCLIPPPrefNameA = p_SipProvProfCLIPPPrefNameA;
    }

    public String getP_SipProvProfCLIPPPrefAddrS() {
        return P_SipProvProfCLIPPPrefAddrS;
    }

    @Order(value=48)
    public void setP_SipProvProfCLIPPPrefAddrS(String p_SipProvProfCLIPPPrefAddrS) {
        P_SipProvProfCLIPPPrefAddrS = p_SipProvProfCLIPPPrefAddrS;
    }

    public String getP_SipProvProfDivNameA() {
        return P_SipProvProfDivNameA;
    }

    @Order(value=49)
    public void setP_SipProvProfDivNameA(String p_SipProvProfDivNameA) {
        P_SipProvProfDivNameA = p_SipProvProfDivNameA;
    }

    public String getP_SipProvProfDivAddrS() {
        return P_SipProvProfDivAddrS;
    }

    @Order(value=50)
    public void setP_SipProvProfDivAddrS(String p_SipProvProfDivAddrS) {
        P_SipProvProfDivAddrS = p_SipProvProfDivAddrS;
    }

    public String getP_SipProvProfHistInfoNameA() {
        return P_SipProvProfHistInfoNameA;
    }

    @Order(value=51)
    public void setP_SipProvProfHistInfoNameA(String p_SipProvProfHistInfoNameA) {
        P_SipProvProfHistInfoNameA = p_SipProvProfHistInfoNameA;
    }

    public String getP_SipProvProfHistInfoAddrS() {
        return P_SipProvProfHistInfoAddrS;
    }

    @Order(value=52)
    public void setP_SipProvProfHistInfoAddrS(String p_SipProvProfHistInfoAddrS) {
        P_SipProvProfHistInfoAddrS = p_SipProvProfHistInfoAddrS;
    }

    public String getP_SipProvProfCLIRFromNameA() {
        return P_SipProvProfCLIRFromNameA;
    }

    @Order(value=53)
    public void setP_SipProvProfCLIRFromNameA(String p_SipProvProfCLIRFromNameA) {
        P_SipProvProfCLIRFromNameA = p_SipProvProfCLIRFromNameA;
    }

    public String getP_SipProvProfCLIRFromAddrS() {
        return P_SipProvProfCLIRFromAddrS;
    }

    @Order(value=54)
    public void setP_SipProvProfCLIRFromAddrS(String p_SipProvProfCLIRFromAddrS) {
        P_SipProvProfCLIRFromAddrS = p_SipProvProfCLIRFromAddrS;
    }

    public String getP_SipProvProfCLIRPrivacy() {
        return P_SipProvProfCLIRPrivacy;
    }

    @Order(value=55)
    public void setP_SipProvProfCLIRPrivacy(String p_SipProvProfCLIRPrivacy) {
        P_SipProvProfCLIRPrivacy = p_SipProvProfCLIRPrivacy;
    }

    public String getP_SipProvProfileUserEqPhone() {
        return P_SipProvProfileUserEqPhone;
    }

    @Order(value=56)
    public void setP_SipProvProfileUserEqPhone(String p_SipProvProfileUserEqPhone) {
        P_SipProvProfileUserEqPhone = p_SipProvProfileUserEqPhone;
    }

    public String getP_SipProvProfileCOLPsupported() {
        return P_SipProvProfileCOLPsupported;
    }

    @Order(value=57)
    public void setP_SipProvProfileCOLPsupported(String p_SipProvProfileCOLPsupported) {
        P_SipProvProfileCOLPsupported = p_SipProvProfileCOLPsupported;
    }

    public String getP_SipProvProfCalledPartyN() {
        return P_SipProvProfCalledPartyN;
    }

    @Order(value=58)
    public void setP_SipProvProfCalledPartyN(String p_SipProvProfCalledPartyN) {
        P_SipProvProfCalledPartyN = p_SipProvProfCalledPartyN;
    }

    public String getP_SipProvProfCallingPartyN() {
        return P_SipProvProfCallingPartyN;
    }

    @Order(value=59)
    public void setP_SipProvProfCallingPartyN(String p_SipProvProfCallingPartyN) {
        P_SipProvProfCallingPartyN = p_SipProvProfCallingPartyN;
    }

    public String getP_SipProvProfCallingParNTON() {
        return P_SipProvProfCallingParNTON;
    }

    @Order(value=60)
    public void setP_SipProvProfCallingParNTON(String p_SipProvProfCallingParNTON) {
        P_SipProvProfCallingParNTON = p_SipProvProfCallingParNTON;
    }

    public String getP_SipProvProfileMapProvNumber() {
        return P_SipProvProfileMapProvNumber;
    }

    @Order(value=61)
    public void setP_SipProvProfileMapProvNumber(String p_SipProvProfileMapProvNumber) {
        P_SipProvProfileMapProvNumber = p_SipProvProfileMapProvNumber;
    }

    public String getP_SipProvProfileMappingMode() {
        return P_SipProvProfileMappingMode;
    }

    @Order(value=62)
    public void setP_SipProvProfileMappingMode(String p_SipProvProfileMappingMode) {
        P_SipProvProfileMappingMode = p_SipProvProfileMappingMode;
    }

    public String getP_SipProvProfOutCallingParNTON() {
        return P_SipProvProfOutCallingParNTON;
    }

    @Order(value=63)
    public void setP_SipProvProfOutCallingParNTON(String p_SipProvProfOutCallingParNTON) {
        P_SipProvProfOutCallingParNTON = p_SipProvProfOutCallingParNTON;
    }

    public String getP_SipProvProfInCalledParNTON() {
        return P_SipProvProfInCalledParNTON;
    }

    @Order(value=64)
    public void setP_SipProvProfInCalledParNTON(String p_SipProvProfInCalledParNTON) {
        P_SipProvProfInCalledParNTON = p_SipProvProfInCalledParNTON;
    }

    public String getP_SipProvProfClipNoScreenSupp() {
        return P_SipProvProfClipNoScreenSupp;
    }

    @Order(value=65)
    public void setP_SipProvProfClipNoScreenSupp(String p_SipProvProfClipNoScreenSupp) {
        P_SipProvProfClipNoScreenSupp = p_SipProvProfClipNoScreenSupp;
    }

    public String getP_SipProvProfUseDialNumFormat() {
        return P_SipProvProfUseDialNumFormat;
    }

    @Order(value=67)
    public void setP_SipProvProfUseDialNumFormat(String p_SipProvProfUseDialNumFormat) {
        P_SipProvProfUseDialNumFormat = p_SipProvProfUseDialNumFormat;
    }

    public String getP_SipProvProfOutCalledParNTON() {
        return P_SipProvProfOutCalledParNTON;
    }

    @Order(value=68)
    public void setP_SipProvProfOutCalledParNTON(String p_SipProvProfOutCalledParNTON) {
        P_SipProvProfOutCalledParNTON = p_SipProvProfOutCalledParNTON;
    }

    public String getP_SipProviderE164NP() {
        return P_SipProviderE164NP;
    }

    @Order(value=69)
    public void setP_SipProviderE164NP(String p_SipProviderE164NP) {
        P_SipProviderE164NP = p_SipProviderE164NP;
    }

    public String getP_SipProvProfRouteType() {
        return P_SipProvProfRouteType;
    }

    @Order(value=70)
    public void setP_SipProvProfRouteType(String p_SipProvProfRouteType) {
        P_SipProvProfRouteType = p_SipProvProfRouteType;
    }

    public String getP_SipProvProfOut302Allowed() {
        return P_SipProvProfOut302Allowed;
    }

    @Order(value=71)
    public void setP_SipProvProfOut302Allowed(String p_SipProvProfOut302Allowed) {
        P_SipProvProfOut302Allowed = p_SipProvProfOut302Allowed;
    }

    public String getP_SipProvProfRouteOptimize() {
        return P_SipProvProfRouteOptimize;
    }

    @Order(value=72)
    public void setP_SipProvProfRouteOptimize(String p_SipProvProfRouteOptimize) {
        P_SipProvProfRouteOptimize = p_SipProvProfRouteOptimize;
    }

    public String getP_SipProviderMEXSupported() {
        return P_SipProviderMEXSupported;
    }

    @Order(value=73)
    public void setP_SipProviderMEXSupported(String p_SipProviderMEXSupported) {
        P_SipProviderMEXSupported = p_SipProviderMEXSupported;
    }

    public String getP_SipProvProfContactUriCont() {
        return P_SipProvProfContactUriCont;
    }

    @Order(value=74)
    public void setP_SipProvProfContactUriCont(String p_SipProvProfContactUriCont) {
        P_SipProvProfContactUriCont = p_SipProvProfContactUriCont;
    }

    public String getP_SipProvProfMultipleRoute() {
        return P_SipProvProfMultipleRoute;
    }

    @Order(value=75)
    public void setP_SipProvProfMultipleRoute(String p_SipProvProfMultipleRoute) {
        P_SipProvProfMultipleRoute = p_SipProvProfMultipleRoute;
    }

    public String getP_SipProvProfileInChkRedir() {
        return P_SipProvProfileInChkRedir;
    }

    @Order(value=76)
    public void setP_SipProvProfileInChkRedir(String p_SipProvProfileInChkRedir) {
        P_SipProvProfileInChkRedir = p_SipProvProfileInChkRedir;
    }

    public String getP_SipProvProfileContactTCPPort() {
        return P_SipProvProfileContactTCPPort;
    }

    @Order(value=77)
    public void setP_SipProvProfileContactTCPPort(String p_SipProvProfileContactTCPPort) {
        P_SipProvProfileContactTCPPort = p_SipProvProfileContactTCPPort;
    }

    public String getP_SipProvProfRegFailRetryTime() {
        return P_SipProvProfRegFailRetryTime;
    }

    @Order(value=78)
    public void setP_SipProvProfRegFailRetryTime(String p_SipProvProfRegFailRetryTime) {
        P_SipProvProfRegFailRetryTime = p_SipProvProfRegFailRetryTime;
    }

    public String getP_SipProvProfRegFailRetryMode() {
        return P_SipProvProfRegFailRetryMode;
    }

    @Order(value=79)
    public void setP_SipProvProfRegFailRetryMode(String p_SipProvProfRegFailRetryMode) {
        P_SipProvProfRegFailRetryMode = p_SipProvProfRegFailRetryMode;
    }

    public String getP_SipProvProfRegAfterCallFail() {
        return P_SipProvProfRegAfterCallFail;
    }

    @Order(value=80)
    public void setP_SipProvProfRegAfterCallFail(String p_SipProvProfRegAfterCallFail) {
        P_SipProvProfRegAfterCallFail = p_SipProvProfRegAfterCallFail;
    }

    public String getP_SipProvProfApprovedPeerSel() {
        return P_SipProvProfApprovedPeerSel;
    }

    @Order(value=81)
    public void setP_SipProvProfApprovedPeerSel(String p_SipProvProfApprovedPeerSel) {
        P_SipProvProfApprovedPeerSel = p_SipProvProfApprovedPeerSel;
    }

    public String getP_SipProvProfUseRouteURIAuth() {
        return P_SipProvProfUseRouteURIAuth;
    }

    @Order(value=82)
    public void setP_SipProvProfUseRouteURIAuth(String p_SipProvProfUseRouteURIAuth) {
        P_SipProvProfUseRouteURIAuth = p_SipProvProfUseRouteURIAuth;
    }

    public String getP_SipProvProfActiveHoldMode() {
        return P_SipProvProfActiveHoldMode;
    }

    @Order(value=83)
    public void setP_SipProvProfActiveHoldMode(String p_SipProvProfActiveHoldMode) {
        P_SipProvProfActiveHoldMode = p_SipProvProfActiveHoldMode;
    }

    public String getP_SipProvProfIgnore100Rel() {
        return P_SipProvProfIgnore100Rel;
    }

    @Order(value=84)
    public void setP_SipProvProfIgnore100Rel(String p_SipProvProfIgnore100Rel) {
        P_SipProvProfIgnore100Rel = p_SipProvProfIgnore100Rel;
    }

    public String getP_SipProvProfSupport100Rel() {
        return P_SipProvProfSupport100Rel;
    }

    @Order(value=85)
    public void setP_SipProvProfSupport100Rel(String p_SipProvProfSupport100Rel) {
        P_SipProvProfSupport100Rel = p_SipProvProfSupport100Rel;
    }

    public String getP_SipProvProfileRegContactAddr() {
        return P_SipProvProfileRegContactAddr;
    }

    @Order(value=86)
    public void setP_SipProvProfileRegContactAddr(String p_SipProvProfileRegContactAddr) {
        P_SipProvProfileRegContactAddr = p_SipProvProfileRegContactAddr;
    }

    public String getP_SipProvProfileContactUriWith() {
        return P_SipProvProfileContactUriWith;
    }

    @Order(value=87)
    public void setP_SipProvProfileContactUriWith(String p_SipProvProfileContactUriWith) {
        P_SipProvProfileContactUriWith = p_SipProvProfileContactUriWith;
    }

    public String getP_SipProvProfileRegBNCinContac() {
        return P_SipProvProfileRegBNCinContac;
    }

    @Order(value=88)
    public void setP_SipProvProfileRegBNCinContac(String p_SipProvProfileRegBNCinContac) {
        P_SipProvProfileRegBNCinContac = p_SipProvProfileRegBNCinContac;
    }

    public String getP_SipProvProfileDirectPayload() {
        return P_SipProvProfileDirectPayload;
    }

    @Order(value=89)
    public void setP_SipProvProfileDirectPayload(String p_SipProvProfileDirectPayload) {
        P_SipProvProfileDirectPayload = p_SipProvProfileDirectPayload;
    }

    public String getP_SipProvProfileMRAActiv() {
        return P_SipProvProfileMRAActiv;
    }

    @Order(value=90)
    public void setP_SipProvProfileMRAActiv(String p_SipProvProfileMRAActiv) {
        P_SipProvProfileMRAActiv = p_SipProvProfileMRAActiv;
    }

    public String getP_SipProvChangeDirectionAttr() {
        return P_SipProvChangeDirectionAttr;
    }

    @Order(value=91)
    public void setP_SipProvChangeDirectionAttr(String p_SipProvChangeDirectionAttr) {
        P_SipProvChangeDirectionAttr = p_SipProvChangeDirectionAttr;
    }

    public String getP_SipProvProfPEarlyMediaHeader() {
        return P_SipProvProfPEarlyMediaHeader;
    }

    @Order(value=92)
    public void setP_SipProvProfPEarlyMediaHeader(String p_SipProvProfPEarlyMediaHeader) {
        P_SipProvProfPEarlyMediaHeader = p_SipProvProfPEarlyMediaHeader;
    }

    public String getP_SipProvProfileUseViaRPort() {
        return P_SipProvProfileUseViaRPort;
    }

    @Order(value=93)
    public void setP_SipProvProfileUseViaRPort(String p_SipProvProfileUseViaRPort) {
        P_SipProvProfileUseViaRPort = p_SipProvProfileUseViaRPort;
    }

    public String getP_SipProvProfileUPDATESupporte() {
        return P_SipProvProfileUPDATESupporte;
    }

    @Order(value=94)
    public void setP_SipProvProfileUPDATESupporte(String p_SipProvProfileUPDATESupporte) {
        P_SipProvProfileUPDATESupporte = p_SipProvProfileUPDATESupporte;
    }

    public String getP_SipProvProfileSessionTimer() {
        return P_SipProvProfileSessionTimer;
    }

    @Order(value=95)
    public void setP_SipProvProfileSessionTimer(String p_SipProvProfileSessionTimer) {
        P_SipProvProfileSessionTimer = p_SipProvProfileSessionTimer;
    }

    public String getP_SipProvProfileProgressTimer() {
        return P_SipProvProfileProgressTimer;
    }

    @Order(value=96)
    public void setP_SipProvProfileProgressTimer(String p_SipProvProfileProgressTimer) {
        P_SipProvProfileProgressTimer = p_SipProvProfileProgressTimer;
    }

    public String getP_SipProvProfileUdpKeepAlive() {
        return P_SipProvProfileUdpKeepAlive;
    }

    @Order(value=97)
    public void setP_SipProvProfileUdpKeepAlive(String p_SipProvProfileUdpKeepAlive) {
        P_SipProvProfileUdpKeepAlive = p_SipProvProfileUdpKeepAlive;
    }

    public String getP_SipProvProfOptKeepAliveTimer() {
        return P_SipProvProfOptKeepAliveTimer;
    }

    @Order(value=98)
    public void setP_SipProvProfOptKeepAliveTimer(String p_SipProvProfOptKeepAliveTimer) {
        P_SipProvProfOptKeepAliveTimer = p_SipProvProfOptKeepAliveTimer;
    }

    public String getP_SipProvProfileOptionFailover() {
        return P_SipProvProfileOptionFailover;
    }

    @Order(value=99)
    public void setP_SipProvProfileOptionFailover(String p_SipProvProfileOptionFailover) {
        P_SipProvProfileOptionFailover = p_SipProvProfileOptionFailover;
    }

    public String getP_SipProvProfAnswer2Options() {
        return P_SipProvProfAnswer2Options;
    }

    @Order(value=100)
    public void setP_SipProvProfAnswer2Options(String p_SipProvProfAnswer2Options) {
        P_SipProvProfAnswer2Options = p_SipProvProfAnswer2Options;
    }

    public String getP_SipProvProfRespCodeIndex() {
        return P_SipProvProfRespCodeIndex;
    }

    @Order(value=101)
    public void setP_SipProvProfRespCodeIndex(String p_SipProvProfRespCodeIndex) {
        P_SipProvProfRespCodeIndex = p_SipProvProfRespCodeIndex;
    }

    public String getP_SipProvProfiSilenceSupSup() {
        return P_SipProvProfiSilenceSupSup;
    }

    @Order(value=102)
    public void setP_SipProvProfiSilenceSupSup(String p_SipProvProfiSilenceSupSup) {
        P_SipProvProfiSilenceSupSup = p_SipProvProfiSilenceSupSup;
    }

    public String getP_SipProvProfileMediaSecSup() {
        return P_SipProvProfileMediaSecSup;
    }

    @Order(value=103)
    public void setP_SipProvProfileMediaSecSup(String p_SipProvProfileMediaSecSup) {
        P_SipProvProfileMediaSecSup = p_SipProvProfileMediaSecSup;
    }

    public String getP_SipProvProfileSDPFilterIndex() {
        return P_SipProvProfileSDPFilterIndex;
    }

    @Order(value=104)
    public void setP_SipProvProfileSDPFilterIndex(String p_SipProvProfileSDPFilterIndex) {
        P_SipProvProfileSDPFilterIndex = p_SipProvProfileSDPFilterIndex;
    }

    public String getP_SipProvProfSupport100RelUAS() {
        return P_SipProvProfSupport100RelUAS;
    }

    @Order(value=105)
    public void setP_SipProvProfSupport100RelUAS(String p_SipProvProfSupport100RelUAS) {
        P_SipProvProfSupport100RelUAS = p_SipProvProfSupport100RelUAS;
    }

    public String getP_SipProvProfSwitchBack2Prim() {
        return P_SipProvProfSwitchBack2Prim;
    }

    @Order(value=106)
    public void setP_SipProvProfSwitchBack2Prim(String p_SipProvProfSwitchBack2Prim) {
        P_SipProvProfSwitchBack2Prim = p_SipProvProfSwitchBack2Prim;
    }

    public void parseDataFromString(String data){

        String[] splited = data.split("\\|");

        System.out.println("Splited length: " + splited.length);

        Class curClass = ITSPProfile.class;
        Method[] allMethods = curClass.getMethods();
        Arrays.sort(allMethods, new Comparator<Method>() {
            @Override
            public int compare(Method o1, Method o2) {
                Order or1 = o1.getAnnotation(Order.class);
                Order or2 = o2.getAnnotation(Order.class);
                // nulls last
                if (or1 != null && or2 != null) {
                    return or1.value() - or2.value();
                } else
                if (or1 != null && or2 == null) {
                    return -1;
                } else
                if (or1 == null && or2 != null) {
                    return 1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        List<Method> setters = new ArrayList<Method>();
        for(Method method : allMethods) {
            if(method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        System.out.println("setters: " + setters.size());
        for(int i = 0; i < setters.size(); i++)
        {
            try {
                System.out.println("Splited: " + splited[i]);
                setters.get(i).invoke(this, splited[i]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "ITSPProfile{" +
                "P_SipProviderId='" + P_SipProviderId + '\'' +
                ", P_SipProviderBaseId='" + P_SipProviderBaseId + '\'' +
                ", P_SipProviderActive=" + P_SipProviderActive +
                ", P_SipProviderName='" + P_SipProviderName + '\'' +
                ", P_SipGwDomainName='" + P_SipGwDomainName + '\'' +
                ", P_SipProviderInterfaceSelect='" + P_SipProviderInterfaceSelect + '\'' +
                ", P_SipProviderIPVersion='" + P_SipProviderIPVersion + '\'' +
                ", P_SipProviderTransportProtocol='" + P_SipProviderTransportProtocol + '\'' +
                ", P_SipProviderUdpMode='" + P_SipProviderUdpMode + '\'' +
                ", P_SipProviderSignalProtocol='" + P_SipProviderSignalProtocol + '\'' +
                ", P_SipProviderSecurity='" + P_SipProviderSecurity + '\'' +
                ", P_SipProviderMediaSecurity='" + P_SipProviderMediaSecurity + '\'' +
                ", P_SipProviderSuppSecurity='" + P_SipProviderSuppSecurity + '\'' +
                ", P_SipProviderUseRegistrar=" + P_SipProviderUseRegistrar +
                ", P_SipProviderRegistrarIPName='" + P_SipProviderRegistrarIPName + '\'' +
                ", P_SipProviderRegistrarPort='" + P_SipProviderRegistrarPort + '\'' +
                ", P_SipProviderReregistrationInt='" + P_SipProviderReregistrationInt + '\'' +
                ", P_SipProviderUseProxy=" + P_SipProviderUseProxy +
                ", P_SipProviderIPNameProxy='" + P_SipProviderIPNameProxy + '\'' +
                ", P_SipProviderPortProxy='" + P_SipProviderPortProxy + '\'' +
                ", P_SipProviderUseOutboundProxy=" + P_SipProviderUseOutboundProxy +
                ", P_SipProviderIPNameOutboundPr='" + P_SipProviderIPNameOutboundPr + '\'' +
                ", P_SipProviderPortOutboundProx='" + P_SipProviderPortOutboundProx + '\'' +
                ", P_SipProviderUseInboundProxy=" + P_SipProviderUseInboundProxy +
                ", P_SipProviderIPNameInboundPr='" + P_SipProviderIPNameInboundPr + '\'' +
                ", P_SipProviderPortInboundProx='" + P_SipProviderPortInboundProx + '\'' +
                ", P_SipProviderInterfaceType='" + P_SipProviderInterfaceType + '\'' +
                ", P_SipDeviceId='" + P_SipDeviceId + '\'' +
                ", P_SipProviderPreconfigured=" + P_SipProviderPreconfigured +
                ", P_SipProviderCountryCode='" + P_SipProviderCountryCode + '\'' +
                ", P_SipProviderAreaCode='" + P_SipProviderAreaCode + '\'' +
                ", P_SipProviderPABXNo='" + P_SipProviderPABXNo + '\'' +
                ", P_SipProviderUseStun=" + P_SipProviderUseStun +
                ", P_SipProviderStunServerIPName='" + P_SipProviderStunServerIPName + '\'' +
                ", P_SipProviderStunServerPort='" + P_SipProviderStunServerPort + '\'' +
                ", P_SipProvProfileStunMode='" + P_SipProvProfileStunMode + '\'' +
                ", P_SipIntIntendedForBranding='" + P_SipIntIntendedForBranding + '\'' +
                ", P_SipIntProfileIdentifier='" + P_SipIntProfileIdentifier + '\'' +
                ", P_SipIntProfileIntParamIssue='" + P_SipIntProfileIntParamIssue + '\'' +
                ", P_SipProvProfCLIPFromNameA='" + P_SipProvProfCLIPFromNameA + '\'' +
                ", P_SipProvProfCLIPFromAddrS='" + P_SipProvProfCLIPFromAddrS + '\'' +
                ", P_SipProvProfileFromURIDomain='" + P_SipProvProfileFromURIDomain + '\'' +
                ", P_SipProvProfileRedirNrInFrom=" + P_SipProvProfileRedirNrInFrom +
                ", P_SipProvProfileOrigNrInPAI=" + P_SipProvProfileOrigNrInPAI +
                ", P_SipProvProfCLIPPAssIdA='" + P_SipProvProfCLIPPAssIdA + '\'' +
                ", P_SipProvProfCLIPPAssIdS='" + P_SipProvProfCLIPPAssIdS + '\'' +
                ", P_SipProvProfCLIPPPrefNameA='" + P_SipProvProfCLIPPPrefNameA + '\'' +
                ", P_SipProvProfCLIPPPrefAddrS='" + P_SipProvProfCLIPPPrefAddrS + '\'' +
                ", P_SipProvProfDivNameA='" + P_SipProvProfDivNameA + '\'' +
                ", P_SipProvProfDivAddrS='" + P_SipProvProfDivAddrS + '\'' +
                ", P_SipProvProfHistInfoNameA='" + P_SipProvProfHistInfoNameA + '\'' +
                ", P_SipProvProfHistInfoAddrS='" + P_SipProvProfHistInfoAddrS + '\'' +
                ", P_SipProvProfCLIRFromNameA='" + P_SipProvProfCLIRFromNameA + '\'' +
                ", P_SipProvProfCLIRFromAddrS='" + P_SipProvProfCLIRFromAddrS + '\'' +
                ", P_SipProvProfCLIRPrivacy='" + P_SipProvProfCLIRPrivacy + '\'' +
                ", P_SipProvProfileUserEqPhone='" + P_SipProvProfileUserEqPhone + '\'' +
                ", P_SipProvProfileCOLPsupported='" + P_SipProvProfileCOLPsupported + '\'' +
                ", P_SipProvProfCalledPartyN='" + P_SipProvProfCalledPartyN + '\'' +
                ", P_SipProvProfCallingPartyN='" + P_SipProvProfCallingPartyN + '\'' +
                ", P_SipProvProfCallingParNTON='" + P_SipProvProfCallingParNTON + '\'' +
                ", P_SipProvProfileMapProvNumber=" + P_SipProvProfileMapProvNumber +
                ", P_SipProvProfileMappingMode='" + P_SipProvProfileMappingMode + '\'' +
                ", P_SipProvProfOutCallingParNTON='" + P_SipProvProfOutCallingParNTON + '\'' +
                ", P_SipProvProfInCalledParNTON='" + P_SipProvProfInCalledParNTON + '\'' +
                ", P_SipProvProfClipNoScreenSupp='" + P_SipProvProfClipNoScreenSupp + '\'' +
                ", P_SipProvProfUseDialNumFormat='" + P_SipProvProfUseDialNumFormat + '\'' +
                ", P_SipProvProfOutCalledParNTON='" + P_SipProvProfOutCalledParNTON + '\'' +
                ", P_SipProviderE164NP='" + P_SipProviderE164NP + '\'' +
                ", P_SipProvProfRouteType='" + P_SipProvProfRouteType + '\'' +
                ", P_SipProvProfOut302Allowed='" + P_SipProvProfOut302Allowed + '\'' +
                ", P_SipProvProfRouteOptimize='" + P_SipProvProfRouteOptimize + '\'' +
                ", P_SipProviderMEXSupported='" + P_SipProviderMEXSupported + '\'' +
                ", P_SipProvProfContactUriCont='" + P_SipProvProfContactUriCont + '\'' +
                ", P_SipProvProfMultipleRoute='" + P_SipProvProfMultipleRoute + '\'' +
                ", P_SipProvProfileInChkRedir='" + P_SipProvProfileInChkRedir + '\'' +
                ", P_SipProvProfileContactTCPPort='" + P_SipProvProfileContactTCPPort + '\'' +
                ", P_SipProvProfRegFailRetryTime='" + P_SipProvProfRegFailRetryTime + '\'' +
                ", P_SipProvProfRegFailRetryMode='" + P_SipProvProfRegFailRetryMode + '\'' +
                ", P_SipProvProfRegAfterCallFail='" + P_SipProvProfRegAfterCallFail + '\'' +
                ", P_SipProvProfApprovedPeerSel='" + P_SipProvProfApprovedPeerSel + '\'' +
                ", P_SipProvProfUseRouteURIAuth=" + P_SipProvProfUseRouteURIAuth +
                ", P_SipProvProfActiveHoldMode='" + P_SipProvProfActiveHoldMode + '\'' +
                ", P_SipProvProfIgnore100Rel=" + P_SipProvProfIgnore100Rel +
                ", P_SipProvProfSupport100Rel=" + P_SipProvProfSupport100Rel +
                ", P_SipProvProfileRegContactAddr='" + P_SipProvProfileRegContactAddr + '\'' +
                ", P_SipProvProfileContactUriWith=" + P_SipProvProfileContactUriWith +
                ", P_SipProvProfileRegBNCinContac='" + P_SipProvProfileRegBNCinContac + '\'' +
                ", P_SipProvProfileDirectPayload=" + P_SipProvProfileDirectPayload +
                ", P_SipProvProfileMRAActiv=" + P_SipProvProfileMRAActiv +
                ", P_SipProvChangeDirectionAttr='" + P_SipProvChangeDirectionAttr + '\'' +
                ", P_SipProvProfPEarlyMediaHeader='" + P_SipProvProfPEarlyMediaHeader + '\'' +
                ", P_SipProvProfileUseViaRPort=" + P_SipProvProfileUseViaRPort +
                ", P_SipProvProfileUPDATESupporte=" + P_SipProvProfileUPDATESupporte +
                ", P_SipProvProfileSessionTimer='" + P_SipProvProfileSessionTimer + '\'' +
                ", P_SipProvProfileProgressTimer='" + P_SipProvProfileProgressTimer + '\'' +
                ", P_SipProvProfileUdpKeepAlive='" + P_SipProvProfileUdpKeepAlive + '\'' +
                ", P_SipProvProfOptKeepAliveTimer='" + P_SipProvProfOptKeepAliveTimer + '\'' +
                ", P_SipProvProfileOptionFailover='" + P_SipProvProfileOptionFailover + '\'' +
                ", P_SipProvProfAnswer2Options='" + P_SipProvProfAnswer2Options + '\'' +
                ", P_SipProvProfRespCodeIndex='" + P_SipProvProfRespCodeIndex + '\'' +
                ", P_SipProvProfiSilenceSupSup='" + P_SipProvProfiSilenceSupSup + '\'' +
                ", P_SipProvProfileMediaSecSup='" + P_SipProvProfileMediaSecSup + '\'' +
                ", P_SipProvProfileSDPFilterIndex='" + P_SipProvProfileSDPFilterIndex + '\'' +
                ", P_SipProvProfSupport100RelUAS='" + P_SipProvProfSupport100RelUAS + '\'' +
                ", P_SipProvProfSwitchBack2Prim='" + P_SipProvProfSwitchBack2Prim + '\'' +
                '}';
    }
}
