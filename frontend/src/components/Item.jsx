function Item(props) {
    return (
        <div className="item">
            <h2>{props.name}</h2>
            <img src={props.imageUrl} alt={props.name} className="item-image"></img>
            <p className="item-description">{props.description}</p>
            <p className="item-price">${props.price}</p>
        </div>
    )
}