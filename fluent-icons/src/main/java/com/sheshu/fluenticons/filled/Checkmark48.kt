package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Checkmark48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkmark48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.317f, 12.695f)
            curveToRelative(0.582f, 0.59f, 0.577f, 1.54f, -0.012f, 2.122f)
            lineToRelative(-22.25f, 22f)
            curveToRelative(-0.581f, 0.574f, -1.515f, 0.578f, -2.101f, 0.008f)
            lineToRelative(-9.25f, -9f)
            curveToRelative(-0.594f, -0.578f, -0.607f, -1.527f, -0.03f, -2.121f)
            curveToRelative(0.579f, -0.594f, 1.528f, -0.607f, 2.122f, -0.03f)
            lineToRelative(8.195f, 7.975f)
            lineToRelative(21.204f, -20.966f)
            curveToRelative(0.59f, -0.582f, 1.54f, -0.577f, 2.122f, 0.012f)
            close()
        }
    }.build()
}
