import firebase from 'firebase/app'
import 'firebase/firebase-database';
import 'firebase/storage';

const oFirebase = firebase.initializeApp({
    databaseURL: "https://play-dish-default-rtdb.asia-southeast1.firebasedatabase.app",
    storageBucket: "play-dish.appspot.com",
});

const oDB = oFirebase.database();

export const oPicturesinDB = oDB.ref('pictures');
export const oStorage = oFirebase.storage();