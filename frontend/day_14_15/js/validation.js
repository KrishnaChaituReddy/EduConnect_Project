function login() {
   
    // You can perform login validation and authentication here
    // For simplicity, let's just display an alert

    const username=document.getElementById("loginUsername").value;
    const password=document.getElementById("loginPassword").value;
    const message=document.getElementById("message");
    if(!username || !password)
    {
        message.innerHTML="All fields are requried";
    }
    console.log(`Login clicked. Username: ${username}, Password: ${password}`);
    
}

function register() {
 
    //const name=document.getElementById("registerName");
    const name=document.getElementById("registerName").value;
    const email=document.getElementById("registerEmail").value;
    const username=document.getElementById("registerUsername").value;
    const password=document.getElementById("registerPassword").value;
    const message=document.getElementById("message");
    if(!email.includes("@") || !email.includes(".") ||email.indexOf("@")>0 || email.lastIndexOf(".")< email.indexOf("@")+1 || email.lastIndexOf(".")>email.length-1);
    {
      message.innerHTML="The email is not invalid";
      return;
    }
    const specialcharacters=/[^a-zA-Z0-9]/.test(username);
    if(specialcharacters)
    {
        message.innerHTML="The username has special characters.";
        return;
    }
    console.log(`Register clicked. Name: ${name}, Email: ${email}, Username: ${username}, Password: ${password}`);
    const isValid=/(?=.*[A-Z])(?=.*\d)/.test(password);

    if(!name||!email||!username||!password)
    {
        message.innerHTML="All fields are requried";
        return;
    }
    if(!isValid)
    {
        message.innerHTML="Password follow rules";
        return;
    }
   if(password.length<8)
   {
    message.innerHTML="password has atleast 8 characters";
    return;
   }
   message.innerHTML="Successfully Created";
    // Frontend validation for registration form
    

    // Validate email format
    
    // Validate username (no special characters)
    

    // Validate password (at least 8 characters, one capital letter, and one numeric)
    
}
if(typeof module!=='undefined' && module.exports)
{
    module.exports = {login,register };
}

