



var brands=["Aqua","Bisleri","RailWater","Kingfisher"];


for(var element of brands){

    console.log('Brands=',element);
}

console.log("==============================================");

for(var index in brands){

    console.log('Brands=',brands[index]);
}

console.log("=================================================");

var person = {
    name : "SUPRITH",
    age  : 25,
    color:"white",

}

for(var key in person){

    console.log('Brands=',person[key]);
}

console.log("===========================")
brands.forEach(function(value,index){

console.log("Movie=",value);
console.log("Movie=",index);

})


console.log("=======================================")
var items=[{
    item:'bangles',
    id:1,
    price:500,
},
{
    item :'Eyelines',
    id : 2,
    price : 1000,
},

{
    item : "Bikes",
    id : 3,
    price : 1000000,
},

{
    item : "watch",
    id : 4,
    price : 50000,
}]


items.forEach(function(value,index){

    console.log("value=",value);
    console.log("index",index);
})

console.log("=====================================");
var num ;
var num = "SUPRITH";
num="TRON";


console.log("=======================================");
//console.log(num1);
let num1;
// let num1="SUPRITH";
num1="TRON";

console.log("=========================================");
//console.log(num2);
//const num2;
const num2="TRON";


for(var i=0;i<5;i++){
    console.log(i);
}

console.log("Outer loop",i);

for(let i1=0;i1<5;i1++){
    console.log(i1);
}

//console.log("Outer loop",i1);


