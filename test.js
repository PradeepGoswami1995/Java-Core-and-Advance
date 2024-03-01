class MyClass {
    constructor(name) {
        this.name = name;
    }

    greet() {
        console.log(`Hello, ${this.name}!`);
    }
}

function main() {
    let myObject = new MyClass("world");
    myObject.greet();
}

main(); // Call the main method to execute the program
