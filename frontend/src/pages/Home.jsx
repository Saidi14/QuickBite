import Header from "../components/Header"

function Home(){
    return(
        <div className="home">
            <Header/>
            {/*Todo: implement promoImage component */}

            <img src="/src/assets/bannerImage.jpg" alt="Promo Image" className="bannerImage"></img>

            {/*Todo: Add Banners */}
            
            {/*Todo: implement Footer component */}
        </div>
    )
}
export default Home