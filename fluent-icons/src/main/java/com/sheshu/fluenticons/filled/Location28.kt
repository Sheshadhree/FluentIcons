package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Location28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Location28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.575f, 5.075f)
            curveToRelative(4.1f, -4.1f, 10.75f, -4.1f, 14.85f, 0f)
            reflectiveCurveToRelative(4.1f, 10.75f, 0f, 14.85f)
            lineToRelative(-0.01f, 0.01f)
            lineToRelative(-5.509f, 5.295f)
            curveToRelative(-1.064f, 1.022f, -2.747f, 1.021f, -3.811f, -0.002f)
            lineToRelative(-5.51f, -5.293f)
            lineToRelative(-0.01f, -0.01f)
            curveToRelative(-4.1f, -4.1f, -4.1f, -10.75f, 0f, -14.85f)
            close()
            moveTo(14f, 8.5f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
        }
    }.build()
}
