package com.example.cupcake

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.cupcake.model.OrderViewModel
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class ViewModelTests {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun quantity_twelve_cupcakes() {
        val viewModel = OrderViewModel()
        viewModel.quantity.observeForever {}
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }
    @Test
    fun price_twelve_cupcakes() {
        val viewModel = OrderViewModel()
        viewModel.setQuantity(12)
        viewModel.price.observeForever {}
        assertEquals("$27.00", viewModel.price.value)
    }

}