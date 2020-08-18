package com.mooreb.use_basic_stats;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void appTest() {
        final App app = new App();
        Assert.assertNotNull(app);
        app.main(new String[0]);
    }
}
