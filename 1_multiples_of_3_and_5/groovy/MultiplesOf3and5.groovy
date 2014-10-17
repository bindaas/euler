Integer max = new Integer(args[0])

def sum = 0 ;
for ( i in 3..max-1 ) {
    boolean isMultiple = false
    if ((i%3) == 0){
    	println 'Multiple of 3 :'+i
    	isMultiple = true
    }
    if ((i%5) == 0){
    	println 'Multiple of 5 :'+i
    	isMultiple = true
    }
    if (isMultiple){
    	sum += i
    }
    
    
}

println sum