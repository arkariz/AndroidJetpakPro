package com.arrkariz.submissionarchitecturecomponent.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.arrkariz.submissionarchitecturecomponent.R
import com.arrkariz.submissionarchitecturecomponent.utils.ContentDetail
import com.arrkariz.submissionarchitecturecomponent.utils.EspressoIdlingResource
import com.arrkariz.submissionarchitecturecomponent.utils.ResourceData
import com.arrkariz.submissionarchitecturecomponent.utils.TvDetail
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivityTest{
    private val movies = ResourceData.setMovies()
    private val tv = ResourceData.setTv()
    private val detail = ContentDetail.setDetail()
    private val detailTv = TvDetail.setDetail()

    @Before
    fun setUp(){
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown(){
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(movies.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(movies[0].title)))
        onView(withId(R.id.tv_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc)).check(matches(withText(detail.overview)))
    }

    @Test
    fun loadTvshows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(tv.size))
    }

    @Test
    fun loadDetailTvshow() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(tv[0].name)))
        onView(withId(R.id.tv_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc)).check(matches(withText(detailTv.overview)))
    }

}