package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.AlertBadge32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.AlertBadge32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 4f)
            curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
            verticalLineToRelative(4.803f)
            lineToRelative(-1.929f, 4.826f)
            curveToRelative(-0.123f, 0.308f, -0.085f, 0.657f, 0.101f, 0.932f)
            curveTo(5.358f, 23.835f, 5.668f, 24f, 6f, 24f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, 2.217f, 1.783f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.783f, 4f, -4f)
            horizontalLineToRelative(6f)
            curveToRelative(0.332f, 0f, 0.642f, -0.165f, 0.828f, -0.44f)
            curveToRelative(0.186f, -0.274f, 0.224f, -0.623f, 0.1f, -0.931f)
            lineTo(25f, 17.803f)
            verticalLineToRelative(-4.415f)
            curveToRelative(-0.322f, 0.073f, -0.656f, 0.112f, -1f, 0.112f)
            reflectiveCurveToRelative(-0.678f, -0.039f, -1f, -0.111f)
            verticalLineToRelative(4.606f)
            curveToRelative(0f, 0.127f, 0.024f, 0.253f, 0.071f, 0.371f)
            lineTo(24.523f, 22f)
            horizontalLineTo(7.477f)
            lineToRelative(1.452f, -3.634f)
            curveTo(8.976f, 18.248f, 9f, 18.122f, 9f, 17.996f)
            verticalLineTo(13f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            curveToRelative(1.437f, 0f, 2.773f, 0.433f, 3.885f, 1.176f)
            curveToRelative(0.276f, -0.621f, 0.688f, -1.168f, 1.199f, -1.604f)
            curveTo(19.637f, 4.58f, 17.887f, 4f, 16f, 4f)
            close()
            moveToRelative(2f, 20f)
            curveToRelative(0f, 1.112f, -0.888f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.888f, -2f, -2f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(6f, -12f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
        }
    }.build()
}
