package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ZoomOut20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ZoomOut20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
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
            moveTo(6f, 8f)
            curveTo(5.724f, 8f, 5.5f, 8.224f, 5.5f, 8.5f)
            reflectiveCurveTo(5.724f, 9f, 6f, 9f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 8f, 11f, 8f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
