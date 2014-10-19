def seed1 = 1
def seed2 = 2
def limit = new Integer(args[0])

def fib= 0
def evenSum = seed2

println 'seed1->' + seed1
println 'seed2->' + seed2
println 'limit->' + limit


while (true){
	fib = seed1 + seed2
	print 'seed1->' + seed1
	print '\tseed2->' + seed2
	println '\tfib->' + fib

	if (fib >= limit){
		break
	}
	
	if (fib%2 == 0){
		println 'even fib->' + fib
		evenSum+= fib
	}
		
	seed1 = seed2
	seed2 = fib
}

println 'evenSum->'+evenSum