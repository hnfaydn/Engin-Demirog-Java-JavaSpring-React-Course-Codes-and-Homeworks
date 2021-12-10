//Export == Public   export class Customer
class Customer{

    constructor(id,customerNumber){
        this.id = id;
        this.customerNumber = customerNumber;
    }
}

let customer = new Customer(1,"12345");
//prototyping
customer.name="Murat Kurtboğan"

console.log(customer.name)


Customer.bisey="bişey"
console.log(Customer.bisey)

console.log(customer.customerNumber)