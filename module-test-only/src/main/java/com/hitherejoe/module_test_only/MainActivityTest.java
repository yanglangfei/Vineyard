package com.hitherejoe.module_test_only;


import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.hitherejoe.androidboilerplate.ui.activity.MainActivity;
import com.hitherejoe.androidboilerplate.util.MockModelsUtil;
import com.hitherejoe.module_test_only.injection.TestComponentRule;
import com.hitherejoe.module_test_only.util.ClearDataRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public final ActivityTestRule<MainActivity> main =
            new ActivityTestRule<>(MainActivity.class, false, false);

    @Rule
    public final TestComponentRule component = new TestComponentRule();

    @Rule
    public final ClearDataRule clearDataRule = new ClearDataRule(component);

    @Before
    public void setUp() {
        clearDataRule.clearData();
    }

    @Test
    public void testActivityStarts() {
        main.launchActivity(null);
    }

}