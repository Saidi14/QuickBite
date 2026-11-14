import { useState, useEffect } from "react"

function Item() {
    const [data, setData] = useState(null);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchData = async () => {
            const response = await fetch("http://localhost:8080/item/getById/2");
            try{
                if(response.ok){
                    response.json().then((json) => {
                        setData(json)
                    })
                }
                    
            }catch(fetchError){
                setError(fetchError);
            }finally{
                setLoading(false);
            }
        }
        fetchData();
    }, []);


    return (
        <div className="item">
            <p>{loading ? "loading" : error ?? data?.itemName ?? "Item unavailable"}</p>
            <img src = {loading? "https://placehold.net/400x400.png" : error ?? data?.imageUrl ?? "https://placehold.net/400x400.png"}></img>
        </div>
    ) 

}
export default Item