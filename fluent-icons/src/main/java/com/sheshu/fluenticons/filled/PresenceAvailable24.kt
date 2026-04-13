package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAvailable24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAvailable24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(18.627f, 0f, 12f, 0f)
            reflectiveCurveTo(0f, 5.373f, 0f, 12f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            close()
            moveToRelative(5.06f, -13.44f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.585f, 0.586f, -1.535f, 0.586f, -2.12f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.587f, -0.585f, -0.587f, -1.535f, 0f, -2.12f)
            curveToRelative(0.585f, -0.586f, 1.535f, -0.586f, 2.12f, 0f)
            lineToRelative(0.94f, 0.939f)
            lineToRelative(4.44f, -4.44f)
            curveToRelative(0.585f, -0.585f, 1.535f, -0.585f, 2.12f, 0f)
            curveToRelative(0.586f, 0.586f, 0.586f, 1.536f, 0f, 2.122f)
            close()
        }
    }.build()
}
