package office

/**
https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/kotlin

Your colleagues have been looking over you shoulder. When you should have been doing your boring real job, you've been using the work computers to smash in endless hours of codewars.

In a team meeting, a terrible, awful person declares to the group that you aren't working. You're in trouble. You quickly have to gauge the feeling in the room to decide whether or not you should gather your things and leave.

Given an object (meet) containing team member names as keys, and their happiness rating out of 10 as the value, you need to assess the overall happiness rating of the group. If <= 5, return 'Get Out Now!'. Else return 'Nice Work Champ!'.

Happiness rating will be total score / number of people in the room.

Note that your boss is in the room (boss), their score is worth double it's face value (but they are still just one person!).

 * [The Office II - Boredom Score](https://www.codewars.com/kata/the-office-ii-boredom-score)
 * [The Office III - Broken Photocopier](https://www.codewars.com/kata/the-office-iii-broken-photocopier)
 * [The Office IV - Find a Meeting Room](https://www.codewars.com/kata/the-office-iv-find-a-meeting-room)
 * [The Office V - Find a Chair](https://www.codewars.com/kata/the-office-v-find-a-chair)


 */

fun outed(meet: Map<String, Int>, boss: String): String {
    return if (roomVibe(meet, boss) <= 5) "Get Out Now!" else "Nice Work Champ!"
}

private fun roomVibe(meet: Map<String, Int>, boss: String): Int =
    meet.asIterable().sumBy { if (it.key == boss) it.value * 2 else it.value } / meet.size


