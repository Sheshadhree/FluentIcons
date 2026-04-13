package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.959f, 2.104f)
            curveToRelative(1.213f, -0.467f, 2.405f, 0.725f, 1.938f, 1.938f)
            lineTo(17.821f, 25.04f)
            curveToRelative(-0.522f, 1.36f, -2.48f, 1.251f, -2.85f, -0.157f)
            lineToRelative(-2.358f, -8.96f)
            curveToRelative(-0.069f, -0.261f, -0.273f, -0.465f, -0.535f, -0.534f)
            lineToRelative(-8.96f, -2.358f)
            curveToRelative(-1.408f, -0.37f, -1.515f, -2.328f, -0.156f, -2.85f)
            lineToRelative(20.997f, -8.076f)
            close()
        }
    }.build()
}
