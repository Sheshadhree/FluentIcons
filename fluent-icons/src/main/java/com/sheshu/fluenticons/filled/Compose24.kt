package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Compose24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Compose24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineTo(6.5f)
            curveTo(5.672f, 6f, 5f, 6.672f, 5f, 7.5f)
            verticalLineToRelative(10f)
            curveTo(5f, 18.328f, 5.672f, 19f, 6.5f, 19f)
            horizontalLineToRelative(10f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-10f)
            curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
            verticalLineToRelative(-10f)
            curveTo(3f, 5.567f, 4.567f, 4f, 6.5f, 4f)
            horizontalLineTo(13f)
            close()
            moveToRelative(6.293f, -0.707f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            lineToRelative(-9.586f, 9.586f)
            lineTo(9f, 15f)
            lineToRelative(0.707f, -2.121f)
            lineToRelative(9.586f, -9.586f)
            close()
        }
    }.build()
}
