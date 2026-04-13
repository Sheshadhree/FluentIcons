package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ImageMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.648f, 0.205f, 1.248f, 0.555f, 1.738f)
            lineToRelative(4.03f, -4.03f)
            curveToRelative(0.782f, -0.782f, 2.048f, -0.782f, 2.83f, 0f)
            lineToRelative(4.03f, 4.03f)
            curveTo(14.795f, 13.248f, 15f, 12.648f, 15f, 12f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(6.5f, 3.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(1.238f, 7.945f)
            lineToRelative(-4.03f, -4.03f)
            curveToRelative(-0.391f, -0.391f, -1.025f, -0.391f, -1.415f, 0f)
            lineToRelative(-4.031f, 4.03f)
            curveTo(4.752f, 14.795f, 5.352f, 15f, 6f, 15f)
            horizontalLineToRelative(6f)
            curveToRelative(0.648f, 0f, 1.248f, -0.205f, 1.738f, -0.555f)
            close()
            moveTo(5.764f, 16f)
            curveToRelative(0.55f, 0.614f, 1.348f, 1f, 2.236f, 1f)
            horizontalLineToRelative(4.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.888f, -0.386f, -1.687f, -1f, -2.236f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.12f, -0.006f, 0.24f, -0.018f, 0.358f)
            curveTo(15.802f, 14.623f, 14.312f, 16f, 12.5f, 16f)
            horizontalLineTo(5.764f)
            close()
        }
    }.build()
}
