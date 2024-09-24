package com.ruokit.stock.collector.StockDataCollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockDataCollectorApplication

fun main(args: Array<String>) {
	runApplication<StockDataCollectorApplication>(*args)
}
