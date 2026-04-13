package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Search16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Search16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.02f, 10.727f)
            curveTo(9.066f, 11.522f, 7.839f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 9.538f, 1f, 6.5f)
            reflectiveCurveTo(3.462f, 1f, 6.5f, 1f)
            reflectiveCurveTo(12f, 3.462f, 12f, 6.5f)
            curveToRelative(0f, 1.339f, -0.478f, 2.566f, -1.273f, 3.52f)
            lineToRelative(3.127f, 3.126f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            lineToRelative(-3.127f, -3.127f)
            close()
            moveTo(11f, 6.5f)
            curveTo(11f, 4.015f, 8.985f, 2f, 6.5f, 2f)
            reflectiveCurveTo(2f, 4.015f, 2f, 6.5f)
            reflectiveCurveTo(4.015f, 11f, 6.5f, 11f)
            reflectiveCurveTo(11f, 8.985f, 11f, 6.5f)
            close()
        }
    }.build()
}
