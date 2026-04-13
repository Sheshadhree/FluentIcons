package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSort16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSort16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.854f, 2.147f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(4f, 3.707f)
            verticalLineTo(13.5f)
            curveTo(4f, 13.776f, 4.224f, 14f, 4.5f, 14f)
            reflectiveCurveTo(5f, 13.776f, 5f, 13.5f)
            verticalLineTo(3.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-3f, -3f)
            close()
            moveToRelative(6.298f, 11.713f)
            curveToRelative(0.194f, 0.187f, 0.502f, 0.187f, 0.696f, 0f)
            lineToRelative(3f, -2.9f)
            curveToRelative(0.198f, -0.193f, 0.203f, -0.51f, 0.011f, -0.708f)
            curveToRelative(-0.191f, -0.198f, -0.508f, -0.204f, -0.707f, -0.012f)
            lineTo(12f, 12.321f)
            verticalLineToRelative(-9.82f)
            curveTo(12f, 2.223f, 11.776f, 2f, 11.5f, 2f)
            reflectiveCurveTo(11f, 2.223f, 11f, 2.5f)
            verticalLineToRelative(9.82f)
            lineToRelative(-2.152f, -2.08f)
            curveToRelative(-0.199f, -0.192f, -0.516f, -0.187f, -0.708f, 0.011f)
            curveToRelative(-0.191f, 0.199f, -0.186f, 0.515f, 0.012f, 0.707f)
            lineToRelative(3f, 2.9f)
            close()
        }
    }.build()
}
