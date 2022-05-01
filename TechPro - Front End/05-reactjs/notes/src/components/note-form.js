import { Button, Form } from "react-bootstrap";
import React from "react";

const NoteForm = () => {
  return (

    <>
        <Form.Group className="mb-3" controlId="formBasicEmail">
            <Form.Label>Notunuzu Giriniz</Form.Label>
            <Form.Control type="email" />
        </Form.Group>
        <Button variant="warning">Ekle</Button>

    </>

    );
}; 

export default NoteForm;
