var todayDate = new Date();
console.log("Todays Dates ",todayDate)
console.log('Day',todayDate.getDay());
console.log('Year',todayDate.getFullYear());
console.log('Month',todayDate.getMonth());
console.log('Date',todayDate.getDate());
var constMilli = new Date(0);
console.log('Date',constMilli);
var constMilli1 = new Date(89000000);
console.log('Date',constMilli1);

var constString = new Date(`NOV 10`);
console.log('Date string constructor',constString);
var constYear = new Date(2017,9,10);
console.log('Date Year Constructor',constYear);

var Day = todayDate.getDay();
var  array = ["Sunday","Monday","Tuesday","wednesday","Thursday","Friday","Saturday"];
var value = array[Day];
console.log('Day',value);


var Month = todayDate.getMonth();
var  array = ["January","February","March","April","May","June","July","August","September","October","November","December"];
var value1 = array[Month];
console.log('Month',value1);

var tron =  Math.random();
console.log(tron*100);

var rio = Math.log(2);
console.log("LOG  base e", rio);

var roy = Math.log10(6);
console.log("LOG base 10",roy);

const troy = Math.round(10.5);
console.log(troy);

const tree = Math.ceil(10.2);
console.log(tree);

const tree1 = Math.floor(10.8)
console.log(tree1)