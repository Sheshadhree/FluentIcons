package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Add48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Add48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(16f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-16f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-16f)
            horizontalLineToRelative(-16f)
            curveTo(5.672f, 25.5f, 5f, 24.828f, 5f, 24f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(-16f)
            curveTo(22.5f, 5.672f, 23.172f, 5f, 24f, 5f)
            close()
        }
    }.build()
}
