 import Item from "./Item"
 function ItemBanner() {
    const items = [
    {
        name: "Sample Item",
        image: "https://via.placeholder.com/150",
        description: "This is a sample item for demonstration purposes.",
        price: 19.99
    },
    {  
        name: "Another Item",
        image: "https://via.placeholder.com/150",
        description: "This is another sample item for demonstration purposes.",
        price: 29.99
    }
]
    return (
        <div className="item-banner">
            {items.map((item) => <Item name={item.name} imageUrl={item.image} description={item.description} price={item.price}/>)}
        </div>
    )
 }
 export default ItemBanner  

