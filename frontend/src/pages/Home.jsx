import Footer from "../components/Footer"
import Header from "../components/Header"
import ItemBanner from "../components/ItemBanner"

function Home(){
    return(
        <div className="home">
            <Header/>
            <img src="/src/assets/bannerImage.jpg" alt="Promo Image" className="bannerImage"></img>

            <ItemBanner/>
            
            <Footer/>
        </div>
    )
}
export default Home