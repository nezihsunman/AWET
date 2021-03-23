package com.awet_integrated.tedd.extraction.statement;

import java.util.List;

public interface SeleniumStatement {

    List<Action> getActions();

    Action getLocator();
}
