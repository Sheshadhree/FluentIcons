package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Search20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Search20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.73f, 13.436f)
            curveTo(11.591f, 14.411f, 10.114f, 15f, 8.5f, 15f)
            curveTo(4.91f, 15f, 2f, 12.09f, 2f, 8.5f)
            reflectiveCurveTo(4.91f, 2f, 8.5f, 2f)
            reflectiveCurveTo(15f, 4.91f, 15f, 8.5f)
            curveToRelative(0f, 1.615f, -0.589f, 3.092f, -1.564f, 4.23f)
            lineToRelative(3.418f, 3.416f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(-0.174f, 0.173f, -0.444f, 0.192f, -0.638f, 0.057f)
            lineToRelative(-0.07f, -0.057f)
            lineToRelative(-3.417f, -3.418f)
            close()
            moveToRelative(-0.71f, -0.71f)
            curveToRelative(0.256f, -0.213f, 0.493f, -0.45f, 0.707f, -0.706f)
            curveTo(13.521f, 11.066f, 14f, 9.839f, 14f, 8.5f)
            curveTo(14f, 5.462f, 11.538f, 3f, 8.5f, 3f)
            reflectiveCurveTo(3f, 5.462f, 3f, 8.5f)
            reflectiveCurveTo(5.462f, 14f, 8.5f, 14f)
            curveToRelative(1.339f, 0f, 2.566f, -0.478f, 3.52f, -1.273f)
            close()
        }
    }.build()
}
