package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceAvailable16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceAvailable16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 16f)
            curveToRelative(4.418f, 0f, 8f, -3.582f, 8f, -8f)
            reflectiveCurveToRelative(-3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            close()
            moveToRelative(3.707f, -9.293f)
            lineToRelative(-4.003f, 4f)
            curveTo(7.516f, 10.895f, 7.262f, 11f, 6.996f, 11f)
            curveToRelative(-0.265f, 0f, -0.52f, -0.106f, -0.707f, -0.293f)
            lineToRelative(-1.997f, -2f)
            curveToRelative(-0.39f, -0.391f, -0.39f, -1.025f, 0.002f, -1.415f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0.002f)
            lineToRelative(1.29f, 1.292f)
            lineToRelative(3.295f, -3.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            close()
        }
    }.build()
}
