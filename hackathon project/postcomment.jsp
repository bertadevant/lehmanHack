<%
    String threadid = request.getParameter("threadid");
    String comentary = request.getParameter("comment");
    String username = request.getParameter("username");
    
    lh.LehmanHack_Service service = new lh.LehmanHack_Service();
    lh.LehmanHack port = service.getLehmanHackPort();
    java.lang.String result = port.postComment(username, comentary, threadid);

    out.println(result);
%>