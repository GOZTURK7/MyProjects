import React from 'react'
const Jsx = () => {

    const isAdmin = false;

  return (

    <div>

        {isAdmin ? 
        <>
        <h2>Admin Menu</h2>
        <ul>
            <li>Create User</li>
            <li>Update User</li>
            <li>Delete User</li>
        </ul>
        </>
            
        :
        <>
        <h2>User Menu</h2>
        <ul>
            <li>Create Review</li>
            <li>Update Review</li>
            <li>Delete Review</li>
        </ul>
        </>
        }

    </div>

  )
}

const Test1 = ()=>{
    return(
        <>test1</>
    )
}


const Test2 = ()=>{
    return(
        <>test2</>
    )
}

export default Jsx;
export {Test1, Test2}