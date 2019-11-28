function first()
{  
    setTimeout(function(){

        console.log("First function executed");

    } ,0)

   console.log("Executed");
    
}

function second()
{
    console.log('Second function executed');
}
first();
second();


