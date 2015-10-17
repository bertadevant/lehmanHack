
<%
    String threadid = request.getParameter("threadid");

    lh.LehmanHack_Service service = new lh.LehmanHack_Service();
    lh.LehmanHack port = service.getLehmanHackPort();
    java.lang.String result = port.getThreadDetails(threadid);

    out.println(result);
%>