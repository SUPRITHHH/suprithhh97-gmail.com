function add(num1,num2)
{
    console.log("Sum=",num1+num2);
}

add(10,20);



var sub= function(num1,num2)
{
    var sub=num1-num2;
    return sub;
}

var sub1=sub(20,10);
console.log('value=',sub1);

console.log('HELLO');

(function (num1,num2)
{
    console.log('v1=',num1*num2);
})(10,20)

var div=(num1,num2)=>{
    console.log('value =',num1/num2);
}

 div(20,10);


 var div1 = num1=>
 {
     console.log("value=",num1);
 }
 div1(10);

var div2 = num1 => console.log(num1);
div2(10);

var add1=(num1,num2)=>num1+num2;
var ref=add1(10,20);
console.log(ref);


/*
greeting("Suprith");

function greeting(msg)
{

    console.log("Hello",msg);
}


greeting1("Dinga");

var greeting1 = function(msg)
{
    console.log("hi",msg);
}

greets("Dinga")

var greets = (msg) =>
{
    console.log('Hi',msg);
}

 */
