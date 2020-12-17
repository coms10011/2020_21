
.filename 2020_COMS10014_mock_exam

.pool Mock Exam
#
#1
   .question mcq
       .text What is an _event_?
       .option Something that happens.
       .answer A subset of the sample space.
       .option An possible outcome of an experiment.
       .option A subset that depends on the outcome.
#
#2
   .question mcq
       .text <<END
A sample space consists of the words {stately, plump, buck, mulligan, came, from, the, stairhead}. The event $A$ consists of all words with four or fewer letters. The event $B$ consists of all words ending in a vowel. For this question 'y' is not a vowel. What is $P(B)$ and $P(A|B)$?
       END
       .option $P(B)=1/2$ and $P(A|B)=1/4$
       .option $P(B)=1/4$ and $P(A|B)=1/2$
       .option $P(B)=1/2$ and $P(A|B)=1/2$
       .answer $P(B)=1/4$ and $P(A|B)=1$
#
#3
    .question numeric
        .text <<END
An unfair coin gives heads with probability 2/3; it is tossed ten times, what is the probability of four heads? Give your answer in the form '0.abc'.
	END
	.answer 0.057 delta 0.002
#
#4
    .question numeric
        .text <<END
For a Poisson process let $T$ be the interval for which the
process has, on average, one event, so, for this interval $\lambda=1$. What is the probability that there is one event for this interval? Give your answer in the form '0.ab'.
END     
        .answer 0.37 delta 0.01
#5
    .question numeric
    .text <<END
In a school with 1000 pupils 50 are taking part in the
school production of the play 'Guys and Dolls'. Because of the glamour
associated with being in theatre when asked if they are in the play
students who aren't actually in the play sometimes lie; in fact a
non-participating student has a 0.1 change of saying they are in the
play when they aren't. Conversely three students who are in 'Guys and Dolls'
also play on the school sports teams and by tradition they also lie,
claiming they are not in the play when in fact they are. If someone
says they are in the play what is the chance they really are? Give you answer in the form '0.ab'.
END
    .answer 0.17 delta 0.01
#
#6
    .question mcq
        .text <<END
The weight of the eggs laid by a particular chicken has an approximately Gaussian distribution with $\mu=50$ g and variance $\sigma^2=25 $ g$^2$. Write down an
expression in terms of the error function for the probability of finding a egg bigger than 65 g.
END
        .answer $[1-\mbox{erf}(3/\sqrt{2})]/2$
        .option $[1-\mbox{erf}(3\sqrt{2})]/2$
        .option $[1-\mbox{erf}(5\sqrt{2})]/2$
        .option $[1-\mbox{erf}(5/\sqrt{2})]/2$
#
#7
    .question mcq
        .text <<END
The _Erlang_ distribution has probability density $p(x)=\lambda^kx^{k-1}e^{-\lambda x}/(k-1)!$. What is its mean?
	END
        .option $k$
        .answer $k/\lambda$
        .option $k\lambda$
        .option $\lambda$
#
#8
    .question numeric
        .text <<END
They say there is no smoke without fire, but imagine that
the probability of smoke when there is a fire is 0.9 whereas the probability
of smoke when there is no fire is 0.05. Now, say the probability of a
fire is 0.01, if there is smoke, what is the probability that there is a
fire? Give your answer in the form '0.abc'.
END
        .answer 0.154 delta 0.001
#
#9
    .question numeric
        .text <<END
Two six-sided dice are rolled and the face values are summed. What is the variance of the result? Give your answer in the form 'a.bc'.
END
        .answer 5.83 delta 0.01
#
#10
    .question numeric
        .text <<END
A five card poker hand is a straight if the card values are
consecutive, as for example $4,5,6,7,8$; the ace can be considered
lower than $2$ or higher than a king, so $A,1,2,3,4$ and $10,J,Q,K,A$
are both legitimate straights; however, if a straight contains an ace
it must be the lower or highest card, $Q,K,A,1,2$ is not a legitimate
straight. The suits do not need to be the same. How many different hands are straights?
END
        .answer 10240
