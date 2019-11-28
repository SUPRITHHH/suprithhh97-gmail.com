var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myName = "SUPRITH";
console.log(myName, typeof myName);
var troy = 9008957673;
console.log(troy, typeof troy);
var troy1;
console.log(troy1, typeof troy1);
var troy3;
troy3 = "Suprith";
troy3 = 9449068673;
console.log(troy3, typeof troy3);
var calAge = function () {
    console.log("Environment");
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var Person1 = new Person("Mikel", 24);
console.log(Person1);
var Person2 = /** @class */ (function (_super) {
    __extends(Person2, _super);
    function Person2(name, age, phone) {
        var _this = _super.call(this, name, age) || this;
        _this.phone = phone;
        return _this;
    }
    return Person2;
}(Person));
var person2 = new Person2("SUPRITH", 26, 97801587425);
console.log(person2);
