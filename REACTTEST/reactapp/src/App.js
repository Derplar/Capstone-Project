import React, { Component } from 'react';
import './App.css';
import InstructorApp from './InstructorApp';

//This is the very start of the React app.  Not in index.
class App extends Component {
  //This is to show that render can nest itself with relative ease.
  //Just so you know, when calling things like InstructorApp, it MUST exist in something.
  //It cannot exist on it's own.  If those divs weren't there, it'd break.
  render() {
    return (
      <div className="container">
        <h1>This sentence exists in App.js</h1>
        <InstructorApp />
      </div>
    );
  }
}

//Later.
export default App;
