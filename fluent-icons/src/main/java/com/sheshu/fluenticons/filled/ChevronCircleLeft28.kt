package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChevronCircleLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChevronCircleLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(2f, 20.627f, 2f, 14f)
            reflectiveCurveTo(7.373f, 2f, 14f, 2f)
            close()
            moveToRelative(2.78f, 7.03f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(5.5f, 5.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(11.81f, 14f)
            lineToRelative(4.97f, -4.97f)
            close()
        }
    }.build()
}
