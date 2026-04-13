package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Bot12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bot12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 6f)
            curveTo(9.328f, 6f, 10f, 6.672f, 10f, 7.5f)
            curveToRelative(0f, 1.116f, -0.459f, 2.01f, -1.212f, 2.615f)
            curveToRelative(-0.649f, 0.52f, -1.49f, 0.808f, -2.396f, 0.871f)
            curveTo(6.262f, 10.996f, 6.132f, 11f, 6f, 11f)
            reflectiveCurveToRelative(-0.262f, -0.005f, -0.392f, -0.014f)
            curveToRelative(-0.905f, -0.063f, -1.747f, -0.35f, -2.396f, -0.87f)
            curveTo(2.459f, 9.51f, 2f, 8.615f, 2f, 7.5f)
            curveToRelative(0f, -0.777f, 0.59f, -1.415f, 1.347f, -1.492f)
            lineTo(3.5f, 6f)
            horizontalLineToRelative(5f)
            close()
            moveTo(6f, 0f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(1f)
            horizontalLineToRelative(1f)
            curveTo(8.328f, 1f, 9f, 1.672f, 9f, 2.5f)
            verticalLineToRelative(1f)
            curveTo(9f, 4.328f, 8.328f, 5f, 7.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(3.672f, 5f, 3f, 4.328f, 3f, 3.5f)
            verticalLineToRelative(-1f)
            curveTo(3f, 1.672f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineToRelative(1f)
            verticalLineTo(0.5f)
            curveTo(5.5f, 0.224f, 5.724f, 0f, 6f, 0f)
            close()
        }
    }.build()
}
