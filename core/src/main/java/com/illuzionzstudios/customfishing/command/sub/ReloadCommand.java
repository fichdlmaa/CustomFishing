package com.illuzionzstudios.customfishing.command.sub;

import com.illuzionzstudios.core.bukkit.command.type.SubCommand;
import com.illuzionzstudios.customfishing.CustomFishing;
import com.illuzionzstudios.customfishing.controller.RewardsController;
import com.illuzionzstudios.customfishing.struct.Permission;

/**
 * Copyright © 2020 Property of Illuzionz Studios, LLC
 * All rights reserved. No part of this publication may be reproduced, distributed, or
 * transmitted in any form or by any means, including photocopying, recording, or other
 * electronic or mechanical methods, without the prior written permission of the publisher,
 * except in the case of brief quotations embodied in critical reviews and certain other
 * noncommercial uses permitted by copyright law. Any licensing of this software overrides
 * this statement.
 */

public class ReloadCommand extends SubCommand {

    private CustomFishing plugin;

    public ReloadCommand(CustomFishing plugin) {
        super("reload", "rl");

        this.plugin = plugin;

        this.requiredPermission = Permission.RELOAD;
    }

    @Override
    public void onCommand(String s, String[] strings) {
        plugin.reloadConfig();
        plugin.getLocale().getMessage("general.reload").sendPrefixedMessage(commandSender);
    }

    @Override
    public boolean isConsoleAllowed() {
        return true;
    }

    @Override
    public boolean isPublic() {
        return true;
    }

}
