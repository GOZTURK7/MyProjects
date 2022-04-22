import React from 'react'

const StyleInline = () => {

  const id = "x"

  return (

    <div>
        <h2 style={
            {
                color: "red",
                backgroundColor: "black"
            }
        }>
            Hello World
        </h2>

        <p id="x" style={{textAlign: "center", fontWeight:"bold"}}>mamamak maikmak a imkagğnak k  mikekamika </p>
        <p id={id}>deneme</p>
    </div>

  )
}

export default StyleInline