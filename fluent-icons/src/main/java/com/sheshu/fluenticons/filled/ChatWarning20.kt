package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChatWarning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatWarning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            curveToRelative(-1.273f, 0f, -2.504f, -0.298f, -3.613f, -0.86f)
            lineToRelative(-0.121f, -0.065f)
            lineToRelative(-3.645f, 0.91f)
            curveToRelative(-0.31f, 0.078f, -0.595f, -0.148f, -0.62f, -0.441f)
            verticalLineToRelative(-0.082f)
            lineToRelative(0.014f, -0.083f)
            lineToRelative(0.91f, -3.644f)
            lineToRelative(-0.063f, -0.12f)
            curveToRelative(-0.455f, -0.896f, -0.738f, -1.873f, -0.83f, -2.887f)
            lineToRelative(-0.025f, -0.382f)
            lineTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0f, 3.5f)
            curveTo(9.724f, 5.5f, 9.5f, 5.724f, 9.5f, 6f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
            moveToRelative(0f, 9f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 13f, 10f, 13f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 14.5f, 10f, 14.5f)
            close()
        }
    }.build()
}
