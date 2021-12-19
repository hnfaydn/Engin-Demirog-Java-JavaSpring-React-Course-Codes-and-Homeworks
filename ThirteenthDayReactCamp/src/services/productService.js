import axios from "axios";


export default class ProductService{
    getProducts(){
        return axios.get("http://localhost:8045/api/products/getall")
    }

    getByProductName(productName){
        return axios.get("http://localhost:8045/api/products/getByProductName?productName="+productName)
    }
}