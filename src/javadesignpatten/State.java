/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatten;

//State（抽象状态类）
interface StateI {
    void handleState(String str);
}
//ConcreteState（具体状态类）
class ConcreteStateWating implements StateI {
    @Override
    public void handleState(String str) {
        System.out.println("State: wating, str="+str);
    }
}

class ConcreteStateLoading implements StateI {
    @Override
    public void handleState(String str) {
        System.out.println("State: loading, str="+str);
    }
}

class ConcreteStateFinish implements StateI {
    @Override
    public void handleState(String str) {
        System.out.println("State: finish, str="+str);
    }
}

class ConcreteStateError implements StateI {
    @Override
    public void handleState(String str) {
        System.out.println("State: error, str="+str);
    }
}
//Context（环境类）
class Context {
    private StateI state;

    public void setState(StateI state) {
        this.state = state;
    }

    public void request(String str) {
        state.handleState(str);
    }
}
//客户端
public class State {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateWating());
        context.request("1");
        context.setState(new ConcreteStateLoading());
        context.request("2");
        context.setState(new ConcreteStateFinish());
        context.request("3");
        context.setState(new ConcreteStateError());
        context.request("e");
    }
}
