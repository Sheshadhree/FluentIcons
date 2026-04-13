package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.473f, 18.887f)
            curveTo(15.842f, 20.21f, 13.763f, 21f, 11.5f, 21f)
            curveTo(6.253f, 21f, 2f, 16.747f, 2f, 11.5f)
            reflectiveCurveTo(6.253f, 2f, 11.5f, 2f)
            reflectiveCurveTo(21f, 6.253f, 21f, 11.5f)
            curveToRelative(0f, 2.263f, -0.791f, 4.341f, -2.113f, 5.973f)
            lineToRelative(5.82f, 5.82f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-5.82f, -5.82f)
            close()
            moveTo(19f, 11.5f)
            curveTo(19f, 7.358f, 15.642f, 4f, 11.5f, 4f)
            curveTo(7.358f, 4f, 4f, 7.358f, 4f, 11.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            close()
        }
    }.build()
}
