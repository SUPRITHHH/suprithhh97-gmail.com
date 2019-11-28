var person = new Object();

        person.name="Mr.SUPRITH";
        person.age=22;
        
      person.getFullname = function(){
        return this.name + ' '+this.age;
        }
        
        console.log('NAME=',person.name);
        console.log('AGE=',person.age);
        console.log(person.getFullname());

        var person1 = new Object();

        person1.name="Mr.PRAMOD";
        person1.age=20;

        console.log(person1);
        
        var person2 = new Object();
        person2.name="Mr.HEMAPPA";
        person2.age=56;
        
        console.log('NAME=',person2.name);
        console.log('AGE=',person2.age);


        var person3 = new Object();
        person3.name="Mr.KUMAR";
        person3.age=45;
        console.log('NAME=',person3.name);

        console.log('AGE=',person3.age);


        var person4 = new Object();
        person4.name="Mr.PRAJWAL";
        person4.age=13;
        console.log('NAME=',person4.name);

        console.log('AGE=',person4.age);
