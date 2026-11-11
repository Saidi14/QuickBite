import '../style.css'

function Login() {
    return(
        <div className='login'>
            <img className='loginIcon'></img>
            <p className='loginTitle'></p>
            <p classname='loginText'></p>
            
            <form>
                <input type='text'></input>
                <input type='password'></input>

                <p className='submit'>submit</p>
            </form>
        </div>
    )
}

export default Login;
