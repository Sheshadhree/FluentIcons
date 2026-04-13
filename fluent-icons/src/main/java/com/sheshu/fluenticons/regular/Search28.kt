package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Search28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Search28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.666f, 18.727f)
            curveTo(16.006f, 20.144f, 13.853f, 21f, 11.5f, 21f)
            curveTo(6.253f, 21f, 2f, 16.747f, 2f, 11.5f)
            reflectiveCurveTo(6.253f, 2f, 11.5f, 2f)
            reflectiveCurveTo(21f, 6.253f, 21f, 11.5f)
            curveToRelative(0f, 2.353f, -0.856f, 4.507f, -2.273f, 6.166f)
            lineToRelative(6.053f, 6.054f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-6.054f, -6.053f)
            close()
            moveTo(19.5f, 11.5f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
        }
    }.build()
}
