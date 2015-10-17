/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lh;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import BaseClasses.*;
import com.google.gson.Gson;

@WebService(serviceName = "LehmanHack")
public class LehmanHack {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "inputUsername") String inputUsername, @WebParam(name = "inputPassword") String inputPassword) {
        Gson g = new Gson();
        User user = new User();
        if (user.isRegister(inputUsername, inputPassword)) {
            return g.toJson(true);
        }
        return g.toJson(false);
    }

    @WebMethod(operationName = "createUser")
    public String hello(@WebParam(name = "usernaname") String username, @WebParam(name = "passoword") String pass, @WebParam(name = "card") String creditcard) {
        Gson g = new Gson();
        User user = new User();
        user.creatUser(username, pass, creditcard, 0);
        return g.toJson(true);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public String operation(@WebParam(name = "fadsfs") String fadsfs) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getThreads")
    public String getThreads() {
        Gson g = new Gson();
        View v = new View();

        return g.toJson(v.allThread());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getThreadDetails")
    public String getThreadDetails(@WebParam(name = "inputThreadId") String inputThreadId) {
        View v = new View();

        Gson g = new Gson();
        return g.toJson(v.thread(Integer.valueOf(inputThreadId)));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getComments")
    public String getComments(@WebParam(name = "threadID") String threadID) {
        View v = new View();
        Gson g = new Gson();

        return g.toJson(v.comment(Integer.valueOf(threadID)));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "postComment")
    public String postComment(@WebParam(name = "inputUsername") String inputUsername, @WebParam(name = "inputComment") String inputComment, @WebParam(name = "threadID") String threadID) {

        User u = new User();
        u.comment(Integer.valueOf(threadID), inputComment, inputUsername);
        Gson g = new Gson();
        return g.toJson(true);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "updownvote")
    public String updownvote(@WebParam(name = "id") String id, @WebParam(name = "userid") String userid, @WebParam(name = "typeVote") String typeVote, @WebParam(name = "CommentorThread") String CommentorThread) {
        User u = new User();
        if(CommentorThread.equalsIgnoreCase("thread")){
            u.vote(true, Integer.valueOf(id), userid, Integer.valueOf(typeVote));
        }
        else u.vote(false,Integer.valueOf(id), userid, Integer.valueOf(typeVote));
        return null;
    }

}
