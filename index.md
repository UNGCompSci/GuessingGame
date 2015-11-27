---
layout: redirect
---

<h3><a id="what-it-is" class="anchor" href="#what-it-is" aria-hidden="true"><span class="octicon octicon-link"></span></a>What It Is</h3>

<p>The Guessing Game is a program which allows you to guess what number the computer is thinking and it will tell you to go higher or lower depending on what your guess is. It has one purpose and that purpose is entertainment.</p>

<li>Entertainment</li>

<ul>
<li>The Guessing Game allows you to type in a number and get a response that will either tell you to go higher or lower. A sample output of what one gameplay may look like this:</li>
</ul>

{% highlight bash %}
senor@kali:~$ cd projects/GuessingGame/
senor@kali:~/projects/GuessingGame$ java GuessingGame 
Guess a number between 0 and 10000!
5000
Sorry, the number is lower than your guess!
3000
Sorry, the number is lower than your guess!
1000
Sorry, the number is higher than your guess!
2000
Sorry, the number is higher than your guess!
2500
Sorry, the number is lower than your guess!
2300
Sorry, the number is lower than your guess!
2100
Sorry, the number is higher than your guess!
2200
Sorry, the number is lower than your guess!
2150
Sorry, the number is higher than your guess!
2190
Sorry, the number is lower than your guess!
2170
Sorry, the number is lower than your guess!
2160
Sorry, the number is higher than your guess!
2165
Sorry, the number is higher than your guess!
2167
Sorry, the number is higher than your guess!
2169
You have succeeded in correctly guessing the number 2169 in 15 tries!
Press Ctrl+C to quit or type in a new number to play again!
{% endhighlight %}

<h3><a id="why-i-made-it" class="anchor" href="#why-i-made-it" aria-hidden="true"><span class="octicon octicon-link"></span></a>Why I Made It</h3>

<p>I made this guessing game because I was finding something to do after finishing an assignment for one of my classes. Since I did not have a compiler on hand and did not work on it enough to warrant using Wercker to compile it, I just wrote the code completely from memory and left all bugs in it. It was just a quick project, but it is a fun one anyway, and it still is a fun game to play, even though it was just a quick project.</p>
