/*
 * Created by Ruslan Primak on 2/28/17 6:34 PM
 * Copyright (c) 2017. All rights reserved.
 *
 * Last modified 2/28/17 6:16 PM
 */

package com.example.android.scorekeeper;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.android.scorekeeper", appContext.getPackageName());
    }
}
