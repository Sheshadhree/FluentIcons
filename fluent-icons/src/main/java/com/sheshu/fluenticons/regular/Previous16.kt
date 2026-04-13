package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Previous16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Previous16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 2.5f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            reflectiveCurveTo(3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 13.776f, 2.776f, 14f, 2.5f, 14f)
            reflectiveCurveTo(2f, 13.776f, 2f, 13.5f)
            verticalLineToRelative(-11f)
            close()
            moveToRelative(12f, 0.502f)
            curveToRelative(0f, -0.812f, -0.916f, -1.285f, -1.579f, -0.816f)
            lineToRelative(-7f, 4.963f)
            curveToRelative(-0.56f, 0.397f, -0.563f, 1.227f, -0.006f, 1.628f)
            lineToRelative(7f, 5.037f)
            curveTo(13.078f, 14.29f, 14f, 13.818f, 14f, 13.003f)
            verticalLineTo(3.002f)
            close()
            moveTo(6f, 7.965f)
            lineToRelative(7f, -4.963f)
            verticalLineToRelative(10f)
            lineTo(6f, 7.966f)
            close()
        }
    }.build()
}
