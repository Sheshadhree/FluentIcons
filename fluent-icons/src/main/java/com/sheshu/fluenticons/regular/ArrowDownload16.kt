package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownload16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownload16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(12.5f, 14f)
            horizontalLineToRelative(-9f)
            curveTo(3.224f, 14f, 3f, 13.776f, 3f, 13.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(3.5f, 13f)
            horizontalLineToRelative(9f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7.91f, 1.008f)
            lineTo(8f, 1f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(8.5f, 1.5f)
            verticalLineToRelative(8.792f)
            lineToRelative(2.682f, -2.681f)
            curveToRelative(0.173f, -0.174f, 0.443f, -0.193f, 0.638f, -0.058f)
            lineToRelative(0.07f, 0.058f)
            curveToRelative(0.173f, 0.174f, 0.192f, 0.443f, 0.057f, 0.638f)
            lineToRelative(-0.058f, 0.069f)
            lineToRelative(-3.535f, 3.536f)
            curveTo(8.18f, 12.027f, 7.91f, 12.046f, 7.716f, 11.91f)
            lineToRelative(-0.07f, -0.057f)
            lineToRelative(-3.535f, -3.536f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.174f, -0.174f, 0.443f, -0.193f, 0.638f, -0.058f)
            lineTo(4.818f, 7.61f)
            lineTo(7.5f, 10.292f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.246f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(8f, 1f)
            lineTo(7.91f, 1.008f)
            close()
        }
    }.build()
}
