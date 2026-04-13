package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.RotateLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.RotateLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.854f, 2.853f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(5f, 5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(8.707f, 8f)
            horizontalLineTo(23f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(23f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            horizontalLineTo(8.707f)
            lineToRelative(4.147f, -4.146f)
            close()
            moveToRelative(-9.11f, 11.21f)
            curveTo(3.59f, 13.978f, 3.4f, 13.98f, 3.247f, 14.07f)
            curveTo(3.094f, 14.159f, 3f, 14.322f, 3f, 14.5f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(24.5f)
            curveToRelative(0.227f, 0f, 0.426f, -0.154f, 0.484f, -0.374f)
            curveToRelative(0.057f, -0.22f, -0.041f, -0.451f, -0.24f, -0.562f)
            lineToRelative(-25f, -14f)
            close()
            moveTo(4f, 28f)
            verticalLineTo(15.353f)
            lineTo(26.584f, 28f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
