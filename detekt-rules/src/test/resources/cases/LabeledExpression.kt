@file:Suppress("unused")

package cases

fun breakWithLabel() { // reports 2
	loop@ for (i in 1..100) {
		for (j in 1..100) {
			if (j == 5) break@loop
		}
	}
}

fun continueWithLabel() { // reports 2
	loop@ for (i in 1..100) {
		for (j in 1..100) {
			if (j == 5) continue@loop
		}
	}
}

fun implicitReturnWithLabel(range: IntRange) { // reports 1
	range.forEach {
		if (it == 5) return@forEach
		println(it)
	}
}

fun returnWithLabel(range: IntRange) {  // reports 2
	range.forEach label@ {
		if (it == 5) return@label
		println(it)
	}
}
