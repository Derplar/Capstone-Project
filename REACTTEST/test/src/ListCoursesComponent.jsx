import React, { Component } from 'react';
import CourseDataService from './CourseDataService';
import ButtonDataService from './ButtonDataService';

//This is the main 'react' file for this example.
class ListCoursesComponent extends Component {

    //A proper constructor for when this class is created.  The other classes just have default states.
    //Props exist as a component.  Do not put methods in here no matter what.  Just datatypes.   
    constructor(props) {
        super(props)
        //Whenever state is called in any form, render is refreshed.  This right here?
        //This is why react is special.  Think of state as class level variables.
        this.state = {
            courses: [],
            message: 'Testeroni'
        }
    }

    //This method runs pretty much right after the constructor.  
    //This is best used to actually load the data.
    componentDidMount() {
        this.refreshCourses();
    }

    //Just a regular old method.
    refreshCourses() {
        //Calls the CourseDataService function.  Go there if you want to know more about it.
        CourseDataService.retrieveAllCourses("in28minutes")//HARDCODED
            //After it's done, it will then do this.
            .then(
                //The response is the chunk of code that was returned from the CourseDataService.
                response => {
                    //Print is to the console
                    console.log(response);
                    //Set the state.  Remember, once the state is changed, render is run again.
                    //We're setting ONLY the courses, and courses is an array of -something-.
                    this.setState({ courses: response.data })
                }
            )
    }
    
    //Same thing as refreshCourses
    getButton() {
        ButtonDataService.retrieveButtonName()
            .then(
                response => {
                    console.log(response);
                    //We're setting ONLY the message, and it is a string.
                    this.setState( {message: response.data})
                }
            )
    }

    callButton() {
        this.getButton();
    }
    
    //Cannot put comments in render, just so you know.
    //When you call something out of the render function, put it in curly braces {}.
    //Because of how React is set up, you must declare an anonymous function and have it point
    //to the method.  This is a simple lambda reference.
    //The this.state.courses.map is basically converting the array into a dictionary.  From 3rd semester, remember?
    //Then it automatically goes through every element in the map and creates a table row based on what course it's on.
    render() {
        return (
            <div className="container">
                <h3>All Courses</h3>
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Description</th>
                            </tr>
                        </thead>
                        <tbody>
                            
                            {
                                this.state.courses.map(
                                    course =>
                                        <tr key={course.id}>
                                            <td>{course.id}</td>
                                            <td>{course.description}</td>
                                        </tr>
                                )
                            }
                        </tbody>
                    </table>
                    <br>
                    </br>
                    <button type="button" onClick={() => this.callButton()}>{this.state.message}</button>
                </div>
            </div>
        )
    }
}

export default ListCoursesComponent