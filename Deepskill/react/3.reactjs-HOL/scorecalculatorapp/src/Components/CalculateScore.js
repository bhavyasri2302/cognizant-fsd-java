import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const average = props.total / props.goal;

    return (
        <div className="box">
            <h1>Student Management Portal</h1>

            <h2>Student Details</h2>

            <p><strong>Name :</strong> {props.name}</p>

            <p><strong>School :</strong> {props.school}</p>

            <p><strong>Total Marks :</strong> {props.total}</p>

            <p><strong>Number of Subjects :</strong> {props.goal}</p>

            <h2>Average Score : {average.toFixed(2)}</h2>
        </div>
    );
}

export default CalculateScore;