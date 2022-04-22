

import React from 'react'



const StyleInternal = () => {

  const stil = {
      color:"red", 
      textAlign:"center", 
      backgroundColor:"yellow"}

  return (

    <>
    <div style={stil}>StyleInternal</div>

    <br/>

    <div style={{...stil, color:"blue"}}>Hello</div>
    </>

  )
}

export default StyleInternal