/*
 * Copyright 2001-2003 The eXo platform SARL All rights reserved.
 * Please look at license.txt in info directory for more license detail. 
 */

package org.exoplatform.services.jcr.api.serialization.fs;


import javax.jcr.Repository;

import org.exoplatform.services.jcr.api.serialization.ImportDocViewTest;

/**
 * Created y the eXo platform team
 * User: Benjamin Mestrallet
 * Date: 18 aout 2004
 */
public class TestImportDocView extends ImportDocViewTest{

  public void setUp() throws Exception {
    super.setUp();
    repository = (Repository) repositoryService.getRepository("dfs1");    
    ticket = repository.login(credentials, "ws");
  }  

}
