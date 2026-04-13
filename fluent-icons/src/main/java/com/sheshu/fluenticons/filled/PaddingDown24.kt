package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PaddingDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaddingDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            curveTo(4.448f, 2f, 4f, 2.448f, 4f, 3f)
            close()
            moveToRelative(0f, 18f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(5.25f, 0f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-1.75f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
            moveToRelative(1.457f, -7.293f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0f, -1.414f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            lineTo(11f, 15.586f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(9.586f)
            lineToRelative(3.293f, -3.293f)
            curveToRelative(0.39f, -0.39f, 1.024f, -0.39f, 1.414f, 0f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            close()
        }
    }.build()
}
