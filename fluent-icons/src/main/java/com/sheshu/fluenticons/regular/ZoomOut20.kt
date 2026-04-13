package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ZoomOut20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ZoomOut20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 8f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.276f, 9f, 11f, 9f)
            horizontalLineTo(6f)
            curveTo(5.724f, 9f, 5.5f, 8.776f, 5.5f, 8.5f)
            reflectiveCurveTo(5.724f, 8f, 6f, 8f)
            horizontalLineToRelative(5f)
            close()
            moveTo(8.5f, 2f)
            curveTo(12.09f, 2f, 15f, 4.91f, 15f, 8.5f)
            curveToRelative(0f, 1.615f, -0.589f, 3.093f, -1.563f, 4.23f)
            lineToRelative(3.417f, 3.416f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(-0.174f, 0.174f, -0.443f, 0.193f, -0.638f, 0.058f)
            lineToRelative(-0.07f, -0.058f)
            lineToRelative(-3.417f, -3.417f)
            curveTo(11.594f, 14.412f, 10.116f, 15f, 8.5f, 15f)
            curveTo(4.91f, 15f, 2f, 12.09f, 2f, 8.5f)
            reflectiveCurveTo(4.91f, 2f, 8.5f, 2f)
            close()
            moveToRelative(0f, 1f)
            curveTo(5.462f, 3f, 3f, 5.462f, 3f, 8.5f)
            reflectiveCurveTo(5.462f, 14f, 8.5f, 14f)
            curveToRelative(1.339f, 0f, 2.566f, -0.478f, 3.52f, -1.273f)
            curveToRelative(0.256f, -0.214f, 0.493f, -0.451f, 0.707f, -0.707f)
            curveTo(13.522f, 11.066f, 14f, 9.838f, 14f, 8.5f)
            curveTo(14f, 5.462f, 11.538f, 3f, 8.5f, 3f)
            close()
        }
    }.build()
}
