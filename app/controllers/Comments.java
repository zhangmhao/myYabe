package controllers;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-10-9
 * Time: 下午5:42
 * To change this template use File | Settings | File Templates.
 */
import play.*;
import play.mvc.*;
@Check("admin")
@With(Secure.class)
public class Comments extends CRUD {

}