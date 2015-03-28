
package com.brickset.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.brickset.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfSets_QNAME = new QName("http://brickset.com/api/", "ArrayOfSets");
    private final static QName _ArrayOfAdditionalImages_QNAME = new QName("http://brickset.com/api/", "ArrayOfAdditionalImages");
    private final static QName _ArrayOfReviews_QNAME = new QName("http://brickset.com/api/", "ArrayOfReviews");
    private final static QName _ArrayOfInstructions_QNAME = new QName("http://brickset.com/api/", "ArrayOfInstructions");
    private final static QName _ArrayOfMinifigCollection_QNAME = new QName("http://brickset.com/api/", "ArrayOfMinifigCollection");
    private final static QName _ArrayOfThemes_QNAME = new QName("http://brickset.com/api/", "ArrayOfThemes");
    private final static QName _ArrayOfSubthemes_QNAME = new QName("http://brickset.com/api/", "ArrayOfSubthemes");
    private final static QName _ArrayOfYears_QNAME = new QName("http://brickset.com/api/", "ArrayOfYears");
    private final static QName _String_QNAME = new QName("http://brickset.com/api/", "string");
    private final static QName _ArrayOfCollectionDetails_QNAME = new QName("http://brickset.com/api/", "ArrayOfCollectionDetails");
    private final static QName _ArrayOfConditions_QNAME = new QName("http://brickset.com/api/", "ArrayOfConditions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.brickset.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSets }
     * 
     */
    public GetSets createGetSets() {
        return new GetSets();
    }

    /**
     * Create an instance of {@link GetSetsResponse }
     * 
     */
    public GetSetsResponse createGetSetsResponse() {
        return new GetSetsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSets }
     * 
     */
    public ArrayOfSets createArrayOfSets() {
        return new ArrayOfSets();
    }

    /**
     * Create an instance of {@link GetSet }
     * 
     */
    public GetSet createGetSet() {
        return new GetSet();
    }

    /**
     * Create an instance of {@link GetSetResponse }
     * 
     */
    public GetSetResponse createGetSetResponse() {
        return new GetSetResponse();
    }

    /**
     * Create an instance of {@link GetRecentlyUpdatedSets }
     * 
     */
    public GetRecentlyUpdatedSets createGetRecentlyUpdatedSets() {
        return new GetRecentlyUpdatedSets();
    }

    /**
     * Create an instance of {@link GetRecentlyUpdatedSetsResponse }
     * 
     */
    public GetRecentlyUpdatedSetsResponse createGetRecentlyUpdatedSetsResponse() {
        return new GetRecentlyUpdatedSetsResponse();
    }

    /**
     * Create an instance of {@link GetAdditionalImages }
     * 
     */
    public GetAdditionalImages createGetAdditionalImages() {
        return new GetAdditionalImages();
    }

    /**
     * Create an instance of {@link GetAdditionalImagesResponse }
     * 
     */
    public GetAdditionalImagesResponse createGetAdditionalImagesResponse() {
        return new GetAdditionalImagesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalImages }
     * 
     */
    public ArrayOfAdditionalImages createArrayOfAdditionalImages() {
        return new ArrayOfAdditionalImages();
    }

    /**
     * Create an instance of {@link GetReviews }
     * 
     */
    public GetReviews createGetReviews() {
        return new GetReviews();
    }

    /**
     * Create an instance of {@link GetReviewsResponse }
     * 
     */
    public GetReviewsResponse createGetReviewsResponse() {
        return new GetReviewsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfReviews }
     * 
     */
    public ArrayOfReviews createArrayOfReviews() {
        return new ArrayOfReviews();
    }

    /**
     * Create an instance of {@link GetInstructions }
     * 
     */
    public GetInstructions createGetInstructions() {
        return new GetInstructions();
    }

    /**
     * Create an instance of {@link GetInstructionsResponse }
     * 
     */
    public GetInstructionsResponse createGetInstructionsResponse() {
        return new GetInstructionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInstructions }
     * 
     */
    public ArrayOfInstructions createArrayOfInstructions() {
        return new ArrayOfInstructions();
    }

    /**
     * Create an instance of {@link GetMinifigCollection }
     * 
     */
    public GetMinifigCollection createGetMinifigCollection() {
        return new GetMinifigCollection();
    }

    /**
     * Create an instance of {@link GetMinifigCollectionResponse }
     * 
     */
    public GetMinifigCollectionResponse createGetMinifigCollectionResponse() {
        return new GetMinifigCollectionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMinifigCollection }
     * 
     */
    public ArrayOfMinifigCollection createArrayOfMinifigCollection() {
        return new ArrayOfMinifigCollection();
    }

    /**
     * Create an instance of {@link GetThemes }
     * 
     */
    public GetThemes createGetThemes() {
        return new GetThemes();
    }

    /**
     * Create an instance of {@link GetThemesResponse }
     * 
     */
    public GetThemesResponse createGetThemesResponse() {
        return new GetThemesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfThemes }
     * 
     */
    public ArrayOfThemes createArrayOfThemes() {
        return new ArrayOfThemes();
    }

    /**
     * Create an instance of {@link GetSubthemes }
     * 
     */
    public GetSubthemes createGetSubthemes() {
        return new GetSubthemes();
    }

    /**
     * Create an instance of {@link GetSubthemesResponse }
     * 
     */
    public GetSubthemesResponse createGetSubthemesResponse() {
        return new GetSubthemesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubthemes }
     * 
     */
    public ArrayOfSubthemes createArrayOfSubthemes() {
        return new ArrayOfSubthemes();
    }

    /**
     * Create an instance of {@link GetYears }
     * 
     */
    public GetYears createGetYears() {
        return new GetYears();
    }

    /**
     * Create an instance of {@link GetYearsResponse }
     * 
     */
    public GetYearsResponse createGetYearsResponse() {
        return new GetYearsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfYears }
     * 
     */
    public ArrayOfYears createArrayOfYears() {
        return new ArrayOfYears();
    }

    /**
     * Create an instance of {@link GetThemesForUser }
     * 
     */
    public GetThemesForUser createGetThemesForUser() {
        return new GetThemesForUser();
    }

    /**
     * Create an instance of {@link GetThemesForUserResponse }
     * 
     */
    public GetThemesForUserResponse createGetThemesForUserResponse() {
        return new GetThemesForUserResponse();
    }

    /**
     * Create an instance of {@link GetSubthemesForUser }
     * 
     */
    public GetSubthemesForUser createGetSubthemesForUser() {
        return new GetSubthemesForUser();
    }

    /**
     * Create an instance of {@link GetSubthemesForUserResponse }
     * 
     */
    public GetSubthemesForUserResponse createGetSubthemesForUserResponse() {
        return new GetSubthemesForUserResponse();
    }

    /**
     * Create an instance of {@link GetYearsForUser }
     * 
     */
    public GetYearsForUser createGetYearsForUser() {
        return new GetYearsForUser();
    }

    /**
     * Create an instance of {@link GetYearsForUserResponse }
     * 
     */
    public GetYearsForUserResponse createGetYearsForUserResponse() {
        return new GetYearsForUserResponse();
    }

    /**
     * Create an instance of {@link SetCollection }
     * 
     */
    public SetCollection createSetCollection() {
        return new SetCollection();
    }

    /**
     * Create an instance of {@link SetCollectionResponse }
     * 
     */
    public SetCollectionResponse createSetCollectionResponse() {
        return new SetCollectionResponse();
    }

    /**
     * Create an instance of {@link SetCollectionOwns }
     * 
     */
    public SetCollectionOwns createSetCollectionOwns() {
        return new SetCollectionOwns();
    }

    /**
     * Create an instance of {@link SetCollectionOwnsResponse }
     * 
     */
    public SetCollectionOwnsResponse createSetCollectionOwnsResponse() {
        return new SetCollectionOwnsResponse();
    }

    /**
     * Create an instance of {@link SetCollectionWants }
     * 
     */
    public SetCollectionWants createSetCollectionWants() {
        return new SetCollectionWants();
    }

    /**
     * Create an instance of {@link SetCollectionWantsResponse }
     * 
     */
    public SetCollectionWantsResponse createSetCollectionWantsResponse() {
        return new SetCollectionWantsResponse();
    }

    /**
     * Create an instance of {@link SetCollectionUserNotes }
     * 
     */
    public SetCollectionUserNotes createSetCollectionUserNotes() {
        return new SetCollectionUserNotes();
    }

    /**
     * Create an instance of {@link SetCollectionUserNotesResponse }
     * 
     */
    public SetCollectionUserNotesResponse createSetCollectionUserNotesResponse() {
        return new SetCollectionUserNotesResponse();
    }

    /**
     * Create an instance of {@link SetCollectionQtyOwned }
     * 
     */
    public SetCollectionQtyOwned createSetCollectionQtyOwned() {
        return new SetCollectionQtyOwned();
    }

    /**
     * Create an instance of {@link SetCollectionQtyOwnedResponse }
     * 
     */
    public SetCollectionQtyOwnedResponse createSetCollectionQtyOwnedResponse() {
        return new SetCollectionQtyOwnedResponse();
    }

    /**
     * Create an instance of {@link SetMinifigCollection }
     * 
     */
    public SetMinifigCollection createSetMinifigCollection() {
        return new SetMinifigCollection();
    }

    /**
     * Create an instance of {@link SetMinifigCollectionResponse }
     * 
     */
    public SetMinifigCollectionResponse createSetMinifigCollectionResponse() {
        return new SetMinifigCollectionResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SetCollectionDetail }
     * 
     */
    public SetCollectionDetail createSetCollectionDetail() {
        return new SetCollectionDetail();
    }

    /**
     * Create an instance of {@link CollectionDetails }
     * 
     */
    public CollectionDetails createCollectionDetails() {
        return new CollectionDetails();
    }

    /**
     * Create an instance of {@link SetCollectionDetailResponse }
     * 
     */
    public SetCollectionDetailResponse createSetCollectionDetailResponse() {
        return new SetCollectionDetailResponse();
    }

    /**
     * Create an instance of {@link GetCollectionDetail }
     * 
     */
    public GetCollectionDetail createGetCollectionDetail() {
        return new GetCollectionDetail();
    }

    /**
     * Create an instance of {@link GetCollectionDetailResponse }
     * 
     */
    public GetCollectionDetailResponse createGetCollectionDetailResponse() {
        return new GetCollectionDetailResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCollectionDetails }
     * 
     */
    public ArrayOfCollectionDetails createArrayOfCollectionDetails() {
        return new ArrayOfCollectionDetails();
    }

    /**
     * Create an instance of {@link GetCollectionDetailConditions }
     * 
     */
    public GetCollectionDetailConditions createGetCollectionDetailConditions() {
        return new GetCollectionDetailConditions();
    }

    /**
     * Create an instance of {@link GetCollectionDetailConditionsResponse }
     * 
     */
    public GetCollectionDetailConditionsResponse createGetCollectionDetailConditionsResponse() {
        return new GetCollectionDetailConditionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfConditions }
     * 
     */
    public ArrayOfConditions createArrayOfConditions() {
        return new ArrayOfConditions();
    }

    /**
     * Create an instance of {@link CheckKey }
     * 
     */
    public CheckKey createCheckKey() {
        return new CheckKey();
    }

    /**
     * Create an instance of {@link CheckKeyResponse }
     * 
     */
    public CheckKeyResponse createCheckKeyResponse() {
        return new CheckKeyResponse();
    }

    /**
     * Create an instance of {@link Sets }
     * 
     */
    public Sets createSets() {
        return new Sets();
    }

    /**
     * Create an instance of {@link AdditionalImages }
     * 
     */
    public AdditionalImages createAdditionalImages() {
        return new AdditionalImages();
    }

    /**
     * Create an instance of {@link Reviews }
     * 
     */
    public Reviews createReviews() {
        return new Reviews();
    }

    /**
     * Create an instance of {@link Instructions }
     * 
     */
    public Instructions createInstructions() {
        return new Instructions();
    }

    /**
     * Create an instance of {@link MinifigCollection }
     * 
     */
    public MinifigCollection createMinifigCollection() {
        return new MinifigCollection();
    }

    /**
     * Create an instance of {@link Themes }
     * 
     */
    public Themes createThemes() {
        return new Themes();
    }

    /**
     * Create an instance of {@link Subthemes }
     * 
     */
    public Subthemes createSubthemes() {
        return new Subthemes();
    }

    /**
     * Create an instance of {@link Years }
     * 
     */
    public Years createYears() {
        return new Years();
    }

    /**
     * Create an instance of {@link Conditions }
     * 
     */
    public Conditions createConditions() {
        return new Conditions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfSets")
    public JAXBElement<ArrayOfSets> createArrayOfSets(ArrayOfSets value) {
        return new JAXBElement<ArrayOfSets>(_ArrayOfSets_QNAME, ArrayOfSets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalImages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfAdditionalImages")
    public JAXBElement<ArrayOfAdditionalImages> createArrayOfAdditionalImages(ArrayOfAdditionalImages value) {
        return new JAXBElement<ArrayOfAdditionalImages>(_ArrayOfAdditionalImages_QNAME, ArrayOfAdditionalImages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReviews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfReviews")
    public JAXBElement<ArrayOfReviews> createArrayOfReviews(ArrayOfReviews value) {
        return new JAXBElement<ArrayOfReviews>(_ArrayOfReviews_QNAME, ArrayOfReviews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstructions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfInstructions")
    public JAXBElement<ArrayOfInstructions> createArrayOfInstructions(ArrayOfInstructions value) {
        return new JAXBElement<ArrayOfInstructions>(_ArrayOfInstructions_QNAME, ArrayOfInstructions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMinifigCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfMinifigCollection")
    public JAXBElement<ArrayOfMinifigCollection> createArrayOfMinifigCollection(ArrayOfMinifigCollection value) {
        return new JAXBElement<ArrayOfMinifigCollection>(_ArrayOfMinifigCollection_QNAME, ArrayOfMinifigCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfThemes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfThemes")
    public JAXBElement<ArrayOfThemes> createArrayOfThemes(ArrayOfThemes value) {
        return new JAXBElement<ArrayOfThemes>(_ArrayOfThemes_QNAME, ArrayOfThemes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubthemes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfSubthemes")
    public JAXBElement<ArrayOfSubthemes> createArrayOfSubthemes(ArrayOfSubthemes value) {
        return new JAXBElement<ArrayOfSubthemes>(_ArrayOfSubthemes_QNAME, ArrayOfSubthemes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfYears }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfYears")
    public JAXBElement<ArrayOfYears> createArrayOfYears(ArrayOfYears value) {
        return new JAXBElement<ArrayOfYears>(_ArrayOfYears_QNAME, ArrayOfYears.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCollectionDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfCollectionDetails")
    public JAXBElement<ArrayOfCollectionDetails> createArrayOfCollectionDetails(ArrayOfCollectionDetails value) {
        return new JAXBElement<ArrayOfCollectionDetails>(_ArrayOfCollectionDetails_QNAME, ArrayOfCollectionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConditions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://brickset.com/api/", name = "ArrayOfConditions")
    public JAXBElement<ArrayOfConditions> createArrayOfConditions(ArrayOfConditions value) {
        return new JAXBElement<ArrayOfConditions>(_ArrayOfConditions_QNAME, ArrayOfConditions.class, null, value);
    }

}
