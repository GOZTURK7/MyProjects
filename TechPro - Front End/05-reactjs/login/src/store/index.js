import {createContext, useContext, useReducer} from 'react';
import { userInitialState } from './user/userInitialState';
import {userReducer} from './user/userReducer';
/* Merkezi State oluşturulor  */
const StoreContext = createContext();


/* Merkezi State'in useContext(StoreContext) diger componentlerde import unu kolaşlaşırak için useStore'a eşitledik.*/
export const useStore = () => useContext(StoreContext);

export const StoreProvider = ({children}) => {
    const [userState, dispatchUser] = useReducer(userReducer, userInitialState)
    return (
        <StoreContext.Provider value={{userState, dispatchUser}}>
            {children}
        </StoreContext.Provider>
    )
}