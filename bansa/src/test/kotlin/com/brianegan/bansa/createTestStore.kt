package com.brianegan.bansa

import rx.schedulers.Schedulers

fun <S, A : Action> createTestStore(initialState: S, reducer: (S, A) -> S): Store<S, A> {
    return createStore(initialState, reducer, Schedulers.immediate());
}
