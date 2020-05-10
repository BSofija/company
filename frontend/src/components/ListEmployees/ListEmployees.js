import React, {Component} from 'react';
import {NavLink} from 'react-router-dom';
import {
    withRouter
} from 'react-router-dom';

const ListEmployees = ({ employees }) =>  {
    return (
        <div>
            <center><h1>Employee List</h1></center>
            {employees.map((employee) => (
                <div className="card">
                    <div className="card-body">
                        <h5 className="card-title">{employee.id}</h5>
                        <h5 className="card-title">{employee.firstName}</h5>
                        <h5 className="card-title">{employee.lastName}</h5>
                        <h6 className="card-subtitle mb-2 text-muted">{employee.email}</h6>
                        <p className="card-text">{employee.salary}</p>
                    </div>
                </div>
            ))}
        </div>
    )
};
export default ListEmployees