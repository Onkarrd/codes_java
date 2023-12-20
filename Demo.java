import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {

  static void modify(List<Integer> s, List<Integer> t) {
    t.addAll(s.stream().distinct().toList());
  }

  public static void main(String[] args) {
    List<String> infoTags = handleMultipleInfoTags(123,
        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<INFO_LIST><INFO>\n"
            + "<APP version=\"\" name=\"Citrix Virtual Apps and Desktops 7 2203 LTSR CU2 - Virtual Delivery Agent\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"SAP Secure Login Client (x64)\" installDate=\"\" publisher=\"SAP\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix CDF Capture Service - x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX Devices x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"AccessData Enterprise Agent\" installDate=\"\" publisher=\"AccessData\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\AccessData\\Agent\\\"/>\n"
            + "<APP version=\"\" name=\"SafeNet Authentication Client 10.8C AKL\" installDate=\"\" publisher=\"Thales\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\SafeNet\\Authentication\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix Group Policy Client-Side Extension 7.33.2000.12\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Citrix\"/>\n"
            + "<APP version=\"\" name=\"PegaSystems_PegaActiveXControls_6o3_602_EN\" installDate=\"\" publisher=\"PegaSystems\" UninstallString=\"\" language=\"\" installPath=\"C:\\windows\\Downloaded Program Files\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2010  x64 Redistributable - 10.0.40219\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX Printing x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Environment Manager Agent 2019.1 SP2 HF4\" installDate=\"\" publisher=\"Ivanti\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix Universal Print Client\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Machine Identity Service Agent\" installDate=\"\" publisher=\"Citrix Systems,Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Citrix\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X64 Additional Runtime - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2008 Redistributable - x64 9.0.30729.4148\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"UniversalForwarder\" installDate=\"\" publisher=\"Splunk, Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\SplunkUniversalForwarder\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix Monitor Service VDA Plugin\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix Profile management\" installDate=\"\" publisher=\"Citrix Systems Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Citrix\\User Profile Manager\\\"/>\n"
            + "<APP version=\"\" name=\"64 Bit HP CIO Components Installer\" installDate=\"\" publisher=\"HP Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"CrowdStrike Firmware Analysis\" installDate=\"\" publisher=\"CrowdStrike, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix WMI Proxy Plugin\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"PegaSystems ActiveX Control\" installDate=\"\" publisher=\"PegaSystems\" UninstallString=\"\" language=\"\" installPath=\"C:\\windows\\Downloaded Program Files\\\"/>\n"
            + "<APP version=\"\" name=\"SafeNet Authentication Client 10.2 updated AKL\" installDate=\"\" publisher=\"Gemalto\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\SafeNet\\Authentication\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix Director VDA Plugin\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Application Control Agent 2019.1 HF1\" installDate=\"\" publisher=\"Ivanti\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2008 Redistributable - x64 9.0.30729.6161\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"VMware Tools\" installDate=\"\" publisher=\"VMware, Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\VMware\\VMware Tools\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix Virtual Desktop Agent - x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Deployment Agent (CCA) 2019.1 SP2 HF1\" installDate=\"\" publisher=\"Ivanti\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix Diagnostics Facility\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Java 8 Update 381 (64-bit)\" installDate=\"\" publisher=\"Oracle Corporation\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Java\\jre-1.8\\\"/>\n"
            + "<APP version=\"\" name=\"UpmVDAPlugin\" installDate=\"\" publisher=\"Citrix Systems Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix 2203 LTSR CU2 - Provisioning Target Device x64 \" installDate=\"\" publisher=\"Citrix Systems, Inc\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Citrix\\Provisioning Services\\\"/>\n"
            + "<APP version=\"5.1.50907.0\" name=\"Microsoft Silverlight\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"c:\\Program Files\\Microsoft Silverlight\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office 64-bit Components 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Shared 64-bit MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Shared 64-bit Setup Metadata MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 x64 Additional Runtime - 12.0.21005\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Endpoint Classifier\" installDate=\"\" publisher=\"Forcepoint\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Websense\\Websense Endpoint\\\"/>\n"
            + "<APP version=\"\" name=\"CrowdStrike Device Control\" installDate=\"\" publisher=\"CrowdStrike, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 x64 Minimum Runtime - 12.0.21005\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX Audio x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix Identity Assertion VDA Plugin\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX WS x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X64 Minimum Runtime - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Performance Manager Agent 2018.3 SP1\" installDate=\"\" publisher=\"Ivanti\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"SupportabilityTools\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX App Experience x64\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Citrix HDX TS\" installDate=\"\" publisher=\"Copyright Citrix Systems, Inc.  All rights reserved.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"Machine Management WMI Provider\" installDate=\"\" publisher=\"Citrix Systems,Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Citrix\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix App Layering Image Preparation Utility\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Unidesk\\\"/>\n"
            + "<APP version=\"\" name=\"CrowdStrike Sensor Platform\" installDate=\"\" publisher=\"CrowdStrike, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"ControlUpAgent\" installDate=\"\" publisher=\"Smart-X\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Smart-X\\ControlUpAgent\\\"/>\n"
            + "<APP version=\"\" name=\"Citrix Browser Content Redirection\" installDate=\"\" publisher=\"Citrix Systems, Inc.\" UninstallString=\"\" language=\"\" installPath=\"\"/>\n"
            + "<APP version=\"\" name=\"FORCEPOINT ONE ENDPOINT\" installDate=\"\" publisher=\"Forcepoint LLC\" UninstallString=\"\" language=\"\" installPath=\"C:\\Program Files\\Websense\\Websense Endpoint\\\"/>\n"
            + "</INFO>\n"
            + "<INFO>\n"
            + "<APP version=\"\" name=\"Microsoft Project Professional 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Professional Plus 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visio Professional 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"SAP GUI for Windows 7.70  (Patch 6)\" installDate=\"\" publisher=\"SAP SE\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Tanium Client 7.4.9.1077\" installDate=\"\" publisher=\"Tanium Inc.\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 Redistributable (x64) - 12.0.30501\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2008 Redistributable - x86 9.0.30729.4148\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"SHD_Corporate 2019.1\" installDate=\"\" publisher=\"Ivanti\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2015-2022 Redistributable (x64) - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Java Deployment Ruleset 5.0\" installDate=\"\" publisher=\"Oracle\" installPath=\"C:\\windows\\Sun\\Java\\Deployment\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2012 Redistributable (x86) - 11.0.61030\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2015-2022 Redistributable (x86) - 14.31.31103\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X86 Minimum Runtime - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Google Chrome\" installDate=\"\" publisher=\"Google LLC\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"FedLine Advantage Connection Utility v2\" installDate=\"\" publisher=\"Federal Reserve Banks\" installPath=\"C:\\Program Files (x86)\\FedLine Advantage v2\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X86 Additional Runtime - 14.31.31103\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Environment Manager Configuration 'SHD - Corporate 2019.1 SP2' 2019.1 SP2\" installDate=\"\" publisher=\"Ivanti\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Java 8 Update 381\" installDate=\"\" publisher=\"Oracle Corporation\" installPath=\"C:\\Program Files (x86)\\Java\\jre-1.8\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X86 Minimum Runtime - 14.31.31103\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 x86 Minimum Runtime - 12.0.40664\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2015-2022 Redistributable (x86) - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Professional Plus 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3114690) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft PowerPoint 2016 (KB4504720) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Visio 2016 (KB5002418) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4493154) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft OneNote 2016 (KB4484434) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4011574) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Access 2016 (KB4504711) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3191869) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002251) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3118335) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Definition Update for Microsoft Office 2016 (KB3115407) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002293) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002197) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Outlook 2016 (KB5002459) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002244) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB2920727) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Word 2016 (KB5002464) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4484104) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002458) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Publisher 2016 (KB5002462) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4018319) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4011621) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022172) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3213551) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4475581) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Skype for Business 2016 (KB4475545) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Access MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Excel MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft PowerPoint MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft PowerPoint 2016 (KB4504720) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Publisher MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Publisher 2016 (KB5002462) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Outlook MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Outlook 2016 (KB5002459) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Word 2016 (KB5002464) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Word MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Word 2016 (KB5002464) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Proofing Tools 2016 - English\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Outils de vérification linguistique 2016 de Microsoft Office - Français\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Herramientas de corrección de Microsoft Office 2016: español\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft OneNote 2016 (KB4484434) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Skype for Business 2016 (KB4475545) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft OneNote 2016 (KB4484434) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Skype for Business 2016 (KB4475545) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft OneNote 2016 (KB4484434) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Skype for Business 2016 (KB4475545) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Proofing (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Project Professional 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4493154) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3191869) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002251) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Definition Update for Microsoft Office 2016 (KB3115407) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002293) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Outlook 2016 (KB5002459) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002244) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB2920727) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4484104) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002458) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4018319) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022172) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft InfoPath MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visio Professional 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4464587) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Visio 2016 (KB5002418) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4493154) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3191869) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3085538) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002251) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4462148) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Definition Update for Microsoft Office 2016 (KB3115407) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002293) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002117) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Outlook 2016 (KB5002459) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4486670) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002244) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB2920727) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB4484104) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002458) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4018319) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022172) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Update for Microsoft Office 2016 (KB5002307) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visio MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Visio 2016 (KB5002418) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Shared MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4011574) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3213551) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4011574) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3213551) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4022176) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Excel 2016 (KB5002463) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4011574) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002419) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB5002465) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB3213551) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Office 2016 (KB4484103) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft DCF MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft OneNote MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft OneNote 2016 (KB4484434) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Project MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Project 2016 (KB5002328) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Groove MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office OSM MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office OSM UX MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Office Shared Setup Metadata MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Access Setup Metadata MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Skype for Business MUI (English) 2016\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"C:\\Program Files (x86)\\Microsoft Office\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Microsoft Word 2016 (KB5002464) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Security Update for Skype for Business 2016 (KB4475545) 32-Bit Edition\" installDate=\"\" publisher=\"Microsoft\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2008 Redistributable - x86 9.0.30729.6161\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 Redistributable (x86) - 12.0.40664\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2022 X86 Additional Runtime - 14.32.31326\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"23.001.20174\" name=\"Adobe Acrobat Reader\" installDate=\"\" publisher=\"Adobe Systems Incorporated\" installPath=\"C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2012 x86 Additional Runtime - 11.0.61030\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2012 x86 Minimum Runtime - 11.0.61030\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"PhishAlarm Outlook Add-In\" installDate=\"\" publisher=\"Proofpoint, Inc.\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 x86 Additional Runtime - 12.0.40664\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"CrowdStrike Windows Sensor\" installDate=\"\" publisher=\"CrowdStrike, Inc.\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2010  x86 Redistributable - 10.0.40219\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Ivanti Performance Manager Configuration 'XenApp Baseline v10' 10.1.0.0\" installDate=\"\" publisher=\"Ivanti\" installPath=\"\" language=\"\" UninstallString=\"\"/>\n"
            + "<APP version=\"\" name=\"Microsoft Visual C++ 2013 Redistributable (x86) - 12.0.30501\" installDate=\"\" publisher=\"Microsoft Corporation\" installPath=\"\" language=\"\" UninstallString=\"\"/></INFO_LIST>\n"
            + "</INFO>");

    System.out.println(infoTags.size());
    infoTags.forEach(s -> {
      System.out.println(
          "info ---------------------------------------------------------------------------------------------------------");
      System.out.println(s);
    });

  }

  private static List<String> handleMultipleInfoTags(int qid, String infoStr) {
    List<String> infoStrList = new ArrayList<>();

    try {
      //replace all new lines, tabs and spaces from string
      infoStr = infoStr.replaceAll("\n", "").replaceAll("\t", "");

      //<?xml version="1.0" encoding="UTF-8" standalone="yes"?><INFO/>
      if (infoStr.contains("<INFO/>")) {
        infoStrList.add(infoStr);
        System.out.println("Info tag is empty. qid :" + qid + ", Info Tag : " + infoStr);
        return infoStrList;
      }

      // if multi level info, remove outer info
      if (infoStr.contains("<INFO><INFO>")) {
        infoStr = infoStr.substring(infoStr.indexOf("<INFO>") + 6, infoStr.lastIndexOf("</INFO>"));
      }

      StringBuilder vulnInfoSB = new StringBuilder(infoStr);

      while (vulnInfoSB.length() != 0) {
        infoStrList.add(
            vulnInfoSB.substring(vulnInfoSB.indexOf("<INFO>"), vulnInfoSB.indexOf("</INFO>") + 7));
        if ((vulnInfoSB.indexOf("</INFO>") + 7) >= vulnInfoSB.length()) {
          vulnInfoSB = new StringBuilder();
        } else {
          vulnInfoSB.replace(vulnInfoSB.indexOf("<INFO>"), vulnInfoSB.indexOf("</INFO>") + 7, "");
        }
      }
    } catch (Exception exc) {
      System.out.println("Error in parsing vuln info string, falling back to default behavior. ");
      exc.printStackTrace();
      infoStrList.add(infoStr);
    }

    return infoStrList;
  }

}
