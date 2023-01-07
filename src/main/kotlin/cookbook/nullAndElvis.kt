//package cookbook
//
//fun person_1() {
//    class Person(
//        val first: String,
//        val middle: String?,
//        val last: String
//    ) {
//        fun greeting() = "Hello my name is ${first + middle + last}"
//    }
//
//    val jkRowling = Person("Joanne", null, "Rowling")
//    jkRowling.greeting()
//}
//
//fun person_2() {
//    val p = Person(first="North", middle=null, last="West")
//    if (p.middle != null) {
//        val middleNameLength = p.middle.length
//        // null 값 안들어옴 ( 필요한 경우가 아니면 사용하지 말 것 )
//        val middleNameLengthNotNull = p.middle!!.length
//        // p.middle?.length <== 안전호출
//        val middleNameLengthElvis = p.middle?.length ?: 0
//    }
//}

