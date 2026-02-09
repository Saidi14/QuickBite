function Item({name, imageUrl, description, price}) {
    return (
        <div className="item">
            <h2>{name}</h2>
            <img src={imageUrl} alt={name} className="item-image"></img>
            <p className="item-description">{description}</p>
            <p className="item-price">${price}</p>
        </div>
    )
}
export default Item