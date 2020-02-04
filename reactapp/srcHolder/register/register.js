import React, { Component } from 'react';
import RegisterButtonService from './RegisterButtonService';

class Register extends Component {
    constructor(props) {
        super(props);

        this.state = {
            customer: [],
            email: '',
            street: '',
            password: '',
            firstName: '',
            lastName: '',
            houseNumber: '',
            unitNumber: '',
            postalCode: '',
            city: '',
            province: '',
            country: '',
            phoneNumber: ''
        }

        this.myChangeHandler = this.myChangeHandler.bind(this);
    }


    myChangeHandler = (event) => {
        this.setState({ [event.target.name]: event.target.value });
    }

    mySubmitHandler = (event) => {
        event.preventDefault();


        alert("you are submiting" + this.state.firstname);

        this.registerNew();

    }

    registerNew() {

        var custInfo = {
            lastName: this.state.lastName,
            firstName: this.state.firstName,
            street: this.state.street,
            houseNumber: this.state.houseNumber,
            unitNumber: this.state.unitNumber,
            city: this.state.city,
            province: this.state.province,
            postalCode: this.state.postalCode,
            country: this.state.country,
            email: this.state.email,
            password: this.state.password,
            phoneNumber: this.state.phoneNumber,
            dateOfBirth: Date.now(),
        }


        RegisterButtonService.RegisterNewCustomer(custInfo)
        
            .then(
                response => {
                    console.log(response.data);
                    this.setState({ customer: response.data })
                }
            )
            
    }

    render() {
        return (
            <React.Fragment>
                <form onSubmit={this.mySubmitHandler}>
                    <label>Email:</label><input type='text' name='email' onChange={this.myChangeHandler} />
                    <label>Password:</label><input type='text' name='password' onChange={this.myChangeHandler} />
                    <br></br>
                    <label>First name:</label><input type='text' name='firstName' onChange={this.myChangeHandler} />
                    <label>Last name:</label><input type='text' name='lastName' onChange={this.myChangeHandler} />
                    <br></br>
                    <label>Building/House number:</label><input type='text' name='houseNumber' onChange={this.myChangeHandler} />
                    <label>Unit number:</label><input type='text' name='unitNumber' onChange={this.myChangeHandler} />
                    <br></br>
                    <label>Street:</label><input type='text' name='street' onChange={this.myChangeHandler} />
                    <label>Postal Code:</label><input type='text' name='postalCode' onChange={this.myChangeHandler} />
                    <br></br>
                    <label>City:</label><input type='text' name='city' onChange={this.myChangeHandler} />
                    <label>Province:</label><input type='text' name='province' onChange={this.myChangeHandler} />
                    <br></br>
                    <label>Country:</label><input type='text' name='country' onChange={this.myChangeHandler} />
                    <label>Phone Number:</label><input type='text' name='phoneNumber' onChange={this.myChangeHandler} />
                    <br></br>
                    <input type='submit' />
                </form>

                <table className="registertable">
                    <thead>
                        <tr>
                            <th>Email</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Postal</th>
                            <th>Province</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            <tr>
                                <td>{this.state.customer.email}</td>
                                <td>{this.state.customer.firstName}</td>
                                <td>{this.state.customer.lastName}</td>
                                <td>{this.state.customer.postalCode}</td>
                                <td>{this.state.customer.province}</td>
                            </tr>

                        }
                    </tbody>
                </table>
            </React.Fragment>
        )
    }
}
export default Register;
