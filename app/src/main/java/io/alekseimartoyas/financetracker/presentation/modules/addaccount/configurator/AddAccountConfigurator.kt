package io.alekseimartoyas.financetracker.presentation.modules.addaccount.configurator

import io.alekseimartoyas.financetracker.presentation.modules.addaccount.presenter.AddAccountPresenter
import io.alekseimartoyas.financetracker.presentation.modules.addaccount.view.AddAccountFragment
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput

class AddAccountConfigurator {

    fun buildModule(view: AddAccountFragment) {
        val presenter = AddAccountPresenter()
        presenter.setView(view)
        presenter.setRouter(view.activity as IMainActivityRouterInput)

        view.presenter = presenter
    }
}