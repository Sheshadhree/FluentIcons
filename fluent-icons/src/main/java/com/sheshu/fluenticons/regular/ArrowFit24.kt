package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.762f, 7.452f)
            curveToRelative(0.303f, 0.282f, 0.319f, 0.757f, 0.036f, 1.06f)
            lineTo(4.476f, 11f)
            horizontalLineToRelative(5.774f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(4.476f)
            lineToRelative(2.322f, 2.488f)
            curveToRelative(0.283f, 0.303f, 0.266f, 0.778f, -0.036f, 1.06f)
            curveToRelative(-0.303f, 0.283f, -0.778f, 0.267f, -1.06f, -0.036f)
            lineToRelative(-3.5f, -3.75f)
            curveToRelative(-0.27f, -0.288f, -0.27f, -0.736f, 0f, -1.024f)
            lineToRelative(3.5f, -3.75f)
            curveToRelative(0.282f, -0.303f, 0.757f, -0.319f, 1.06f, -0.036f)
            close()
            moveToRelative(10.476f, 0f)
            curveToRelative(-0.303f, 0.282f, -0.319f, 0.757f, -0.036f, 1.06f)
            lineTo(19.524f, 11f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 11f, 13f, 11.336f, 13f, 11.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.774f)
            lineToRelative(-2.322f, 2.488f)
            curveToRelative(-0.283f, 0.303f, -0.267f, 0.778f, 0.036f, 1.06f)
            curveToRelative(0.303f, 0.283f, 0.778f, 0.267f, 1.06f, -0.036f)
            lineToRelative(3.5f, -3.75f)
            curveToRelative(0.27f, -0.288f, 0.27f, -0.736f, 0f, -1.024f)
            lineToRelative(-3.5f, -3.75f)
            curveToRelative(-0.282f, -0.303f, -0.757f, -0.319f, -1.06f, -0.036f)
            close()
        }
    }.build()
}
