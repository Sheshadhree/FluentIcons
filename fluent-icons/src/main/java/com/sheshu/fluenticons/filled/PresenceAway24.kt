package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAway24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAway24",
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
            moveToRelative(1f, -17.5f)
            verticalLineToRelative(4.81f)
            lineToRelative(2.976f, 2.551f)
            curveToRelative(0.63f, 0.54f, 0.702f, 1.486f, 0.163f, 2.115f)
            curveToRelative(-0.54f, 0.63f, -1.486f, 0.702f, -2.115f, 0.163f)
            lineToRelative(-3.5f, -3f)
            curveTo(10.19f, 12.854f, 10f, 12.438f, 10f, 12f)
            verticalLineTo(6.5f)
            curveTo(10f, 5.672f, 10.672f, 5f, 11.5f, 5f)
            reflectiveCurveTo(13f, 5.672f, 13f, 6.5f)
            close()
        }
    }.build()
}
