package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Script20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Script20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.563f, 2f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 2f, 4f, 3.12f, 4f, 4.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(2.094f)
            curveTo(11f, 17.198f, 11.895f, 18f, 13f, 18f)
            curveToRelative(1.095f, 0f, 1.985f, -0.787f, 2f, -1.88f)
            verticalLineTo(4.376f)
            horizontalLineToRelative(0.003f)
            curveTo(15.06f, 3.221f, 15.898f, 2.274f, 17f, 2.05f)
            curveTo(16.858f, 2.021f, 16.712f, 2.004f, 16.562f, 2f)
            close()
            moveToRelative(-5.88f, 16f)
            curveTo(10.256f, 17.482f, 10f, 16.818f, 10f, 16.094f)
            verticalLineTo(14f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 14f, 1f, 14.224f, 1f, 14.5f)
            verticalLineToRelative(1.188f)
            curveTo(1f, 17.02f, 2.086f, 18f, 3.375f, 18f)
            horizontalLineToRelative(7.308f)
            close()
            moveTo(18f, 7f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(4.5f)
            curveTo(19f, 3.672f, 18.328f, 3f, 17.5f, 3f)
            reflectiveCurveTo(16f, 3.672f, 16f, 4.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(2f)
            close()
        }
    }.build()
}
