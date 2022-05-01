import React, {useState}  from "react";
import { Card, Col, Row, Button } from "react-bootstrap";
import data from '../../assets/data/persons.json';

const Person = ({ name, age, image}) => {

 
  return (

    <Card className="d-flex mb-5" >
        <Row className="my-3">
        <Col md={4}>
          <Card.Img
            variant="top"
            src={require(`../../assets/img/people/${image}`)}
          />
        </Col>
        <Col md={8}>
          <Card.Body>
            <Card.Title>{name}</Card.Title>
            <Card.Text>{age}</Card.Text>
          </Card.Body>
        </Col>
      </Row> 
    </Card>
  );
};
export default Person;