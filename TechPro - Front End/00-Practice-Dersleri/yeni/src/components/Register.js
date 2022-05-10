import React, { useContext, useState } from "react";
import { Button, Container, Form, Spinner } from "react-bootstrap";
import {useFormik} from 'formik';
import * as Yup from 'yup';
import { StoreContext } from "../store";

const Register = () => {
  const context = useContext(StoreContext)
  const [loading, setLoading] = useState(false);
  

  const initialValues = {
    firstName: "",
    lastName: "",
    phoneNumber:"",
    email:"",
    password:"",
    confirmPassword:"",
  }


  const phoneRegExp = /^((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?$/

  const validationSchema = Yup.object({
      firstName: Yup.string().required("Please enter your first name"),
      lastName: Yup.string().required("Please enter your last name"),
      phoneNumber: Yup.string().required("Please enter your phone number").matches(phoneRegExp, 'Phone number is not valid'),
      email:Yup.string().email().required("Please enter your email"),
      password: Yup.string().required("Please enter your password"),
      confirmPassword: Yup.string().required("Please enter your password again").oneOf([Yup.ref("password")], "Fields don't match"),
  });

  const onSubmit = (values)=>{
    setLoading(true);
    setTimeout(()=>{
      setLoading(false);
      alert("işlem başarılı")
    },1500)
  }


  const formik = useFormik({
    initialValues,
    validationSchema,
    onSubmit,
  })

  return (
  
    <Container>
    <Form noValidate onSubmit={formik.handleSubmit}>
    <h1>{context.count}</h1>
    <Form.Group className="mb-3">
      <Form.Label>First Name</Form.Label>
      <Form.Control type="text"
      {...formik.getFieldProps("firstName")}
      isInvalid={formik.touched.firstName && !!formik.errors.firstName}
      isValid={formik.touched.firstName && !formik.errors.firstName}
      />
    </Form.Group>

    <Form.Group className="mb-3">
      <Form.Label>Last Name</Form.Label>
      <Form.Control type="text"
      {...formik.getFieldProps("lastName")}
      isInvalid={formik.touched.lastName && !!formik.errors.lastName}
      isValid={formik.touched.lastName && !formik.errors.lastName}
      />
    </Form.Group>

    <Form.Group className="mb-3">
      <Form.Label>Phone Number</Form.Label>
      <Form.Control type="text"
       {...formik.getFieldProps("phoneNumber")}
       isInvalid={formik.touched.phoneNumber && !!formik.errors.phoneNumber}
       isValid={formik.touched.phoneNumber && !formik.errors.phoneNumber}
       />
    </Form.Group>

    <Form.Group className="mb-3">
      <Form.Label>Email address</Form.Label>
      <Form.Control type="email"
       {...formik.getFieldProps("email")}
       isInvalid={formik.touched.email && !!formik.errors.email}
       isValid={formik.touched.email && !formik.errors.email}/>
    </Form.Group>

    <Form.Group className="mb-3">
      <Form.Label>Password</Form.Label>
      <Form.Control type="password"
       {...formik.getFieldProps("password")}
       isInvalid={formik.touched.password && !!formik.errors.password}
       isValid={formik.touched.password && !formik.errors.password}/>
    </Form.Group>

    <Form.Group className="mb-3">
      <Form.Label>Confirm Password</Form.Label>
      <Form.Control type="password"
       {...formik.getFieldProps("confirmPassword")}
       isInvalid={formik.touched.confirmPassword && !!formik.errors.confirmPassword}
       isValid={formik.touched.confirmPassword && !formik.errors.confirmPassword}/>
    </Form.Group>

    <Button variant="primary" type="submit" disabled={loading}>
      {loading && <Spinner animation="border" size="md"/>}
      Register
    </Button>

  </Form>
  </Container>
  
    )
};

export default Register;
