package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flag20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 13f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.4f, 0f, 0.637f, -0.445f, 0.416f, -0.777f)
            lineTo(14.101f, 8f)
            lineToRelative(2.815f, -4.223f)
            curveTo(17.137f, 3.445f, 16.899f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-12f)
            curveTo(4.224f, 3f, 4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(14f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}
