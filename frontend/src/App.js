import React from 'react';
import {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import ListEmployees from "./components/ListEmployees/ListEmployees";

class App extends Component {


  render() {
    return (
        <ListEmployees employees={this.state.employees} />
    )
  }

  state = {
    employees: []
  };

  componentDidMount() {
    fetch('http://localhost:8080/rest/employees')
        .then(res => res.json())
        .then((data) => {
          this.setState({ employees: data })
        })
        .catch(console.log)
  }

}
export default App;
