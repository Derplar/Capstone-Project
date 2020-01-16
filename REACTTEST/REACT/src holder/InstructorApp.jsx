//Imports
import React, { Component } from 'react';
import ListCoursesComponent from './ListCoursesComponent';

//All classes that involve React pretty much have to extend Component.
class InstructorApp extends Component {
    //Showing that each render exists within itself.
    //REACT.Fragment should be used when you don't really have anything to put it in.
    //I don't wanna drown in divs after all.
    render() {
        return (
            <React.Fragment>
                <h1>This sentence exists in InstructorApp</h1>
                <ListCoursesComponent/>
            </React.Fragment>
        )
    }
}

//When this is imported, automatically instantiates this class.
export default InstructorApp