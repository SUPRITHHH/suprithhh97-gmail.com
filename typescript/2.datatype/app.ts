let myName:string = "SUPRITH" ;

console.log(myName , typeof myName);

let troy = 9008957673 ;

console.log(troy , typeof troy);

let troy1: string ;

console.log(troy1 , typeof troy1);

let troy3;

troy3 = "Suprith";

troy3 = 9449068673;

console.log(troy3 , typeof troy3);

let calAge = function():void{
    console.log("Environment");
}

calAge();

class Person{
    constructor( public name:string, public age:number){
          
    }
}

let Person1=new Person("Mikel",24);
console.log(Person1);

class Person2 extends Person{
    constructor(name:string,age:number,public phone:number){
    super(name,age);
    }
}

let person2 = new Person2("SUPRITH",26,97801587425);
console.log(person2)