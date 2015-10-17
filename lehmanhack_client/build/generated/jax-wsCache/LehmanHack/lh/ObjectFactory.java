
package lh;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lh package. 
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

    private final static QName _LoginResponse_QNAME = new QName("http://lh/", "loginResponse");
    private final static QName _GetCommentsResponse_QNAME = new QName("http://lh/", "getCommentsResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://lh/", "createUserResponse");
    private final static QName _OperationResponse_QNAME = new QName("http://lh/", "operationResponse");
    private final static QName _Updownvote_QNAME = new QName("http://lh/", "updownvote");
    private final static QName _GetThreadsResponse_QNAME = new QName("http://lh/", "getThreadsResponse");
    private final static QName _GetThreadDetailsResponse_QNAME = new QName("http://lh/", "getThreadDetailsResponse");
    private final static QName _Login_QNAME = new QName("http://lh/", "login");
    private final static QName _UpdownvoteResponse_QNAME = new QName("http://lh/", "updownvoteResponse");
    private final static QName _GetThreadDetails_QNAME = new QName("http://lh/", "getThreadDetails");
    private final static QName _PostComment_QNAME = new QName("http://lh/", "postComment");
    private final static QName _PostCommentResponse_QNAME = new QName("http://lh/", "postCommentResponse");
    private final static QName _GetComments_QNAME = new QName("http://lh/", "getComments");
    private final static QName _CreateUser_QNAME = new QName("http://lh/", "createUser");
    private final static QName _Operation_QNAME = new QName("http://lh/", "operation");
    private final static QName _GetThreads_QNAME = new QName("http://lh/", "getThreads");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lh
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetCommentsResponse }
     * 
     */
    public GetCommentsResponse createGetCommentsResponse() {
        return new GetCommentsResponse();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link Updownvote }
     * 
     */
    public Updownvote createUpdownvote() {
        return new Updownvote();
    }

    /**
     * Create an instance of {@link GetThreadsResponse }
     * 
     */
    public GetThreadsResponse createGetThreadsResponse() {
        return new GetThreadsResponse();
    }

    /**
     * Create an instance of {@link GetThreadDetailsResponse }
     * 
     */
    public GetThreadDetailsResponse createGetThreadDetailsResponse() {
        return new GetThreadDetailsResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link UpdownvoteResponse }
     * 
     */
    public UpdownvoteResponse createUpdownvoteResponse() {
        return new UpdownvoteResponse();
    }

    /**
     * Create an instance of {@link GetThreadDetails }
     * 
     */
    public GetThreadDetails createGetThreadDetails() {
        return new GetThreadDetails();
    }

    /**
     * Create an instance of {@link PostCommentResponse }
     * 
     */
    public PostCommentResponse createPostCommentResponse() {
        return new PostCommentResponse();
    }

    /**
     * Create an instance of {@link PostComment }
     * 
     */
    public PostComment createPostComment() {
        return new PostComment();
    }

    /**
     * Create an instance of {@link GetComments }
     * 
     */
    public GetComments createGetComments() {
        return new GetComments();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link GetThreads }
     * 
     */
    public GetThreads createGetThreads() {
        return new GetThreads();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getCommentsResponse")
    public JAXBElement<GetCommentsResponse> createGetCommentsResponse(GetCommentsResponse value) {
        return new JAXBElement<GetCommentsResponse>(_GetCommentsResponse_QNAME, GetCommentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "operationResponse")
    public JAXBElement<OperationResponse> createOperationResponse(OperationResponse value) {
        return new JAXBElement<OperationResponse>(_OperationResponse_QNAME, OperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Updownvote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "updownvote")
    public JAXBElement<Updownvote> createUpdownvote(Updownvote value) {
        return new JAXBElement<Updownvote>(_Updownvote_QNAME, Updownvote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getThreadsResponse")
    public JAXBElement<GetThreadsResponse> createGetThreadsResponse(GetThreadsResponse value) {
        return new JAXBElement<GetThreadsResponse>(_GetThreadsResponse_QNAME, GetThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getThreadDetailsResponse")
    public JAXBElement<GetThreadDetailsResponse> createGetThreadDetailsResponse(GetThreadDetailsResponse value) {
        return new JAXBElement<GetThreadDetailsResponse>(_GetThreadDetailsResponse_QNAME, GetThreadDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdownvoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "updownvoteResponse")
    public JAXBElement<UpdownvoteResponse> createUpdownvoteResponse(UpdownvoteResponse value) {
        return new JAXBElement<UpdownvoteResponse>(_UpdownvoteResponse_QNAME, UpdownvoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getThreadDetails")
    public JAXBElement<GetThreadDetails> createGetThreadDetails(GetThreadDetails value) {
        return new JAXBElement<GetThreadDetails>(_GetThreadDetails_QNAME, GetThreadDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "postComment")
    public JAXBElement<PostComment> createPostComment(PostComment value) {
        return new JAXBElement<PostComment>(_PostComment_QNAME, PostComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "postCommentResponse")
    public JAXBElement<PostCommentResponse> createPostCommentResponse(PostCommentResponse value) {
        return new JAXBElement<PostCommentResponse>(_PostCommentResponse_QNAME, PostCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getComments")
    public JAXBElement<GetComments> createGetComments(GetComments value) {
        return new JAXBElement<GetComments>(_GetComments_QNAME, GetComments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<Operation>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lh/", name = "getThreads")
    public JAXBElement<GetThreads> createGetThreads(GetThreads value) {
        return new JAXBElement<GetThreads>(_GetThreads_QNAME, GetThreads.class, null, value);
    }

}
