package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAway20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAway20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 20f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(15.523f, 0f, 10f, 0f)
            reflectiveCurveTo(0f, 4.477f, 0f, 10f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(0f, -13.992f)
            verticalLineToRelative(3.578f)
            lineToRelative(2.707f, 2.707f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.415f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-3f, -3f)
            curveTo(8.105f, 10.52f, 8f, 10.265f, 8f, 10f)
            verticalLineTo(6.008f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
        }
    }.build()
}
