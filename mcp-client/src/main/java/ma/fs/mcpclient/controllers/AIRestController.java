package ma.fs.mcpclient.controllers;

import ma.fs.mcpclient.agents.AiAgent;
import org.springframework.web.bind.annotation.GetMapping;

public class AIRestController {
    private AiAgent agent;

    public AIRestController(AiAgent agent)
    {
        this.agent = agent;
    }
    @GetMapping("/chat")
     public String chat(String query){
        return agent.askLLM(query);     }
}
