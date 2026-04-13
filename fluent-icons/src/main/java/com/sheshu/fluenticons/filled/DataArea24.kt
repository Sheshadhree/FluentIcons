package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataArea24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataArea24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(13.5f)
            curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
            horizontalLineTo(20f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(15.5f, 3.75f)
            verticalLineTo(18f)
            horizontalLineToRelative(-13f)
            curveTo(6.224f, 18f, 6f, 17.776f, 6f, 17.5f)
            verticalLineTo(9.162f)
            lineToRelative(2.165f, -1.083f)
            curveTo(8.392f, 7.965f, 8.66f, 7.975f, 8.88f, 8.103f)
            lineToRelative(3.82f, 2.247f)
            lineToRelative(5.6f, -4.2f)
            curveToRelative(0.227f, -0.17f, 0.531f, -0.198f, 0.785f, -0.07f)
            curveTo(19.34f, 6.205f, 19.5f, 6.465f, 19.5f, 6.75f)
            close()
        }
    }.build()
}
