package dev.condenation;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.condenation.model.Criptografia;
import dev.condenation.service.CodenationService;
import dev.condenation.utils.Helper;

import java.io.File;

public class ChallengeApp {

    public static void main(String[] args) throws Exception {
        CodenationService service = new CodenationService();
        Criptografia criptoChallenge = service.getChallange();
        Helper.saveToFile(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(criptoChallenge), "./answer.json");
        criptoChallenge.setDecifrado(Helper.decript(criptoChallenge.getCifrado(), criptoChallenge.getNumeroCasas()))
                .setResumoCriptografico(org.apache.commons.codec.digest.DigestUtils.sha1Hex(criptoChallenge.getDecifrado()));
        Helper.saveToFile(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(criptoChallenge), "./answer.json");
        service.sendAnwser(new File(System.getProperty("user.dir") + "/answer.json"));
    }
}
