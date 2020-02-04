import React, {Component} from 'react';  

class Form extends Component {  
    constructor(props) {
    super(props);
      
    this.state = {
      customer: []
    }
this.myChangeHandler = this.myChangeHandler.bind(this);
}

myChangeHandler = (event) => {
  this.setState({ [event.target.name]: event.target.value });
}

mySubmitHandler = (event) => {
  event.preventDefault();
     

  alert("you are submiting" + this.state.firstname);
   
  //put axios? here. 
}

render() {
  return (
    <form onSubmit={() => this.mySubmitHandler}>
    <label>Email:</label><input type='text' name='email' onChange={this.myChangeHandler} />      
    <label>Password:</label><input type='text' name='password' onChange={this.myChangeHandler} />      
    <label>First name:</label><input type='text' name='firstname' onChange={this.myChangeHandler} />
    <label>Last name:</label><input type='text' name='lastname' onChange={this.myChangeHandler} />
    <label>Building number:</label><input type='text' name='building' onChange={this.myChangeHandler} />
    <label>Unit number:</label><input type='text' name='unit' onChange={this.myChangeHandler} />
    <label>Postal Code:</label><input type='text' name='postal' onChange={this.myChangeHandler} />
    <label>City:</label><input type='text' name='city' onChange={this.myChangeHandler} />
    <label>Province:</label><input type='text' name='province' onChange={this.myChangeHandler} />
    <label>Country:</label><input type='text' name='country' onChange={this.myChangeHandler} />
    <input type='submit'/>
    </form>
  );
}
}
export default Form;
