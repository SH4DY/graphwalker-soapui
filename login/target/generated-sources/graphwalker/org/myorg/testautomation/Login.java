// Generated by GraphWalker (http://www.graphwalker.org)
package org.myorg.testautomation;

import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "org/myorg/testautomation/Login.graphml")
public interface Login {

    @Vertex()
    void v_ClientOnHomepage();

    @Edge()
    void e_ToggleRememberMe();

    @Vertex()
    void v_Browse();

    @Edge()
    void e_Logout();

    @Vertex()
    void v_LoginPrompted();

    @Edge()
    void e_StartClient();

    @Edge()
    void e_Close();

    @Edge()
    void e_ValidCredentials();

    @Edge()
    void e_Init();

    @Edge()
    void e_Exit();

    @Edge()
    void e_InvalidCredentials();
}
