package com.Asset.AssetInfo;

import com.Asset.AssetInfo.POJO.Asset;
import com.Asset.AssetInfo.POJO.Computer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        @RequestMapping(value = "/asset",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity giveAssetInfo()
        {
                Asset asset = new Asset();
                Computer computer = new Computer();
                computer.setSerialNum("SER10201");
                asset.setComputer(computer);
               return new ResponseEntity<>(asset, HttpStatus.OK);

        }
}
