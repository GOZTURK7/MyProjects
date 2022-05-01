import React, {useState}  from "react";
import { Card, Col, Row, Button } from "react-bootstrap";
import data from '../../assets/data/persons.json';

const Person = ({ name, age, image, id }) => {
    const [temizle, setTemizle] = useState("false");

  return (

    <Card className="d-flex " >
        <div >
            <p style={{
                margin: 0,
                fontSize: "2rem",
            }}>Bugün Doğanlar</p>
            <p>Bugün doğan {temizle=="false" ? `${data.length} kişi Bulundu`: "Listesi Temizlendi"}</p>
        </div>
    
    {data.map(({name, age, image, id})=>{

        return (
         temizle=="false" ?   
        <Row key={id} className="border my-3">
        <Col md={4}>
          <Card.Img
           style={{
            width: 300,
            margin: "20px",
            borderRadius: "150px",
            overflow: "hidden"
          }}
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
      </Row> : ""
        )})}
    
    
    <div className="d-flex">
        <Button variant="warning" className="ms-1 me-auto" onClick={() => setTemizle("true")}>Temizle</Button>
        <Button variant="warning" className="me-0 ms-auto" onClick={() => setTemizle("false")}>Bugün Doğanları Getir</Button>
    </div>
    </Card>
  );
};
export default Person;