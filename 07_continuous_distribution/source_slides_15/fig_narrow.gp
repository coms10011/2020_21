

f(x)= abs(x-0.125)<0.125  ? 4.0:1/0
g(x)= abs(x-0.125)>=0.125 ? 0.0:1/0

set xtics (-1,-0.5,0,0.5,1)
set ytics (0,2,4)
set size 0.5,0.5
unset key
set border 3
set xtics nomirror
set ytics nomirror

set xrange [-1:1]
set yrange [-0.5:4]

plot f(x) w lines ls -1
replot g(x) w lines ls -1