package com.drawingboardapps.brokencontextmock;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doReturn;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//Can't do this - MockitoJUnitRunner is only for emulated tests
//@RunWith(MockitoJUnitRunner.class)

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        //Can't do this 
//        doReturn("").when(appContext).getString(anyInt());

        assertEquals("com.drawingboardapps.brokencontextmock", appContext.getPackageName());
        assertEquals("", appContext.getString(0));
    }


}
