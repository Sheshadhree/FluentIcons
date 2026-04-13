package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ZoomOut16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ZoomOut16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 1f)
            curveTo(9.538f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveToRelative(0f, 1.339f, -0.478f, 2.566f, -1.273f, 3.52f)
            lineToRelative(3.127f, 3.127f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-3.127f, -3.127f)
            curveTo(9.066f, 11.522f, 7.839f, 12f, 6.5f, 12f)
            curveTo(3.462f, 12f, 1f, 9.538f, 1f, 6.5f)
            reflectiveCurveTo(3.462f, 1f, 6.5f, 1f)
            close()
            moveToRelative(-2f, 5f)
            curveTo(4.224f, 6f, 4f, 6.224f, 4f, 6.5f)
            reflectiveCurveTo(4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(4f)
            curveTo(8.776f, 7f, 9f, 6.776f, 9f, 6.5f)
            reflectiveCurveTo(8.776f, 6f, 8.5f, 6f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
