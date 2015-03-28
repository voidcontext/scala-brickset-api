package com.brickset.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-03-28T18:10:42.234-04:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://brickset.com/api/", name = "BricksetAPIv2Soap")
@XmlSeeAlso({ObjectFactory.class})
public interface BricksetAPIv2Soap {

    @WebMethod(action = "http://brickset.com/api/setCollection")
    @RequestWrapper(localName = "setCollection", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollection")
    @ResponseWrapper(localName = "setCollectionResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionResponse")
    @WebResult(name = "setCollectionResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollection(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID,
        @WebParam(name = "qtyOwned", targetNamespace = "http://brickset.com/api/")
        int qtyOwned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        int wanted
    );

    @WebMethod(operationName = "setCollection_wants", action = "http://brickset.com/api/setCollection_wants")
    @RequestWrapper(localName = "setCollection_wants", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionWants")
    @ResponseWrapper(localName = "setCollection_wantsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionWantsResponse")
    @WebResult(name = "setCollection_wantsResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollectionWants(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        int wanted
    );

    @WebMethod(action = "http://brickset.com/api/getReviews")
    @RequestWrapper(localName = "getReviews", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetReviews")
    @ResponseWrapper(localName = "getReviewsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetReviewsResponse")
    @WebResult(name = "getReviewsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfReviews getReviews(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID
    );

    @WebMethod(action = "http://brickset.com/api/getCollectionDetail")
    @RequestWrapper(localName = "getCollectionDetail", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetCollectionDetail")
    @ResponseWrapper(localName = "getCollectionDetailResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetCollectionDetailResponse")
    @WebResult(name = "getCollectionDetailResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfCollectionDetails getCollectionDetail(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "SetID", targetNamespace = "http://brickset.com/api/")
        java.lang.String setID
    );

    @WebMethod(action = "http://brickset.com/api/getRecentlyUpdatedSets")
    @RequestWrapper(localName = "getRecentlyUpdatedSets", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetRecentlyUpdatedSets")
    @ResponseWrapper(localName = "getRecentlyUpdatedSetsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetRecentlyUpdatedSetsResponse")
    @WebResult(name = "getRecentlyUpdatedSetsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfSets getRecentlyUpdatedSets(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "minutesAgo", targetNamespace = "http://brickset.com/api/")
        int minutesAgo
    );

    @WebMethod(action = "http://brickset.com/api/getThemes")
    @RequestWrapper(localName = "getThemes", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetThemes")
    @ResponseWrapper(localName = "getThemesResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetThemesResponse")
    @WebResult(name = "getThemesResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfThemes getThemes(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey
    );

    @WebMethod(operationName = "setCollection_qtyOwned", action = "http://brickset.com/api/setCollection_qtyOwned")
    @RequestWrapper(localName = "setCollection_qtyOwned", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionQtyOwned")
    @ResponseWrapper(localName = "setCollection_qtyOwnedResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionQtyOwnedResponse")
    @WebResult(name = "setCollection_qtyOwnedResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollectionQtyOwned(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID,
        @WebParam(name = "qtyOwned", targetNamespace = "http://brickset.com/api/")
        int qtyOwned
    );

    @WebMethod(action = "http://brickset.com/api/getMinifigCollection")
    @RequestWrapper(localName = "getMinifigCollection", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetMinifigCollection")
    @ResponseWrapper(localName = "getMinifigCollectionResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetMinifigCollectionResponse")
    @WebResult(name = "getMinifigCollectionResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfMinifigCollection getMinifigCollection(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "query", targetNamespace = "http://brickset.com/api/")
        java.lang.String query,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        java.lang.String owned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        java.lang.String wanted
    );

    @WebMethod(action = "http://brickset.com/api/checkKey")
    @RequestWrapper(localName = "checkKey", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.CheckKey")
    @ResponseWrapper(localName = "checkKeyResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.CheckKeyResponse")
    @WebResult(name = "checkKeyResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String checkKey(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey
    );

    @WebMethod(action = "http://brickset.com/api/setCollectionDetail")
    @RequestWrapper(localName = "setCollectionDetail", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionDetail")
    @ResponseWrapper(localName = "setCollectionDetailResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionDetailResponse")
    @WebResult(name = "setCollectionDetailResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollectionDetail(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "detail", targetNamespace = "http://brickset.com/api/")
        com.brickset.api.CollectionDetails detail
    );

    @WebMethod(action = "http://brickset.com/api/getSet")
    @RequestWrapper(localName = "getSet", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSet")
    @ResponseWrapper(localName = "getSetResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSetResponse")
    @WebResult(name = "getSetResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfSets getSet(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "SetID", targetNamespace = "http://brickset.com/api/")
        java.lang.String setID
    );

    @WebMethod(action = "http://brickset.com/api/getCollectionDetailConditions")
    @RequestWrapper(localName = "getCollectionDetailConditions", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetCollectionDetailConditions")
    @ResponseWrapper(localName = "getCollectionDetailConditionsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetCollectionDetailConditionsResponse")
    @WebResult(name = "getCollectionDetailConditionsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfConditions getCollectionDetailConditions(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "which", targetNamespace = "http://brickset.com/api/")
        java.lang.String which
    );

    @WebMethod(operationName = "setCollection_userNotes", action = "http://brickset.com/api/setCollection_userNotes")
    @RequestWrapper(localName = "setCollection_userNotes", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionUserNotes")
    @ResponseWrapper(localName = "setCollection_userNotesResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionUserNotesResponse")
    @WebResult(name = "setCollection_userNotesResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollectionUserNotes(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID,
        @WebParam(name = "notes", targetNamespace = "http://brickset.com/api/")
        java.lang.String notes
    );

    @WebMethod(action = "http://brickset.com/api/getYearsForUser")
    @RequestWrapper(localName = "getYearsForUser", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetYearsForUser")
    @ResponseWrapper(localName = "getYearsForUserResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetYearsForUserResponse")
    @WebResult(name = "getYearsForUserResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfYears getYearsForUser(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "theme", targetNamespace = "http://brickset.com/api/")
        java.lang.String theme,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        java.lang.String owned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        java.lang.String wanted
    );

    @WebMethod(action = "http://brickset.com/api/getYears")
    @RequestWrapper(localName = "getYears", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetYears")
    @ResponseWrapper(localName = "getYearsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetYearsResponse")
    @WebResult(name = "getYearsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfYears getYears(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "theme", targetNamespace = "http://brickset.com/api/")
        java.lang.String theme
    );

    @WebMethod(action = "http://brickset.com/api/getSubthemesForUser")
    @RequestWrapper(localName = "getSubthemesForUser", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSubthemesForUser")
    @ResponseWrapper(localName = "getSubthemesForUserResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSubthemesForUserResponse")
    @WebResult(name = "getSubthemesForUserResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfSubthemes getSubthemesForUser(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "theme", targetNamespace = "http://brickset.com/api/")
        java.lang.String theme,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        java.lang.String owned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        java.lang.String wanted
    );

    @WebMethod(action = "http://brickset.com/api/getThemesForUser")
    @RequestWrapper(localName = "getThemesForUser", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetThemesForUser")
    @ResponseWrapper(localName = "getThemesForUserResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetThemesForUserResponse")
    @WebResult(name = "getThemesForUserResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfThemes getThemesForUser(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        java.lang.String owned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        java.lang.String wanted
    );

    @WebMethod(action = "http://brickset.com/api/getInstructions")
    @RequestWrapper(localName = "getInstructions", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetInstructions")
    @ResponseWrapper(localName = "getInstructionsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetInstructionsResponse")
    @WebResult(name = "getInstructionsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfInstructions getInstructions(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID
    );

    @WebMethod(action = "http://brickset.com/api/login")
    @RequestWrapper(localName = "login", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.LoginResponse")
    @WebResult(name = "loginResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String login(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "username", targetNamespace = "http://brickset.com/api/")
        java.lang.String username,
        @WebParam(name = "password", targetNamespace = "http://brickset.com/api/")
        java.lang.String password
    );

    @WebMethod(action = "http://brickset.com/api/getSets")
    @RequestWrapper(localName = "getSets", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSets")
    @ResponseWrapper(localName = "getSetsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSetsResponse")
    @WebResult(name = "getSetsResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfSets getSets(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "query", targetNamespace = "http://brickset.com/api/")
        java.lang.String query,
        @WebParam(name = "theme", targetNamespace = "http://brickset.com/api/")
        java.lang.String theme,
        @WebParam(name = "subtheme", targetNamespace = "http://brickset.com/api/")
        java.lang.String subtheme,
        @WebParam(name = "setNumber", targetNamespace = "http://brickset.com/api/")
        java.lang.String setNumber,
        @WebParam(name = "year", targetNamespace = "http://brickset.com/api/")
        java.lang.String year,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        java.lang.String owned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        java.lang.String wanted,
        @WebParam(name = "orderBy", targetNamespace = "http://brickset.com/api/")
        java.lang.String orderBy,
        @WebParam(name = "pageSize", targetNamespace = "http://brickset.com/api/")
        java.lang.String pageSize,
        @WebParam(name = "pageNumber", targetNamespace = "http://brickset.com/api/")
        java.lang.String pageNumber,
        @WebParam(name = "userName", targetNamespace = "http://brickset.com/api/")
        java.lang.String userName
    );

    @WebMethod(operationName = "setCollection_owns", action = "http://brickset.com/api/setCollection_owns")
    @RequestWrapper(localName = "setCollection_owns", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionOwns")
    @ResponseWrapper(localName = "setCollection_ownsResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetCollectionOwnsResponse")
    @WebResult(name = "setCollection_ownsResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setCollectionOwns(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID,
        @WebParam(name = "owned", targetNamespace = "http://brickset.com/api/")
        int owned
    );

    @WebMethod(action = "http://brickset.com/api/getSubthemes")
    @RequestWrapper(localName = "getSubthemes", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSubthemes")
    @ResponseWrapper(localName = "getSubthemesResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetSubthemesResponse")
    @WebResult(name = "getSubthemesResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfSubthemes getSubthemes(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "theme", targetNamespace = "http://brickset.com/api/")
        java.lang.String theme
    );

    @WebMethod(action = "http://brickset.com/api/setMinifigCollection")
    @RequestWrapper(localName = "setMinifigCollection", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetMinifigCollection")
    @ResponseWrapper(localName = "setMinifigCollectionResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.SetMinifigCollectionResponse")
    @WebResult(name = "setMinifigCollectionResult", targetNamespace = "http://brickset.com/api/")
    public java.lang.String setMinifigCollection(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "userHash", targetNamespace = "http://brickset.com/api/")
        java.lang.String userHash,
        @WebParam(name = "minifigNumber", targetNamespace = "http://brickset.com/api/")
        java.lang.String minifigNumber,
        @WebParam(name = "qtyOwned", targetNamespace = "http://brickset.com/api/")
        int qtyOwned,
        @WebParam(name = "wanted", targetNamespace = "http://brickset.com/api/")
        int wanted
    );

    @WebMethod(action = "http://brickset.com/api/getAdditionalImages")
    @RequestWrapper(localName = "getAdditionalImages", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetAdditionalImages")
    @ResponseWrapper(localName = "getAdditionalImagesResponse", targetNamespace = "http://brickset.com/api/", className = "com.brickset.api.GetAdditionalImagesResponse")
    @WebResult(name = "getAdditionalImagesResult", targetNamespace = "http://brickset.com/api/")
    public com.brickset.api.ArrayOfAdditionalImages getAdditionalImages(
        @WebParam(name = "apiKey", targetNamespace = "http://brickset.com/api/")
        java.lang.String apiKey,
        @WebParam(name = "setID", targetNamespace = "http://brickset.com/api/")
        int setID
    );
}
