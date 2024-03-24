/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return printHello();
    }
};
function printHello(){
    return "Hello World";
}

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */