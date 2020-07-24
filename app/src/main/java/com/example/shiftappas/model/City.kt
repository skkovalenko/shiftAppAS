package com.example.shiftappas.model

data class City(val name: String, var temperature: Int) {
    private val winter = "Похоже на улице зима. Срочно доставай шарфы, елку и чай с малиной. Попытайтесь не заболеть. Минздрав рекомендует закаливание и баньку"
    private val springAndFall = "Толи осень толи весна, в любом случае, либо недавно было лето, либо зима на улице толи дождь толи 8 марта по обстановке цветы, резиновые сапоги"
    private val summer = "За окном лето, а мы сидим тут кодим. А вы знали что Котлин назвали, как остров Котлен в ленинградской области, на нем находится город Крандштат"
    private var descriptionElse: String = "Эй, ты еще жив? Посмотри на градусник, пора валить на луну"

    fun getDescription(): String{
        return when(temperature){
            in -50..-10 -> winter
            in -10..15 -> springAndFall
            in 15..50 -> summer
            else -> descriptionElse
        }
    }

}