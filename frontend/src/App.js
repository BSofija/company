import React from 'react';
import {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import ListEmployees from "./components/ListEmployees/ListEmployees";
import Calendar from 'react-calendar'
import {Router} from 'react';
import {BrowserRouter} from 'react-router-dom';
import Header from "./components/Header/Header"
class App extends Component {


    render() {
        return (
            <BrowserRouter>
                <Header/>
                <ListEmployees employees={this.state.employees} />
            </BrowserRouter>


        )
    }

    state = {
        employees: [],

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