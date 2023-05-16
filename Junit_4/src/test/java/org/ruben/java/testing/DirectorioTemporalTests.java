package org.ruben.java.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class DirectorioTemporalTests {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
  
    @Test
    public void testUsingTempFolder() throws IOException {
      File createdFolder = folder.newFolder("newfolder");
      File createdFile = folder.newFile("myfilefile.txt");
      assertTrue(createdFile.exists());
    }

}
