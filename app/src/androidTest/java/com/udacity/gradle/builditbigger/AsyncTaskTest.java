package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Test
    public void MyJokeAsyncTaskTest() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(1);
        Context context = InstrumentationRegistry.getContext();
        MyJokeAsyncTask testTask = new MyJokeAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                latch.countDown();
            }
        };
        testTask.execute(context);
        latch.await();
    }
}
