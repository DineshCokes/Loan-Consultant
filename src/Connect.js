import axios from "axios";
const link="http://localhost:8080";
export const join=async(obj)=>
{
    const hai=await axios.post(`${link}/new`,obj)
    return hai;
}
